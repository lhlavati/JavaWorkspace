package zadatak1;

import javax.swing.JOptionPane;

/*1. 		 Korisnik pogaða vrijednost broja definiranog u programu (može biti predefiniran, kao
			 konstanta). Raèunalo mu vraæa poruke veæi/manji dok god ga ne pogodi. Kada ga pogodi,
			 ispiše mu broj pokušaja (npr. “Bravo! Pogodio/la si broj zadan u programu, trebalo ti je 7
			 pokušaja”).
*/

public class Main {

	public static void main(String[] args) {

		int broj = 5;
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Pogodite predefinirani broj:"));
		int brojac = 0;
		
		while(true) {
			if(broj1 < broj) {
				brojac++;
				broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite veæi broj od prethodno unešenog:"));
			}else if(broj1 > broj) {
				brojac++;
				broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite manji broj od prethodno unešenog:"));
			}else {
				break;
			}
		}
		System.out.println("Bravo! Pogodio/la si broj zadan u programu, trebalo ti je " + brojac + " pokušaja.");
	}
}
