package edunova;

public class VjezbaMatrica {

	public static void main(String[] args) {
		
//		System.out.println("Zadatak1\n");
//Napisati program da ispisuje 3 puta u 3 reda IME sa razmakom:
//		    IME IME IME
//		    IME IME IME
//		    IME IME IME
//		
//		int [][] ime = new int [3][3];
//		
//		for (int i = 0; i < ime.length; i++) {
//			for (int j = 0; j < ime.length; j++) {
//				System.out.print("IME ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
		System.out.println("\nZadatak2\n");
		// Napisati program da ispisuje u prvom redu jedno ime a zatim u svakom narednom po jedno više
		//		IME
		//		IME IME
		//		IME IME IME
		int [][] ime = new int [3][3];
		
		for (int i = 0; i < ime.length; i++) {
			for (int j = 0; j < ime.length; j++) {
				if(i >= j) {
					System.out.print("IME ");	
				}
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
