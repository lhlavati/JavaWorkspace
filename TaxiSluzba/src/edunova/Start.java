package edunova;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {
	
	List<Vozilo> vozila = new ArrayList<>();
	
	public Start() {
		
		logIn();
		
	}
	
	private int brojVozila() {
		int rb;
		while(true) {
			rb= Integer.parseInt(JOptionPane.showInputDialog("Unesite broj vašeg vozila"));
			if(rb>vozila.size()) {
				JOptionPane.showMessageDialog(null, "Obavezno odabir ponuðenih vozila");
				continue;
			}
			return rb;
		}
	}
	
	private void ispisVozila() {
	
		System.out.println("\nIspis vozila");
		for (Vozilo vozilo : vozila) {
			System.out.println(vozilo);
		}
		System.out.println("");
		
	}
	
	private void dodajVozilo() {
	
		vozila.add(new Vozilo("Škoda", 1));
		vozila.add(new Vozilo("Dacia", 2));
		vozila.add(new Vozilo("Citroen", 3));
		vozila.add(new Vozilo("Ford", 4));
		
		ispisVozila();
		Vozilo vo = vozila.get(brojVozila()-1);
		JOptionPane.showMessageDialog(null, "Vozite se vozilom " + vo.getMarka() + ", broj vozila: " + vo.getBrojvozila() + "\nUgodnu voznju Vam želimo!  :)");

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
				dodajVozilo();
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Pristup odbijen!");
				continue;
			}
		}
		
		System.out.println("Vrijeme pocetka smjene");
		System.out.println( new SimpleDateFormat("HH:mm:ss dd.MM.yyyy.").format(Calendar.getInstance().getTime()) );
		vozi.setVrijemePocetka(new Date());
		System.out.println(vozi.getVrijemePocetka());

	}
	
	public static void main(String[] args) {
		new Start();
	}
}
