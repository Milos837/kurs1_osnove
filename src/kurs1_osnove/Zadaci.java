package kurs1_osnove;

public class Zadaci {
	
	final static int MAX_ELEMENATA = 30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int izbor = 0;
		int[] niz = new int[MAX_ELEMENATA];
		int n = unosBrEl();
		unosElemenata(niz, n);
		
		do {
		
		System.out.println("Izaberite opciju:");
		System.out.println("1 - Suma niza\n2 - Prosecna vrednost niza\n3 - Minimum");
		System.out.println("4 - Maximum\n5 - Nadji poziciju\n6 - Napredna pretraga");
		System.out.println("7 - Sortiraj rastuce\n8 - Sortiraj opadajuce");
		System.out.println("9 - Ispis niza\n0 - Izlaz iz programa");
		
		izbor = TextIO.getlnInt();
		
		switch(izbor) {
			case 1:
				int suma = sumaNiza(niz, n);
				System.out.println("Suma elemenata niza iznosi: " + suma);
				nastavak();
				break;
			case 2:
				double prvr = prosecnaVrednost(niz, n);
				System.out.println("Prosecna vrednost elemenata niza iznosi: " + prvr);
				nastavak();
				break;
			case 3:
				int min[] = minEl(niz, n);
				System.out.printf("Minimalni element niza je %d, i nalazi se na poziciji %d.\n",min[0], min[1]);
				nastavak();
				break;
			case 4:
				int max[] = maxEl(niz, n);
				System.out.printf("Maksimalni element niza je %d, i nalazi se na poziciji %d.\n",max[0], max[1]);
				nastavak();
				break;
			case 5:
				int poz = traziPoziciju(niz, n);	
				if(poz == -1)
					System.out.println("Uneti broj se ne nalazi u nizu!");
				else
					System.out.printf("Uneti broj se nalazi na poziciji sa indeksom %d u nizu.\n", poz);
				nastavak();
				break;
			case 6:
				naprednaPretraga(niz, n);
				break;
			case 7:
				sortAsc(niz,n);
				System.out.println("Elementi niza su sortirani po rastucem redosledu.");
				nastavak();
				break;
			case 8:
				sortDesc(niz,n);
				System.out.println("Elementi niza su sortirani po opadajucem redosledu.");
				nastavak();
				break;
			case 9:
				ispisNiza(niz, n);
				nastavak();
				break;
			default:
				if(izbor == 0)
					System.out.println("Program je zavrsen.");
				else
					System.out.println("Unet broj je van opsega.");
		}
		} while (izbor != 0);
	}
	
	static int unosBrEl() {
		int n=0;
		do {
		System.out.printf("Unesite broj elemenata niza (0 ... %d): ", MAX_ELEMENATA);
		n = TextIO.getlnInt();
		} while (n < 0 || n > MAX_ELEMENATA);
		return n;
	}
	
	static void unosElemenata(int[] niz, int n) {
		for(int i=0; i<n; i++) {
			System.out.printf("a[%d]=", i);
			niz[i] = TextIO.getlnInt();
		}
	}
	
	static int sumaNiza(int[] niz, int n) {
		int suma = 0;
		for(int i=0; i<n; i++) {
			suma += niz[i];
		}
		return suma;
	}
	
	static double prosecnaVrednost(int[] niz, int n) {
		double prVr = sumaNiza(niz, n) / n;
		return prVr;
	}
	
	static int[] minEl(int[] niz, int n) {
		int[] min = {niz[0], 0};
		for (int i=1; i<n; i++) {
			if(niz[i] < min[0]) {
				min[0] = niz[i];		//Minimum
				min[1] = i;				//Pozicija
			}
		}
		return min;
	}
	
	static int[] maxEl(int[] niz, int n) {
		int[] max = {niz[0], 0};
		for (int i=1; i<n; i++) {
			if(niz[i] > max[0]) {
				max[0] = niz[i];		//Maksimum
				max[1] = i;				//Pozicija
			}
		}
		return max;
	}
	
	static int traziPoziciju(int[] niz, int n) {
		int pozicija = -1;
		System.out.print("Unesite broj ciju poziciju trazite: ");
		int broj = TextIO.getlnInt();
		for (int i=0; i<n; i++) {
			if(niz[i] == broj)
				pozicija = i;
		}
		return pozicija;		
	}
	
	static void sortAsc(int[] niz, int n) {
		int temp = 0;	
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(niz[j] > niz[j+1]) {
					temp = niz[j];
					niz[j] = niz[j+1];
					niz[j+1] = temp;
				}				
			}
		}
	}
	
	static void sortDesc(int[] niz, int n) {
		int temp = 0;	
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(niz[j] < niz[j+1]) {
					temp = niz[j];
					niz[j] = niz[j+1];
					niz[j+1] = temp;
				}				
			}
		}
	}
	
	static void ispisNiza(int[] niz, int n) {
		System.out.print("Elementi niza su: {");
		for (int i=0; i<n; i++) {
			System.out.printf(" %d ", niz[i]);
		}
		System.out.println("}");
	}
	
	static void nastavak() {
		boolean prekidac = false;
		
		do {
		System.out.println("Nastavi/izadji (Y/N): ");
		char x = TextIO.getlnChar();
		x = Character.toUpperCase(x);
		switch(x) {
			case 'Y':
				prekidac = true;
				break;
			case 'N':
				System.out.println("Program je zavrsen.");
				System.exit(0);
				break;
			default:
				System.out.println("Pogresan unos!");
		}
		} while (prekidac == false);
	}
	
	static void naprednaPretraga(int[] niz, int n) {
		
		int izbor = 0, broj = 0, a = 0, b = 0;
		String elementi = " ";
		
		do {
		System.out.println("Izaberite kriterijum pretrage: ");
		System.out.println("1 - Elementi manji od granicnog broja");
		System.out.println("2 - Elementi veci od granicnog broja");
		System.out.println("3 - Elementi unutar zadatog opsega");
		System.out.println("4 - Elementi van zadatog opsega");
		System.out.println("0 - Povratak na prethodni meni");
		
		izbor = TextIO.getlnInt();
		
		switch(izbor) {
			case 1:
				elementi = " ";
				System.out.println("Unesite granicni broj:");
				broj = TextIO.getlnInt();
				for (int i=0; i<n; i++) {
					if(niz[i] < broj)
						elementi += (niz[i] + " ");
				}
				if(elementi == " ")
					System.out.printf("Nema elemenata manjih od broja %d.\n", broj);
				else
					System.out.printf("Elementi manji od %d: {%s}.\n", broj, elementi);
				nastavak();
				break;
			case 2:
				elementi = " ";
				System.out.println("Unesite granicni broj:");
				broj = TextIO.getlnInt();
				for (int i=0; i<n; i++) {
					if(niz[i] > broj)
						elementi += (niz[i] + " ");
				}
				if(elementi == " ")
					System.out.printf("Nema elemenata vecih od broja %d.\n", broj);
				else
					System.out.printf("Elementi veci od %d: {%s}.\n", broj, elementi);
				nastavak();
				break;
			case 3:
				elementi = " ";
				do {
				System.out.print("Unesite donju granicu: ");
				a = TextIO.getlnInt();
				System.out.print("Unesite gornju granicu: ");
				b = TextIO.getlnInt();
				} while(a > b);
				for(int i=0; i<n; i++) {
					if(niz[i] > a && niz[i] < b)
						elementi += (niz[i] + " ");
				}
				if(elementi == " ")
					System.out.printf("Nema elemenata vecih od %d, a manjih od %d.\n", a, b);
				else
					System.out.printf("Elementi veci of %d a manji od %d: {%s}.\n", a, b, elementi);
				nastavak();
				break;
			case 4:
				elementi = " ";
				do {
					System.out.print("Unesite donju granicu: ");
					a = TextIO.getlnInt();
					System.out.print("Unesite gornju granicu: ");
					b = TextIO.getlnInt();
					} while(a > b);
					for(int i=0; i<n; i++) {
						if(niz[i] < a || niz[i] > b)
							elementi += (niz[i] + " ");
					}
					if(elementi == " ")
						System.out.printf("Nema elemenata manjih od %d, ili vecih od %d.\n", a, b);
					else
						System.out.printf("Elementi manji of %d ili veci od %d: {%s}.\n", a, b, elementi);
					nastavak();
					break;
			default:
				if(izbor == 0) {
					System.out.println("Povratak nazad.....");
				} else {
					System.out.println("Izaberite drugu vrednost");
				}
		}
		} while(izbor != 0);	
		
	}
}
