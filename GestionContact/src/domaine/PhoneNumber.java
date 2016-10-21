package domaine;


public class PhoneNumber {
	private long idPhoneNumber;
	private String phoneKind;
	private String phoneNumber;
	private Contact contacts;
	
	public PhoneNumber() {}
	public PhoneNumber(String phoneKind, String phoneNumber) {
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
	}
	
	public long getIdPhoneNumber() {
		return idPhoneNumber;
	}
	
	public void setIdPhoneNumber(long idPhoneNumber) {
		this.idPhoneNumber = idPhoneNumber;
	}
	
	public String getPhoneKind() {
		return phoneKind;
	}
	
	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Contact getContacts() {
		return contacts;
	}
	
	public void setContacts(Contact contacts) {
		this.contacts = contacts;
	}
	
	

}
