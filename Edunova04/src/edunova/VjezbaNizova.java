package edunova;

import javax.swing.JOptionPane;

public class VjezbaNizova {

	public static void main(String[] args) {

		System.out.println("Zadatak1\n");
		// Učitati članove niza. Ispisati članove niza sa neparnim ideksom.
		int clanovi = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj članova niza:"));
		int niz[] = new int[clanovi];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesite clanove niza:"));
		}
		for (int i = 0; i < niz.length; i++) {
			if(i % 2 != 0) {
				System.out.println(niz[i]);
			}
		}
	}
}
