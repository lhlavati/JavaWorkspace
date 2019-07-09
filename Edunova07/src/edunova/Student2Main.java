package edunova;

public class Student2Main {
		// Kreirati dva objekta klase Student2 i inicijalizirati vrijednost ovih objekata pozivajuæi metod insertRecord. 
		// Ispis izvesti pozivom metoda displayInformation. Klasa i main su u dva fajla.
	public static void main(String[] args) {
		
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		
		s1.insertRecord("Luka", "Hlavati", "41533626283");
		s1.displayInformation();
		s2.insertRecord(null, "Hlavati", "34257918739");
		s2.displayInformation();
	}
}
