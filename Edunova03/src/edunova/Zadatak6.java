package edunova;

import javax.swing.JOptionPane;

public class Zadatak6 {

	
	public static void main(String[] args) {
		
		// Program unosi cijeli broj
		// Program ispisuje apsolutnu vrijednost broja
		
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj"));
		System.out.println(Math.abs(broj));
		// drugi naèin
		
		System.out.println(broj >= 0 ? broj : Math.abs(broj));
	}
}
