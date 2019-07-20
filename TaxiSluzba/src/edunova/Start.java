package edunova;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Start {
	
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
		Date now = new Date();
		System.out.println("Vrijeme pocetka smjene");
		System.out.println( new SimpleDateFormat("HH:mm:ss dd.MM.yyyy.").format(Calendar.getInstance().getTime()) );
		vozi.setVrijemePocetka(now);
		System.out.println(vozi.getVrijemePocetka());
	}
	
	public static void main(String[] args) {
		new Start();
	}
}
