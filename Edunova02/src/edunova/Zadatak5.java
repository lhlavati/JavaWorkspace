package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {

	public static void main(String[] args) {
		
		// Unijeti logi�ku vrijednost i ispisati je
		
		boolean vrijednost = Boolean.parseBoolean(JOptionPane.showInputDialog("Logi�ka vrijednost:"));
		
			System.out.println(vrijednost);
		
	}
}
