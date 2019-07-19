package edunova;

public class Vozac {

	private int sifra;
	private String ime;
	private String prezime;
	private String oib;
	private String spol;
	
	public Vozac() {}
	
	public Vozac(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	public String getSpol() {
		return spol;
	}
	public void setSpol(String spol) {
		this.spol = spol;
	}
	
	@Override
	public String toString() {
		return this.ime + " " + this.prezime;
	}
	
	public static boolean provjeraOib(String oib) {
		if (oib.length() != 11)
			return false;

		try {
			Long.parseLong(oib);
		} catch (NumberFormatException e) {
			return false;
		}

		int a = 10;
		for (int i = 0; i < 10; i++) {
			a = a + Integer.parseInt(oib.substring(i, i + 1));
			a = a % 10;
			if (a == 0)
				a = 10;
			a *= 2;
			a = a % 11;
		}
		int kontrolni = 11 - a;
		if (kontrolni == 10)
			kontrolni = 0;

		return kontrolni == Integer.parseInt(oib.substring(10));
	}
}
