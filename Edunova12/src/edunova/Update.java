package edunova;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	
	private Connection veza;
	private PreparedStatement izraz;
	
	public Update() {
		veza=Baza.getConnection();
		updateBezParametara(" update smjer set cijena=cijena*1.25 "
				+ " where sifra>100 and sifra<150 ");
		//zadatak: Svim smjerovima koji u svom nazivu imaju
		// brojeve 2 smanjite upisninu za 100 kn
		updateBezParametara("update smjer set upisnina=upisnina-100 "
				+ " where naziv like '%2%'");
	}
	
	private void updateBezParametara(String upit) {
		try {
			izraz = veza.prepareStatement(upit);
			System.out.println(izraz.executeUpdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Update();
	}

}
