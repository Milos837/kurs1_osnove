 package kurs1_osnove;

public class Razno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		/*	//Ocene
		int ocena;
	
		System.out.println("Program za ispis uspeha na osnovu unete ocene!");
		do {
		System.out.print("Unesite ocenu: ");		
		ocena = TextIO.getlnInt();

		if (ocena == 1)
		System.out.println("Nedovoljan!");
		else if (ocena == 2)
		System.out.println("Dovoljan!");
		else if (ocena == 3)
		System.out.println("Dobar!");
		else if (ocena == 4)
		System.out.println("Vrlo dobar!");
		else if (ocena == 5)
		System.out.println("Odlican!");
		else
		System.out.println("Nepravilan unos!");	
		} while (ocena < 1 || ocena >5);
		*/
		
		/*
		System.out.print("Unesite prvi broj: ");
		double prvi = TextIO.getDouble();
		System.out.print("Unesite drugi broj: ");
		double drugi = TextIO.getDouble();
		if(prvi > drugi) {
			System.out.print("Prvi broj je veci.");
		} else if (prvi < drugi) {
			System.out.print("Drugi broj je veci.");
		} else {
			System.out.print("Brojevi su jednaki");
		}
		*/
		
		/*
		int broj = 1, i = 1, fakt = 1;
		System.out.println("Program za racunanje faktorijala unetog broja.");
		System.out.println("Unesite broj: ");
		do{
			broj= TextIO.getlnInt();
				if (broj < 0)
					System.out.println("Broj mora biti veci ili jednak 0. Unesite ponovo broj: ");
		} while (broj < 0);
			while (i <= broj){
			fakt *= i;
			i++;
		//uzrokuje da (i <= broj) konvergira nuli
		}
		System.out.println("Faktorijal broja " + broj + " je: " + fakt + ".");
		*/
		
		/*
		int n=0, suma=0;
		System.out.println("Program za racunanje prvih n prirodnih brojeva.");
		do {
		System.out.print("Unesite n: ");
		n = TextIO.getInt();
		if (n<0)
			System.out.println("Vrednost mora biti veca od 0!");
		} while (n < 0);
		
		int i=0;
		do {
			i++;
			suma+=i;		
		} while (i < n);
				
		System.out.printf("Suma prvih %d prirodnih brojeva iznosi %d.", n, suma);
		*/
		
		/*
		String str;
		int ukSlova;
		char slovo;
		int i;
		
		System.out.println("Unesite jedan red teskta:");
		str = TextIO.getln();
		str = str.toUpperCase();
		
		ukSlova = 0;
		
		System.out.println("Vas red teksta sadrzi sledeca slova:");
		System.out.println();
		System.out.print("	");
		
		for ( slovo = 'A'; slovo <= 'Z'; slovo++ ) {
			for ( i = 0; i < str.length(); i++ ) {
				if ( slovo == str.charAt(i) ) {
					System.out.print(slovo);
					System.out.print(' ');
					ukSlova++;
					break;
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Otkriveno je " + ukSlova + " razlicitih slova.");
		*/
		
		/*
		int broj1=0, broj2=0, counter=0;
		double prosek=0;
		System.out.println("Unesite broj studenata po smeru (za izlaz unesite 0): ");
		do {
			do {
				broj1 = TextIO.getInt();
				if(broj1 < 0 || broj1 > 160)
					System.out.println("Vrednost mora biti u opsegu 1-160!");
			} while (broj1 < 0 || broj1 > 160);
		switch (broj1) {
			case 0: 
				prosek=(double)broj2/counter;
				System.out.println("Prosek studenata po smeru je " + prosek);
				break;
			default: 
				broj2+=broj1;
				counter++;
				break;
		}
		} while (broj1 != 0);
		*/
		
		/*
		int broj=0, counter=0;
		System.out.println("Unesite brojeve za proveru deljivosti (za izlaz unesite -1)");
		do {
			do {
				broj = TextIO.getInt();				
				if((broj < 6 || broj > 142 ) && broj != -1)
					System.out.println("Vrednost mora biti u opsegu 6-142!");		
			} while ((broj < 6 || broj > 142 ) && broj != -1);
			if(broj % 7 == 0)
				counter++;
			if (broj == -1)
				System.out.println("Ukupan broj brojeva deljivih sa sedam:  " + counter);
		} while (broj != -1);
		*/
		
		/*
		int broj=0, min=101, pozicija=0;
		System.out.println("Program racunanja najmanjeg u sekvenci od N brojeva.");
		System.out.println("Opseg od -10 do 100.");
		System.out.print("Unesite N: ");
		int n = TextIO.getInt();
		System.out.println("Unesite elemente sekvence:");
		for (int i=0; i<n; i++) {
			do {
			System.out.printf("a[%d]=", i);
			broj = TextIO.getInt();			
			if(broj < -10 || broj > 100)
				System.out.println("Vrednost mora biti u opsegu od -10 do 100!");	
			} while (broj < -10 || broj > 100);
			if(broj < min) {
				min = broj;
				pozicija = i;
			}
		}
		System.out.println("Najmanji broj u sekvenci je " + min);
		System.out.println("On se nalazi na poziciji broj  " + pozicija);
		*/
		
		/*
		int temp=0, counter=0, ocene=0;
		double prosek=0;
		System.out.println("Program racunanja prosecne ocene (za izlaz unesite 0)");
		System.out.println("Unesite ocene: ");
		do {
			do {
				temp = TextIO.getInt();
				if((temp < 5 || temp > 10) && temp != 0)
					System.out.println("Ocena moze biti od 5 do 10!");
			} while ((temp < 5 || temp > 10) && temp != 0);
			switch (temp) {
				case 0:
					prosek=(double)ocene/counter;
					System.out.printf("Prosecna ocena je %.2f", prosek);
					break;
				default:
					ocene+=temp;
					counter++;
			}
		} while (temp != 0);
		*/
		
		
		int broj=0, counter=0;
		double procenat=0;
		System.out.println("Program racunanja procenta brojeva deljivih sa 3.");
		System.out.println("Opseg od 15 do 62.");
		System.out.print("Unesite N: ");
		int n = TextIO.getInt();
		System.out.println("Unesite elemente sekvence:");
		for (int i=0; i<n; i++) {
			do {
			System.out.printf("a[%d]=", i);
			broj = TextIO.getInt();		
			if(broj < 15 || broj > 62)
				System.out.println("Vrednost mora biti u opsegu od 15 do 62!");	
			} while (broj < 15 || broj > 62);
			if(broj % 3 == 0)
				counter++;
		}
		procenat=100.0*counter/n;
		System.out.println("Procenat brojeva deljivih sa 3: " + procenat);
		
	}

}
