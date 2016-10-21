package domaine;

public class Adresse {
	private long idAdresse;
	private String street;
	private String city;
	private String zip;
	private String country;
	
	public Adresse() {
		
	}
    public Adresse(String street, String city, String zip, String country) {
    	this.street = street;
    	this.city = city;
    	this.zip = zip;
    	this.country = country;		
	}
	public long getIdAdresse() {
		return idAdresse ;
	}
	public void setIdAdresse(long idAdresse) {
		this.idAdresse = idAdresse;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
