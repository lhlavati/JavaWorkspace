package edunova;

public class Student2 {
	
	String ime;
	String prezime;
	String oib;
	
	void insertRecord(String ime, String prezime, String oib) {
		this.ime = ime;
		this.prezime = prezime;
		this.oib = oib;
	}
	void displayInformation() {
		System.out.println(ime + " " + prezime + " " + oib);
	}
}
