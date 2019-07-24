package edunova;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	private void spojSBazom() {
		
		SpajanjeNaBazu spajanje = new SpajanjeNaBazu();
		try {
			
			PreparedStatement izraz = spajanje.getVeza().prepareStatement("SELECT vrijemePocetka FROM vozi WHERE sifra = 1");
			ResultSet rs = izraz.executeQuery();
			
			System.out.println(rs.getDate("vrijemePocetka"));
			
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private int brojVozila() {
		int bv;
		while(true) {
			bv= Integer.parseInt(JOptionPane.showInputDialog("Unesite broj vašeg vozila"));
			if(bv>vozila.size() || bv == 0) {
				JOptionPane.showMessageDialog(null, "Obavezan odabir ponuðenih vozila");
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
			
		vozac.setIme(JOptionPane.showInputDialog("Unesite ime:"));
		vozac.setPrezime(JOptionPane.showInputDialog("Unesite prezime"));
		while(true) {
			try {
				vozac.setSifra(Integer.parseInt(JOptionPane.showInputDialog("Unesite šifru")));
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

		pocetakSmjene();
		
	}
	
	private void pocetakSmjene() {
		
//		Vozi vozi = new Vozi();
		spojSBazom();
		System.out.println("Vrijeme pocetka smjene");
		System.out.println( new SimpleDateFormat("HH:mm:ss dd.MM.yyyy.").format(Calendar.getInstance().getTime()) );
//		vozi.setVrijemePocetka(spojSBazom());
//		System.out.println(vozi.getVrijemePocetka());
	}

	public static void main(String[] args) {
		new Start();
	}
}
