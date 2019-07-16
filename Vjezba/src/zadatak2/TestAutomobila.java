package zadatak2;

public class TestAutomobila {

	private String naziv;
	private double potrosioGoriva;
	private double prijedenPut;
	
	public TestAutomobila(String naziv, double potrosioGoriva) {
		this.naziv = naziv;
		this.potrosioGoriva = potrosioGoriva;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getPotrosioGoriva() {
		return potrosioGoriva;
	}
	public void setPotrosioGoriva(double potrosioGoriva) {
		this.potrosioGoriva = potrosioGoriva;
	}
	public double getPrijedenPut() {
		return prijedenPut;
	}
	public void setPrijedenPut(double prijedenPut) {
		this.prijedenPut = prijedenPut;
	}
	
}
