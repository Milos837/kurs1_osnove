package kurs1_osnove;

public class Potprogrami {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, izbor;
		double rezultat;
		
		do {
		System.out.println("Izaberite opciju:");
		System.out.println("1 - Sabiranje\n2 - Oduzimanje\n3 - Mnozenje");
		System.out.println("4 - Deljenje\n0 - Izlaz iz programa\n");
		
		izbor = TextIO.getInt();
		
		switch(izbor) {
			case 1:
				a = unos();
				b = unos();
				rezultat = saberi(a,b);
				rezultat(rezultat);
				break;
			case 2:
				a = unos();
				b = unos();
				rezultat = oduzmi(a,b);
				rezultat(rezultat);
				break;
			case 3:
				a = unos();
				b = unos();
				rezultat = pomnozi(a,b);
				rezultat(rezultat);
				break;
			case 4:
				a = unos();
				do {
				b = unos();
				if(b == 0) 
					System.out.println("Broj mora biti razlicit od nula!");
				} while(b == 0);
				rezultat = podeli(a,b);
				break;
			default:
				if(izbor == 0) {
					System.out.println("Program je zavrsen.");
				} else {
					System.out.println("Izaberite drugu vrednost");
				}
				break;
		}
		} while (izbor != 0);
		
	}
	
	static int unos() {
		System.out.println("Unesite broj: ");
		int broj = TextIO.getInt();
		return broj;
	}
	
	static int saberi(int a, int b) {
		int rezultat=a+b;
		return rezultat;
	}
	
	static int oduzmi(int a, int b) {
		int rezultat=a-b;
		return rezultat;
	}
	
	static int pomnozi(int a, int b) {
		int rezultat=a*b;
		return rezultat;
	}
	
	static double podeli(int a, int b) {
		double rezultat = (double)a/b;
		return rezultat;		
	}
	
	
	static void rezultat(double a) {
		System.out.println("Rezulatat je " + a);
	}

}
