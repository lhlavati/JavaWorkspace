package edunova;

import javax.swing.JOptionPane;

public class VjezbaForPetlje {

	public static void main(String[] args) {
		
		System.out.println("ZADATAK 1\n");
		// Prebrojati prirodne brojeve u intervalu od k do n koji su djeljivi sa a.
		
		int k = Integer.parseInt(JOptionPane.showInputDialog("Unesite k:"));
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesite n:"));
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite a:"));
		
		for (int i = k; i < n; i++) {
			if(i % a == 0) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println("\n");
		System.out.println("\nZADATAK 2\n");
		// Izračunati aritmetičku sredinu prirodnih brojeva od 1 do b koji nisu djeljivi sa 7. 
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite n:"));
		int broj = 0, c = 0;
		for (int i = 1; i < b; i++) {
			if(i % 7 != 0) {
				c += i;
				broj++;
			}
		}
		int sredina = c / broj;
		System.out.println(sredina);
		
		System.out.println("\nZADATAK 3\n");
		// Napisati program za ispis pravouglog trougla kao na slici sa željenim brojem redova
		
//		 	x
//		 	x x
//		 	x x x
//		 	x x x x
//		 	x x x x x
//		 	x x x x x x
//		 	x x x x x x x
		  	
		for(int i = 1; i <= 7; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("x ");	
			}
			System.out.println();
		}	
	}
}
