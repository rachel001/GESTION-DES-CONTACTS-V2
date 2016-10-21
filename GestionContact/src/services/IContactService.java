package services;

public interface IContactService {
	public boolean createContact(long idContact, String firstName, String 
			lastName, String age, String email, String ville, String pays);

}
