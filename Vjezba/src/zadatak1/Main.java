package zadatak1;

import javax.swing.JOptionPane;

/*1. 		 Korisnik poga�a vrijednost broja definiranog u programu (mo�e biti predefiniran, kao
			 konstanta). Ra�unalo mu vra�a poruke ve�i/manji dok god ga ne pogodi. Kada ga pogodi,
			 ispi�e mu broj poku�aja (npr. �Bravo! Pogodio/la si broj zadan u programu, trebalo ti je 7
			 poku�aja�).
*/

public class Main {

	public static void main(String[] args) {

		int broj = 5;
		int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Pogodite predefinirani broj:"));
		int brojac = 0;
		
		while(true) {
			if(broj1 < broj) {
				brojac++;
				broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite ve�i broj od prethodno une�enog:"));
			}else if(broj1 > broj) {
				brojac++;
				broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite manji broj od prethodno une�enog:"));
			}else {
				break;
			}
		}
		System.out.println("Bravo! Pogodio/la si broj zadan u programu, trebalo ti je " + brojac + " poku�aja.");
	}
}
