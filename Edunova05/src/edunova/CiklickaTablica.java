package edunova;

import javax.swing.JOptionPane;

public class CiklickaTablica {

	
	
	public static void main(String[] args) {
		
		int r = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka matrice: "));
		int k = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj kolona matrice: "));
		
		int [][] m = new int [r][k];
		
		int maxBroj = (r * k);
		r--;
		k--;
		int broj = 1;
		int rMin = 0;
		int rMax = r;
		int kMin = 0;
		int kMax = k;
		
		
		while (broj < maxBroj) {
			
			while (r == rMax && k > kMin) { // lijevo
				m[r][k--] = broj++;			 // m [4][4--] = 1++; ... m[4][0] = 5;
			}
			while (r > rMin) {				 // gore
				m[r--][k] = broj++;			 // m[4--][0] = 5; ... m[0][0] = 9;
			}
			while (k < kMax) {				 // desno
				m[r][k++] = broj++;			 // m[0][0++] = 9; ... m[0][4] = 13;
			}
			while (r < rMax - 1) {				// dolje
				m[r++][k] = broj++;			// m[0++][4] = 13; ... m[3][4] = 16;
			}
			rMin++;
			rMax--;
			kMin++;
			kMax--;
			
			
			
		}
		r += 3;
		k += 3;
		
		for (int i = 0; i < r; i++) { 
			if(i < 5) {
				System.out.println(" ");
			}
			for (int j = 0; j < k; j++) {
				System.out.print(m[i][j] + "    ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
