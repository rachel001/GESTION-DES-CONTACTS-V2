package domaine;

import java.util.HashSet;
import java.util.Set;

public class Contact {
	private long idContact;
	private String firstName;
	private String lastName;
	private String email;
	private Adresse adresse;
	private Set<PhoneNumber> phones = new HashSet<PhoneNumber>();;
	public Set<ContactGroup> books = new HashSet<ContactGroup>();

	public Contact() {}
	public Contact(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public long getIdContact() {
		return idContact;
	}

	public void setIdContact(long idContact) {
		this.idContact = idContact;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Set<ContactGroup> getBooks() {
		return books;
	}
	
	public void setBooks(Set<ContactGroup> books) {
		this.books = books;
	}
	
	public Set<PhoneNumber> getPhones() {
		return phones;
	}
	
	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}

}
