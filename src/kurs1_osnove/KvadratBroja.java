package kurs1_osnove;

public class KvadratBroja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*		//Kvadrat broja
		int broj;
		// Broj koji treba da unese korisnik.
		int kvadrat; // Uneti broj pomnozen samim sobom - kvadrat broja.
		System.out.print("Unesite neki ceo broj: ");
		broj = TextIO.getlnInt();
		kvadrat = broj * broj;
		System.out.println();
		System.out.println("Broj koji ste uneli je " + broj);
		System.out.println("Kvadrat unetog broja je " + kvadrat);
		System.out.println();
		*/
		
			//Investicija
		double investicija; // Vrednost investicije.
		double stopa;
		// Kamatana stopa.
		double zarada;
		// Ukupna kamata po godini.
		System.out.print("Unesite vrednost investicije: ");
		investicija = TextIO.getlnDouble();
		System.out.print("Unesite vrednost kamatne stope: ");
		stopa = TextIO.getlnDouble();
		zarada = investicija * stopa;
		investicija = investicija + zarada; // Izracunavanje zarade.
		System.out.println("Za godinu dana zaradjeno je: " + zarada + " dinara.");
		System.out.println("Ukupna vrednost investije je sada: " + investicija + " dinara.");
	}

}
