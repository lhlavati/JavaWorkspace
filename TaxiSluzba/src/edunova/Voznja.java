package edunova;

import java.util.Date;

public class Voznja{

	private int sifra;
	private int cijena;
	private Date pocetakVoznje;
	private Date krajVoznje;
	private String adresaPolazista;
	private String adresaOdredista;
	private String brojMob;
	private int brojPutnika;
	private int vozi;
	
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public Date getPocetakVoznje() {
		return pocetakVoznje;
	}
	public void setPocetakVoznje(Date pocetakVoznje) {
		this.pocetakVoznje = pocetakVoznje;
	}
	public Date getKrajVoznje() {
		return krajVoznje;
	}
	public void setKrajVoznje(Date krajVoznje) {
		this.krajVoznje = krajVoznje;
	}
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
	public int getVozi() {
		return vozi;
	}
	public void setVozi(int vozi) {
		this.vozi = vozi;
	}

}
