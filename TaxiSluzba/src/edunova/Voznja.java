package edunova;

public class Voznja extends Vozi{

	private int cijena;
	private String adresaPolazista;
	private String adresaOdredista;
	private String brojMob;
	private int brojPutnika;
	
	public int getCijena() {
		return cijena;
	}
	public void setCijena(int cijena) {
		this.cijena = cijena;
	}
	public String getAdresaPolazista() {
		return adresaPolazista;
	}
	public void setAdresaPolazista(String adresaPolazista) {
		this.adresaPolazista = adresaPolazista;
	}
	public String getAdresaOdredista() {
		return adresaOdredista;
	}
	public void setAdresaOdredista(String adresaOdredista) {
		this.adresaOdredista = adresaOdredista;
	}
	public String getBrojMob() {
		return brojMob;
	}
	public void setBrojMob(String brojMob) {
		this.brojMob = brojMob;
	}
	public int getBrojPutnika() {
		return brojPutnika;
	}
	public void setBrojPutnika(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}
}