package edunova;

public class VjezbaInkrementDekrement {

	public static void main(String[] args) {
		
//		int a = 4, b = 2;
//		b -= a;
//		a++;
//		b += 2;
//		a = --a + b++;
//		b--;
//		a -= b;
//		System.out.println(++a + " ~ " + b--);
		
//		int x = 1, y = 2, z = 3; 
//		x = ++x - z-- + x; 
//		y += y + --z; 
//		z = y-- - z++; 
//		x = z++ - --y + ++x + x;
//		z -= --z + ++x - --y;
//		z++;--z;++x;x++;
//		System.out.println("X = " + x + "Y = " + y + "Z = " + z);
		
		System.out.println("                ZADATAK 1              ");
		int a = 4, b = 2;
		b -= a; // b = -2, a = 4
		a++; // a = 4, b = -2
		b += 2; // a = 5, b = 0
		a = --a + b++; // a = 4, b = 0
		b--; // b = 1, a = 4
		a -= b; // b = 0, a = 4
		System.out.println("                  " + ++a + " ~ " + b--); // a = 5, b = 0
		System.out.println("                ZADATAK 2              ");
		int x = 1, y = 2, z = 3; 
		x = ++x - z-- + x; // x = 0, z = 3*-, y = 2
		y += y + --z; // x = 0, y = 5, z = 1 
		z = y-- - z++; // z = 4*+, y = 5*-, x = 0
		x = z++ - --y + ++x + x; // x = 0, z = 5*+, y = 3
		z -= --z + ++x - --y; // z = 0, x = 5, y = 2
		z++;--z;++x;x++; // z = 0, x = 7, y = 2
		System.out.println("                  X = " + x + "\n                  Y = " + y + "\n                  Z = " + z); // NE VALJA PONOVO!!
		
	}
}
