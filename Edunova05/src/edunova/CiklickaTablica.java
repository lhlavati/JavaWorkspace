package edunova;

import javax.swing.JOptionPane;

public class CiklickaTablica {

	
	
	public static void main(String[] args) {
		
		int r = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka matrice: "));
		int k = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj kolona matrice: "));
		
		int [][] m = new int [r][k];
		
		// ispisivanje prazne matrice
		for (int i = 0; i < r; i++) { 
			for (int j = 0; j < k; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		int maxBroj = (r * k);
		int broj = 1;
		r--;
		k--;
		m[r][k] = 1;
		
		while (broj < maxBroj) {
			
			while (m[r][k] == 1 && k >= 0) {
				m[r][k--] = broj++;
			}
			while (r >= 0) {
				m[r--][k] = broj++;
			}
			while (k <= k) {
				m[r][k++] = broj++;
			}
			while (r <= r) {
				m[r++][k] = broj++;
			}
			r--;
			k--;
			
		}
	}
}
