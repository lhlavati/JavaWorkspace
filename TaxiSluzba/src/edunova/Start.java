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
		int bv;
		while(true) {
			bv= Integer.parseInt(JOptionPane.showInputDialog("Unesite broj va�eg vozila"));
			if(bv>vozila.size() || bv == 0) {
				JOptionPane.showMessageDialog(null, "Obavezan odabir ponu�enih vozila");
				continue;
			}
			return bv;
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
	
		vozila.add(new Vozilo("�koda", 1));
		vozila.add(new Vozilo("Dacia", 2));
		vozila.add(new Vozilo("Citroen", 3));
		vozila.add(new Vozilo("Ford", 4));
		
		ispisVozila();
		Vozilo vo = vozila.get(brojVozila()-1);
		JOptionPane.showMessageDialog(null, "Vozite se vozilom " + vo.getMarka() + ", broj vozila: " + vo.getBrojvozila() + "\nUgodnu voznju Vam �elimo!  :)");
	
	}
	
	private void logIn() {
		
		Vozac vozac = new Vozac();
		Vozi vozi = new Vozi();
			
		vozac.setIme(JOptionPane.showInputDialog("Unesite ime:"));
		vozac.setPrezime(JOptionPane.showInputDialog("Unesite prezime"));
		while(true) {
			try {
				vozac.setSifra(Integer.parseInt(JOptionPane.showInputDialog("Unesite �ifru")));
				if(String.valueOf(vozac.getSifra()).length() == 6) {
				JOptionPane.showMessageDialog(null, "Pristup odobren! Dobar dan " + vozac.getIme().trim() + " " + vozac.getPrezime().trim() + "!");
				}else {
					JOptionPane.showMessageDialog(null, "Molimo unesite sifru od 6 brojeva!");
					continue;
				}
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
