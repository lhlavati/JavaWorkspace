package edunova;

import javax.swing.JOptionPane;

public class VjezbaIfElsePetlje {

	public static void main(String[] args) {
		
		System.out.println("    ZADATAK 1    \n");
		// Učitati dva broja veći se množi za 2 a manji dijeli sa 3
		double prvi = Double.parseDouble(JOptionPane.showInputDialog("Unesite prvi broj:"));
		double drugi = Double.parseDouble(JOptionPane.showInputDialog("Unesite drugi broj:"));
		
		if(prvi > drugi) {
			prvi *= 2;
			drugi /= 3;
			System.out.println("Veći broj pomnožen sa 2: " + prvi + "\nManji broj podjeljen sa 3: " + drugi);
		}else {
			drugi *= 2;
			prvi /= 3;
			System.out.println("Veći broj pomnožen sa 2: " + drugi + "\nManji broj podjeljen sa 3: " + prvi);
		}
		
		System.out.println("\n    ZADATAK 2    \n");
		// 	Učitati dva broja. Ako je jedan veći od nule ispisati "Barem je jedan broj veći od 0" inače ispisati sumu oba broja.
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj:"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj:"));
		
		if(prviBroj > 0 || drugiBroj > 0) {
			System.out.println("Barem je jedan broj veći od 0");
		}else {
			int suma = prviBroj + drugiBroj;
			System.out.println("Suma dva broja je: " + suma);
		}
	}
}
