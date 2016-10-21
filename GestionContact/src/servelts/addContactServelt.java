package servelts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.util.Util.Displayable;

import services.ContactService;

/**
 * Servlet implementation class addContactServelt
 */
public class addContactServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addContactServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long idContact = 0;
		String message = null;
		doGet(request, response);
		String firstName = request.getParameter("nom");
		String lastName = request.getParameter("prenom");
		String age =  request.getParameter("age");
		String email =  request.getParameter("email");
		String ville = request.getParameter("ville");
		String pays = request.getParameter("pays");
		
		if(firstName !="" && lastName !="" && age !="" && email !="" && ville !="" && pays !="") {
			ContactService contactService = new ContactService();
			boolean isContactCreated = contactService.createContact(idContact, 
					firstName, lastName, age, email, ville, pays);
			if (isContactCreated){
				response.setContentType("text/html");
				message = "Le Contact : "+firstName+ " " +lastName+ ", a bien été enregistré";
				//displayMessage(message, response);
			}
			else{
				message = "Un problème est survenu lors de la création du contact";
				request.setAttribute("Message", message);
				RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
				rd.forward(request, response);
			}
		}else { 
			message = "les champs ne doivent pas être vides!!";
			//displayMessage(message, response);
			
		}
	}

}
