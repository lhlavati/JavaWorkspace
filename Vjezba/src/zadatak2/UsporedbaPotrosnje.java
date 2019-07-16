package zadatak2;

public class UsporedbaPotrosnje {

	public static void usporedi(TestAutomobila auto1, TestAutomobila auto2) {
		if(auto1.getPotrosioGoriva() > auto2.getPotrosioGoriva()) {
			System.out.println("Štedljivi je " + auto2.getNaziv());
		}else {
			System.out.println("Štedljivi je " + auto1.getNaziv());
		}
	}
	public static void main(String[] args) {
		UsporedbaPotrosnje usporedba = new UsporedbaPotrosnje();
		TestAutomobila auto1 = new TestAutomobila("Škoda", 40.66);
		TestAutomobila auto2 = new TestAutomobila("Seat", 40.00);
		usporedba.usporedi(auto1, auto2);
	}
}
