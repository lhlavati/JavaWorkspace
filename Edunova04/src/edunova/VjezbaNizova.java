package edunova;

import javax.swing.JOptionPane;

public class VjezbaNizova {

	public static void main(String[] args) {

//		System.out.println("Zadatak1\n");
//		// Učitati članove niza. Ispisati članove niza sa neparnim ideksom.
//		int clanovi = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj članova niza:"));
//		int niz[] = new int[clanovi];
//
//		for (int i = 0; i < niz.length; i++) {
//			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesite clanove niza:"));
//		}
//		for (int i = 0; i < niz.length; i++) {
//			if(i % 2 != 0) {
//				System.out.println("Niz[" + i + "] = " + niz[i]);
//			}
//		}
//		
//		System.out.println("\nZadatak2\n");
//		// Učitati članove niza. Izračunati i ispisati aritmetičku sredinu onih clanova niza koji su veći od aritmeticke sredine svih članova niza.
//		int clanovi = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj članova niza:"));
//		int niz[] = new int[clanovi];
//		
//		for(int i = 0; i < niz.length; i++) {
//			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesite članove niza:"));
//		}
//		double asSvih;
//		double asVecih;
//		double zbroj = 0;
//		double brojac = 0;
//		
//		for(int i = 0; i < niz.length; i++) {
//			 zbroj += niz[i]; 
//			 brojac++;
//		}
//		asSvih = zbroj / brojac;
//		System.out.println("Aritmeticka sredina svih članova niza: " + asSvih);
//		
//		double zbroj1 = 0;
//		double brojac1 = 0;
//		for(int i = 0; i < niz.length; i++) {
//			if(niz[i] > asSvih) {
//				zbroj1 += niz[i]; 
//				brojac1++;
//			}
//		}
//		asVecih = zbroj1 / brojac1;
//		System.out.println("Aritmeticka sredina članova većih od aritmetičke sredine svih članova niza: " + asVecih);
//		
//		System.out.println("\nZadatak3\n");
//		//Učitati članove niza. Izračunati aritmetičku sredinu i ispisati sumu članova niza manjih od aritmetičke sredine sa neparnim indeksom.
//		int clanovi = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj članova niza:"));
//		int niz[] = new int[clanovi];
//		
//		double as;
//		double suma = 0;
//		double zbroj = 0;
//		double brojac = 0;
//		for (int i = 0; i < niz.length; i++) {
//			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesite članove:"));
//		}
//		
//		for (int i = 0; i < niz.length; i++) {
//			zbroj += niz[i];
//			brojac++;
//		}
//		as = zbroj / brojac;
//		System.out.println("Aritmetička sredina niza: " + as);
//
//		for (int i = 0; i < niz.length; i++) {
//			if(niz[i] < as && i % 2 != 0) {
//				suma += niz[i];
//			}
//		}
//		System.out.println("Suma članova niza manjih od aritmetičke sredine s neparnim indeksima je: " + suma);
//		
		System.out.println("\nZadatak4\n");
		// Učitati članove i naći najmanji član niza.
		 
		int clanovi = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj clanova niza:"));
		
		int[] niz = new int [clanovi];
		
		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesite clanove niza"));
		}
		int min = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if(min > niz[i]) {
				min = niz[i];
			}
		}
		System.out.println("Najmanji član niza je: " + min);
		
		System.out.println("\nZadatak5\n");
	}
}
