package edunova;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Start {
	
	public static final String FORMAT_DATUMA = "dd.MM.yyyy. HH:mm";
	
	public Start() {
		
		logIn();
		
	}
	
	private void logIn() {
		
		Vozac vozac = new Vozac();
		Vozi vozi = new Vozi();
		
		vozac.setIme(JOptionPane.showInputDialog("Unesite ime:"));
		vozac.setPrezime(JOptionPane.showInputDialog("Unesite prezime"));
		while(true) {
			try {
				vozac.setSifra(Integer.parseInt(JOptionPane.showInputDialog("Unesite šifru")));
				JOptionPane.showMessageDialog(null, "Pristup odobren! Dobar dan " + vozac.getIme().trim() + " " + vozac.getPrezime().trim() + "!");
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Pristup odbijen!");
				continue;
			}
		}
		SimpleDateFormat df = new SimpleDateFormat(FORMAT_DATUMA);
		System.out.println("Vrijeme pocetka smjene");
		vozi.setVrijemePocetka(new Date(FORMAT_DATUMA));
		System.out.println(vozi.getVrijemePocetka());
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
