package services;


import dao.DAOContact;
import domaine.Adresse;
import domaine.Contact;
import domaine.ContactGroup;
import domaine.PhoneNumber;

public class ContactService {
	
	public ContactService() {}

	public boolean createContact(Contact contact, PhoneNumber phone, Adresse adresse, ContactGroup group) {
		boolean isCreated = false;
		DAOContact daoContact = new DAOContact();
		Contact contactCreated = daoContact.createContact(contact, phone, adresse,group);
		if(contactCreated != null) {
			isCreated = true;
		}
		else
			System.out.print("Un contact avec le meme identifiant exist déjà dans la base");
		
		return isCreated;
	}

}
