package kurs1_osnove;


public class Razno1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	//Konverzija novca
		double kurs=123.5, dinari=155000;
		System.out.println("Po kursu od 123.5 dinara po evru, 155000 dinara je " + dinari/kurs + " evra.");
		*/
		
		/*	//Prosecna potrosnja goriva
		double predjeno = 350, gorivo = 17;
		double potrosnja = gorivo / predjeno / 100;
		System.out.println("Prosecna potrosnja za predjenih 350km i 17L goriva je " + potrosnja);
		*/
		
		/*	//Obim i povrsina valjka
		double r = 20, pi = 3.14;
		double povrsina = r*r*pi;
		double obim = 2*r*pi;
		System.out.println("Za r=20, obim je " + obim + " a povrsina " + povrsina);
		*/
		
		/*	//Zamena mesta dve promenljive
		int a = 4, b = 3;
		int c;
		System.out.println("Vrednost A je " + a + ", a B je " + b + ".");
		c=a;
		a=b;
		b=c;
		System.out.println("Kad se zamene mesta, A je " + a + ", a B je " +b + ".");
		*/
		
		/*	//Pomeranje vrednosti promenljivih ulevo
		int a = 3, b = 7, c = 9;
		int pom;
		System.out.println("Vrenosti promenljivih: A=" + a + ", B=" + b + ", C=" + c);
		pom=a;
		a=b;
		b=c;
		c=pom;
		System.out.println("Nakon pomeranja ulevo: A=" + a + ", B=" + b + ", C=" + c);
		*/
		
		/*	//Aritmeticke operacije
		int a=25, b=9;
		System.out.println("A+B=" + (a+b));
		System.out.println("A-B=" + (a-b));
		System.out.println("A*B=" + (a*b));
		System.out.println("A/B=" + (a/b));
		System.out.println("A%B=" + (a%b));
		*/
		
		/*	//Logicki operatori
		boolean a = true, b = false;
		// Negacija. 
		System.out.print("Negacija od true je: "); System.out.println(!a);
		System.out.print("Negacija od false je: "); System.out.println(!b);
		// I operacija. 
		System.out.print("true I false je: "); System.out.println(a && b);
		System.out.print("true I true je: "); System.out.println(a && a);
		System.out.print("false I false je: "); System.out.println(b && b);
		// ILI operacija. 
		System.out.print("true ILI false je: "); System.out.println(a || b);
		System.out.print("true ILI true je: "); System.out.println(a || a);
		System.out.print("false ILI false je: "); System.out.println(b || b);
		// Eksluzivno ILI operacija. 
		System.out.print("true EXILI false je: "); System.out.println(a ^ b);
		System.out.print("true EXILI true je: "); System.out.println(a ^ a);
		System.out.print("false EXILI false je: "); System.out.println(b ^ b);
		*/
		
		/*	//Zapremina kupe?
		int r=5, H=20;
		double zapremina = (double)1/3*r*r*H*Math.PI;
		System.out.println("Zapremina iznosi " + zapremina);
		*/
		
		/*	//Otpornost provodnika
		int l=350, d=2;
		double specOtp = 1.588e-8;
		double otpor = (specOtp*4*l)/(d*d*Math.PI);
		System.out.println("Otpornost provodnika iznosi " + otpor);
		*/
		
		/*	//Pritisak gasa
		int V = 150, T = 45, n = 1;
		double R = 8.314472;
		double pritisak = (double)n*R*T/V;
		System.out.println("Pritisak iznosi " + pritisak);
		*/
		
		/*	//Povrsina valjka?
		int r = 5, H = 27;
		double povrsina = 2*r*(r+H)*Math.PI;
		System.out.println("Povrsina iznosi " + povrsina);
		*/
		
		/*	
		long vremePocetka; // Vreme pocetka rada programa u milisekundama.
		long vremeKraja;
		// Vreme kraja rada programa u milisekundama.
		double vreme;
		// Ukupno vreme trajanja programa.
		double sirina = 42.0, visina = 17.0, hipotenuza; // strane trougla
		vremePocetka = System.currentTimeMillis();
		hipotenuza = Math.sqrt( sirina*sirina + visina*visina );
		System.out.print("Pravougli trougao cije su stranice 42 i 17 ima hipotenuzu: ");
		System.out.println(hipotenuza);
		System.out.print("sin(1)*sin(1) + cos(1)*cos(1) - 1 je ");
		System.out.println( Math.sin(1)*Math.sin(1) + Math.cos(1)*Math.cos(1) - 1 );
		System.out.print("Slucajno generisana vrednost: ");
		System.out.println( Math.random() );
		System.out.print("Broj PI ima vrednost: ");
		System.out.println( Math.PI );
		vremeKraja = System.currentTimeMillis();
		vreme = (vremeKraja - vremePocetka) / 1000.0;
		System.out.print("Ukupno trajanje programa u sekundama je:	");
		System.out.println(vreme);
		*/
		
		/*	//Apsolutna vrednost
		int a = -5;
		int abs = Math.abs(a);
		System.out.println("Apsolutna vrednost iznosi " + abs);
		*/
		
		/*	//Zaokruzivanje
		double a = 4.789;
		double rnd = Math.round(a);
		System.out.println("Zaokruzena vrednost iznosi " + rnd);
		*/
		
		/*
		String str;
		str = "Dinu Dragan";
		System.out.print("Broj karaktera u ");
		System.out.print(" stringu \"Dinu Dragan\" je: ");
		System.out.print(str.length());
		*/
		
		/*
		System.out.println("Unesite string: ");
		String str = TextIO.getln();
		System.out.println("Broj karaktera u stringu \"" + str + "\" je " + str.length());
		*/
		
		/*
		String str1 = "Dobar", str2 = "dan", str3 =" ";
		String str4 = str1 + str3 + str2;
		System.out.println(str4);
		*/
		
			//Prebacivanje malih u velika slova
		System.out.print("Unesite string: ");
		String str = TextIO.getln(), str1="";
		for (int i=0; i<str.length(); i++) {
				int a = str.charAt(i);
				if (a > 96 && a < 123) {
					a-=32;
					char b = (char)a;
					str1+=b;
				} else {
					str1+=str.charAt(i);
				}
		}
		System.out.println("Samo velika slova: " + str1);
		
	}

}
 