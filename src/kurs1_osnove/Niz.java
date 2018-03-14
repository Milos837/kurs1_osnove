package kurs1_osnove;

public class Niz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] niz = new int[50];
		int n=0, suma=0, max=Integer.MIN_VALUE, poz=0;
		
		System.out.println("Unesite broj elemenata niza (0 ... 50):");
		do {
			n = TextIO.getInt();
		} while (n < 0 || n > 50);
		
		System.out.println("Unesite elemente niza:");
		
		for (int i=0; i<n; i++) {
			System.out.printf("a[%d]=",i);
			niz[i] = TextIO.getInt();
			suma+=niz[i];
			if(niz[i] > max) {
				max=niz[i];
				poz=i;
			}
		}
		
		System.out.println("Suma elemenata niza je: " + suma);
		System.out.printf("Maksimalni element je %d, i njegov index je %d.",max,poz);
		
		
	}

}
