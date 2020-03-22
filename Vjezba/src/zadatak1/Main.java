package zadatak1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Ucitajte broj clanova niza: ");
		int n = input.nextInt();
		int niz[] = new int[n];
		System.out.println("Ucitajte clanove niza:");
		for (int i = 0; i < n; i++) {
			niz[i] = input.nextInt();
		}
		int suma = 0;
		while(suma < 200) {
			for (int i = 0; i < niz.length; i++) {
				if(suma >= 200) {
					break;
				}
				if(niz[i] % 2 == 0) {
					suma += niz[i];
				}
			}
		}
		System.out.println("Suma pozitivnih elemenata niza: " + suma);
		
	}
}
