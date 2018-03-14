package kurs1_osnove;

public class KvadratnaJednacina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Resavanje kvadratne jednacine
		double a, b, c, d, x1, x2, realni, imaginarni;
		System.out.println("Unesite koeficijent a (mora biti razlicito od 0): ");
		do {
		a = TextIO.getlnDouble();
		} while (a == 0);
		System.out.println("Unesite koeficijent b: ");
		b = TextIO.getlnDouble();
		System.out.println("Unesite koeficijent c: ");
		c = TextIO.getlnDouble();
		
		d = b*b - 4*a*c;		
		
		int p = (d > 0) ? 1 : (p = (d == 0) ? 2 : 3);		
		
		switch (p) {
			case 1:
				x1 = (-b + Math.sqrt(d)) / (2*a);
	        	x2 = (-b - Math.sqrt(d)) / (2*a);
	        	System.out.printf("Koreni su realni i razliciti: x1=%.3f, x2=%.3f.",x1,x2);
	        	break;
			case 2:
				x1 = (-b + Math.sqrt(d)) / (2*a);
				System.out.printf("Koreni su realni i jednaki: x1=x2=%.3f.",x1);
				break;
			case 3:
				realni = -b/(2*a);
				imaginarni =Math.sqrt(-d)/(2*a);
				System.out.println("Koreni su kompleksni: ");
				System.out.printf("x1=%.3f + %.3fi\n",realni,imaginarni);
				System.out.printf("x2=%.3f - %.3fi",realni,imaginarni);
				break;
		}
		
		
		/*
			if (d > 0) {
				x1 = (-b + Math.sqrt(d)) / (2*a);
	        	x2 = (-b - Math.sqrt(d)) / (2*a);
	        	System.out.printf("Koreni su realni i razliciti: x1=%.3f, x2=%.3f.",x1,x2);
			}
			else if (d == 0) {
				x1 = (-b + Math.sqrt(d)) / (2*a);
				System.out.printf("Koreni su realni i jednaki: x1=x2=%.3f.",x1);
			}
			else {
				realni = -b/(2*a);
				imaginarni =Math.sqrt(-d)/(2*a);
				System.out.println("Koreni su kompleksni: ");
				System.out.printf("x1=%.3f + %.3fi\n",realni,imaginarni);
				System.out.printf("x2=%.3f - %.3fi",realni,imaginarni);
			}
		*/
		
	}

}
