package kurs1_osnove;

public class Potprogrami1 {
	
	static final int MAX_ELEMENATA = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] niz = unosNiza();
		int izbor = 0, rezultat = 0; 
		double rezultat_d = 0;
		
		do {
		System.out.println("Izaberite opciju:");
		System.out.println("1 - Suma niza\n2 - Srednja vrednost niza\n3 - Minimum");
		System.out.println("4 - Maximum\n0 - Izlaz iz programa\n");
		
		izbor = TextIO.getlnInt();
		
		switch(izbor) {
			case 1:
				rezultat = sumaNiza(niz);
				System.out.println("Suma elemenata niza iznosi: " + rezultat);
				break;
			case 2:
				rezultat_d = srVrNiza(niz);
				System.out.println("Srednja vrednost niza iznosi: " + rezultat_d);
				break;
			case 3:
				rezultat = minNiza(niz);
				System.out.println("Minimalni element niza je: " + rezultat);
				break;
			case 4:
				rezultat = maxNiza(niz);
				System.out.println("Maksimalni element niza je: " + rezultat);
				break;
			default:
				if(izbor == 0)
					System.out.println("Program je zavrsen.");
				else
					System.out.println("Unet broj je van opsega.");
		}
		} while(izbor != 0);
		
		
	}
	
	static int[] unosNiza() {
		int n = 0;
		
		System.out.printf("Unesite broj elemenata niza (0 ... %d): ",MAX_ELEMENATA);
		do {
		n = TextIO.getlnInt();
		} while(n < 0 || n > MAX_ELEMENATA);
		
		int[] niz = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("a[%d]=", i);
			niz[i] = TextIO.getlnInt();			
		}
		
		return niz;
	}
	
	static  int sumaNiza(int[] a) {
		int suma=0;
		for(int j=0; j<a.length; j++) {
			suma+=a[j];
		}
		return suma;
	}
	
	static double srVrNiza(int[] niz) {
		double srvr = sumaNiza(niz)/niz.length;
		return srvr;
	}
	
	static int minNiza(int [] niz) {
		int min = niz[0];
		for(int i=0; i<niz.length; i++) {
			if(niz[i] < min) {
				min = niz[i];
			}
		}
		return min;
	}
	
	static int maxNiza(int [] niz) {
		int max = niz[0];
		for(int i=0; i<niz.length; i++) {
			if(niz[i] > max) {
				max = niz[i];
			}
		}
		return max;
	}

}
