package edunova;

import javax.swing.JOptionPane;

public class Vjezba1 {
	public static void main(String[] args) {
		
		// Unesite 5 brojeva i provjerite jesu li djeljivi sa 2, ako jesu ispišite ih
		
		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Prvi broj:"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Drugi broj:"));
		int treci = Integer.parseInt(JOptionPane.showInputDialog("Treci broj:"));
		int cetvrti = Integer.parseInt(JOptionPane.showInputDialog("Cetvrti broj:"));
		int peti = Integer.parseInt(JOptionPane.showInputDialog("Peti broj:"));
		
		System.out.print("Brojevi djeljivi sa 2 su:");
		
		if(prvi % 2 == 0) {
			System.out.print(" " + prvi);
		}
		if(drugi % 2 == 0) {
			System.out.print(" " + drugi);
		}
		if(treci % 2 == 0) {
			System.out.print(" " + treci);
		}
		if(cetvrti % 2 == 0) {
			System.out.print(" " + cetvrti);
		}
		if(peti % 2 == 0) {
			System.out.print(" " + peti);
		}
		
	}
}
