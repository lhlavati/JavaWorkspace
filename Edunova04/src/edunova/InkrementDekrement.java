package edunova;

public class InkrementDekrement {
	
	public static void main(String[] args) {
		int i=0;
		
		//samouve�avanje vrijednosti varijable
		i=i+1; // prvo se izra�una desna strana pa dodjeli ljevoj
		
		i+=1; //ekvivalent gornjem izrazu - uve�a za 1
		
		i+=3; // uve�ati za 3
		
		i++; //uve�ava za 1 - inkrement
		
		//kod inkrementa postoji razlika BITNA
		++i;
		
		System.out.println(i);
		
		//prvo uve�a pa koristi
		System.out.println(++i);
		
		//prvo koristi pa uve�a
		System.out.println(i++);
		
		System.out.println(i);
		
		//dekrement
		
		--i;
		i--;
		
		//doma�a zada�a
		//BEZ IZVO�ENJA NA RA�UNALU na�i rezultat
		
		int t=2,k=3;
		t=k--; //t = 3, k=2
		k+=++t; //k = 2+4, t = 4
		k++;t--;// k=7, t=3
		t=--k+ ++t; //k=6, t = 10
		System.out.println(t++ + " - " + --k);
		
	}

}
