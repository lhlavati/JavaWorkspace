package edunova;

public class Vozilo {

	private int sifra;
	private String marka;
	private String snaga;
	private int abs;
	private String godiste;
	private int brojVozila;
	
	public Vozilo() {}

	public Vozilo(String marka, int brojVozila) {
		this.marka = marka;
		this.brojVozila = brojVozila;
	}

	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getSnaga() {
		return snaga;
	}
	public void setSnaga(String snaga) {
		this.snaga = snaga;
	}
	public int getAbs() {
		return abs;
	}
	public void setAbs(int abs) {
		this.abs = abs;
	}
	public String getGodiste() {
		return godiste;
	}
	public void setGodiste(String godiste) {
		this.godiste = godiste;
	}
	public int getBrojvozila() {
		return brojVozila;
	}
	public void setBrojvozila(int brojvozila) {
		this.brojVozila = brojvozila;
	}

	@Override
	public String toString() {
		return "Broj vozila: " + this.brojVozila + ", " + this.marka;
	}
	
}
