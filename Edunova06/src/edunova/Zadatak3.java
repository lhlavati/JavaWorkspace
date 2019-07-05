package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	// napi�ite metodu koja prima dvodimenzinalni niz (matrica)
	// metoda vra�a nazad sumu svih elemenata tog niza

	public static void main(String[] args) {
		int[][] niz = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(suma(niz));
	}
	
	private static int suma(int [][] niz) {
		int suma = 0;
		for(int i = 0; i < niz.length; i++) {
			for(int j = 0; j < niz.length; j++) {
				suma += niz[i][j];
			}
		}
		
		return suma;
	}
}
