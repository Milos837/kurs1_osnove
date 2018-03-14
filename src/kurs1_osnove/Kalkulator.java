package kurs1_osnove;

public class Kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=0, b=0, rezultat=0;
		int izbor=0;
		
		do {
		System.out.println("Izaberite opciju:");
		System.out.println("1 - Sabiranje\n2 - Oduzimanje\n3 - Mnozenje");
		System.out.println("4 - Deljenje\n5 - Ostatak\n0 - Izlaz iz programa\n");
		
		izbor = TextIO.getInt();
		
		switch(izbor) {
			case 1:
				System.out.println("Unesite prvi broj:");
				a = TextIO.getDouble();
				System.out.println("Unesite drugi broj:");
				b = TextIO.getDouble();
				rezultat = a + b;
				System.out.printf("Njihov zbir je %.2f", rezultat);
				break;
			case 2:
				System.out.println("Unesite prvi broj:");
				a = TextIO.getDouble();
				System.out.println("Unesite drugi broj:");
				b = TextIO.getDouble();
				rezultat = a - b;
				System.out.printf("Njihova razlika je %.2f", rezultat);
				break;
			case 3:
				System.out.println("Unesite prvi broj:");
				a = TextIO.getDouble();
				System.out.println("Unesite drugi broj:");
				b = TextIO.getDouble();
				rezultat = a * b;
				System.out.printf("Rezultat mnozenja je %.2f", rezultat);
				break;
			case 4:
				System.out.println("Unesite prvi broj:");
				a = TextIO.getDouble();
				System.out.println("Unesite drugi broj (mora biti razlicit od 0):");
				do {
				b = TextIO.getDouble();
				} while (b == 0);
				rezultat = a / b;
				System.out.printf("Rezultat deljenja je %.2f", rezultat);
				break;
			case 5:
				System.out.println("Unesite prvi broj:");
				a = TextIO.getDouble();
				System.out.println("Unesite drugi broj:");
				b = TextIO.getDouble();
				rezultat = a % b;
				System.out.printf("Ostatak pri njihovom deljenju je %.2f", rezultat);
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

}
