package edunova;

import javax.swing.JOptionPane;

public class Vjezba4 {
	// Za uèitanu ocjenu sa tastature (1-5) ispisati uspjeh. Ispis se izvodi u metodi.
	public static void ispisUspjeha (int ocjena) {
		switch(ocjena) {
		case 1:
			System.out.println("Nedovoljan");
			break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 4:
			System.out.println("Vrlo dobar");
			break;
		case 5:
			System.out.println("Odlièan");
			break;
		}
	}
	public static void main(String[] args) {
		ispisUspjeha(5);
	}
}
