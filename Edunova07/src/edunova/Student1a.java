package edunova;

/*  Zadatak 1:	
 	Klasa Student1a sadrži String ime i int starost. Kreirati dva objekta s1 i s2 klase Student1a. 
	Inicirati vrijednosti u main s1.ime = "Marko", s2.ime = "Luka" i s2.starost = 21.
*/
public class Student1a {

	String ime;
	int starost;
	
	public static void main(String[] args) {
		
		Student1a s1 = new Student1a();
		Student1a s2 = new Student1a();
		
		s1.ime = "Marko";
		s2.ime = "Luka";
		s2.starost = 21;
		
		System.out.println("ime = " + s1.ime + ", starost = " + s1.starost);
		System.out.println("ime = " + s2.ime + ", starost = " + s2.starost);
	
	}
}
