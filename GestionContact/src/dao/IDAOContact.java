package dao;

import java.util.ArrayList;

import entity.Contact;

public interface IDAOContact {
	public Contact createContact(Contact contact);
	public boolean deleteContact(Contact contact);
	public Contact updateContact(Contact contact);
	public Contact findContactById(long id);
	public ArrayList<Contact> findContactByLastName(String lastName);
	public ArrayList<Contact> findContactByEmail(String email);

}
