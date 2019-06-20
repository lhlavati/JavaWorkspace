package edunova;

import javax.swing.JOptionPane;

public class VjezbaSwitchCase {

	public static void main(String[] args) {
		
		System.out.println("    ZADATAK 1    \n");
		// Napisati program koji za upisani samoglasnik (veliko slovo) ispisuje redni broj samoglasnika u abecedi, prema slijedećoj tabeli:
		// 'A'   1
		// 'E'   5
		// 'I'   9
		// 'O'   15
		// 'U'   20
		
		String str = JOptionPane.showInputDialog("Unesite jedan samoglasnik velikim slovom:");
		char slovo = str.charAt(0);
		
		switch(slovo) {
		case 'A':
			System.out.println("       " +1);
			break;
		case 'E':
			System.out.println("       " +5);
			break;
		case 'I':
			System.out.println("       " +9);
			break;
		case 'O':
			System.out.println("       " +15);
			break;
		case 'U':
			System.out.println("       " +20);
			break;
		default:
			System.out.println("    Pogreška! \nMolimo unesite samoglasnik \n  VELIKIM slovima!");
		}
	}
}
