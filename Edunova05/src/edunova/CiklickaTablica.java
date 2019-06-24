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
		
	}
}
