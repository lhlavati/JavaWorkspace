package zadatak3;

/*		
 		3. Napravi niz od nekoliko objekata (od 2 do 5) i popuni ga sa objektima Ptice i Lastavice,
		napravi petlju koja prolazi kroz niz i sa svakim objektom niza pozove metode getIme i
		glasajSe.
*/

public class Start {

	public Start(){
		
		Ptice p = new Ptice();
		Lastavice l = new Lastavice();
		
		Ptice[] niz = new Ptice[4];
		niz[0] = p;
		niz[1] = l;
		niz[2] = p;
		niz[3] = l;
		
		for(int i = 0; i < niz.length; i++) {
			niz[i].getIme();
			niz[i].glasajSe();
		}
		
	}
	public static void main(String[] args) {
		new Start();
	}
}
