package servelts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domaine.Adresse;
import domaine.Contact;
import domaine.ContactGroup;
import domaine.PhoneNumber;
import services.ContactService;

/**
 * Servlet implementation class AddContactServelt
 */
/*@WebServlet("/AddContact")*/
public class AddContactServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message = null;
		doGet(request, response);
		String firstName = request.getParameter("firstname");
		String lastName= request.getParameter("lastname");
		String email =  request.getParameter("email");
		if(firstName !="" && lastName !="" && email !=""){
			Contact contact = new Contact(firstName, lastName, email);
			
			String groupName = request.getParameter("groupName");
		    ContactGroup group = new ContactGroup(groupName);
		    
			contact.getBooks().add(group);
		
		    String street = request.getParameter("street");
		    String city = request.getParameter("city");
		    String zip = request.getParameter("zip");
		    String country = request.getParameter("country");
		    Adresse adresse = new Adresse(street, city, zip, country );
		//System.out.println("Adresse "+ adresse.getCity()+" , "+ adresse.getCountry());
		    
		    contact.setAdresse(adresse);
		    
		    String phoneKind = request.getParameter("phoneKind");
		    String phoneNumber = request.getParameter("phoneNumber");
		    PhoneNumber phone= new PhoneNumber(phoneKind, phoneNumber);
		    phone.setContacts(contact);
		    PhoneNumber phone1= new PhoneNumber(phoneKind, phoneNumber);
		    phone1.setContacts(contact);
		//System.out.println("PHONE "+ phone.getPhoneKind()+" , "+ phone.getPhoneNumber());
		   
			contact.getPhones().add(phone);
			
			ContactService contactService = new ContactService();
			boolean isContactCreated = contactService.createContact(contact, phone, adresse, group);
			if (isContactCreated){
				response.setContentType("text/html");
			    message="Le Contact :"+firstName + " " +lastName +", a bien été enregistré";
			    displayMessage(message, response);
			}
			else{
				message="Un problème est survenu lors de la création du contact";
			    request.setAttribute("Message", message);
			    RequestDispatcher rd = request.getRequestDispatcher("Error.jsp" );
			    rd.forward(request, response);
			}
			}else{
				message="Les champs ne doivent pas être vides!!";
			    displayMessage(message, response);
			}
	}
	
	private void displayMessage(String message, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.print("servelt :"+message);
	}

}
