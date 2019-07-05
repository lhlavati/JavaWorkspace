package edunova;

public class Vjezba3 {
	// Metoda povrsina raèuna i vraæa u main povrsinu pravokutnika (a*b). Main poziva metodu povrsina(a,b), 
	// a zatim je ispis površine pravokutnika iz main za svaki od 3 para vrijednosti.
	public static int povrsina(int a, int b) {
		int povrsina;
		povrsina = a*b;
		return povrsina;
	}
	public static void main(String[] args) {
		
		System.out.println("Povrsina pravokutnika je: " + povrsina(1,2));
		System.out.println("Povrsina pravokutnika je: " + povrsina(3,4));
		System.out.println("Povrsina pravokutnika je: " + povrsina(5,6));
		
	}
}
