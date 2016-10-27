package dao;

import java.util.ArrayList;

import org.hibernate.Session;

import util.HibernateUtil;
import domaine.Adresse;
import domaine.Contact;
import domaine.ContactGroup;
//import domaine.PhoneNumber;
import domaine.PhoneNumber;

public class DAOContact {
	private Contact createdContact;

	public Contact createContact(Contact contact, PhoneNumber phone, Adresse adresse, ContactGroup group) {
		//Obtention d’une session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//démarrer une transaction
		session.beginTransaction();
		//persister l’objet
		
		session.save(adresse);
		session.save(contact);
		session.flush();
		//recharger l’objet à partir de la session
		createdContact = (Contact) session.load(Contact.class,
		contact.getIdContact());
		//committer la transaction
		session.getTransaction().commit();
		
		
		return createdContact;
	}

	public boolean deleteContact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact findContactById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Contact> findContactByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Contact> findContactByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
