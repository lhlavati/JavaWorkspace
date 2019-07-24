package edunova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpajanjeNaBazu {
	
	private Connection veza;

	public Connection getVeza() {
		return veza;
	}

	public void setVeza(Connection veza) {
		this.veza = veza;
	}

	public SpajanjeNaBazu(){
		
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			
			veza = DriverManager.getConnection(
					"jdbc:mariadb://localhost/taxisluzba",
					"edunova","edunova");
			//System.out.println(veza.getMetaData().getCatalogTerm());
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
//		citajIzBaze();
//		
//		try {
//			veza.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
	}
	
	private void citajIzBaze() {
		
		try {
			PreparedStatement izraz = veza.prepareStatement("SELECT concat(ime, ' ', prezime) AS Vozac FROM vozac");
			ResultSet rs = izraz.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("Vozac"));
			}
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new SpajanjeNaBazu();
	}
}
