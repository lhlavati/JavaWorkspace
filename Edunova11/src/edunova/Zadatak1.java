package edunova;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Zadatak1 {

	// za uneseni niz znakova iz baze izvuæi
	// sve osobe èije ime ili prezime u sebi
	// zadrži taj niz znakova
	public Zadatak1() {

		String s = JOptionPane.showInputDialog("Uvjet:");

		SpajanjeNaMariaDB spajanje = new SpajanjeNaMariaDB();
		// spajanje.getVeza();

		try {
			PreparedStatement izraz = spajanje.getVeza()
					.prepareStatement("select ime,prezime from osoba" + 
			" where concat(ime, ' ',prezime) like ?");
			izraz.setString(1, "%"+s+"%");
			// DZ sebi implementirati
			//https://stackoverflow.com/questions/2309970/named-parameters-in-jdbc
			ResultSet rs = izraz.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("ime") + " " + rs.getString("prezime"));
			}
			rs.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		// System.out.println(s);

	}

	public static void main(String[] args) {

		new Zadatak1();

	}

}
