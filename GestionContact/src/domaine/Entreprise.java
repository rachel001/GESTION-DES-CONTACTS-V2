package domaine;

public class Entreprise extends Contact {
	private Integer numSiret;
	
	private Entreprise() {}
	private Entreprise(Integer numSiret) {}

	private Integer getNumSiret() {
		return numSiret;
	}

	private void setNumSiret(Integer numSiret) {
		this.numSiret = numSiret;
	}
	

}
