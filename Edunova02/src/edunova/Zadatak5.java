package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {

	public static void main(String[] args) {
		
		// Unijeti logièku vrijednost i ispisati je
		
		boolean vrijednost = Boolean.parseBoolean(JOptionPane.showInputDialog("Logièka vrijednost:"));
		
		System.out.println(vrijednost);
		
		
		/*String unos = JOptionPane.showInputDialog("Logièka vrijednost:");
		
		if (unos == "true" || unos == "false") {
			boolean vrijednost = Boolean.parseBoolean(unos);
			System.out.println(vrijednost);
		}else {
			JOptionPane.showMessageDialog(null, "Pogreška!");
		}
		*/
	}
}
