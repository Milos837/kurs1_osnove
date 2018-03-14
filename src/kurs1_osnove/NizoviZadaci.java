package kurs1_osnove;

public class NizoviZadaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	//Zadatak br.1
		int[] niz = new int[12];
		int n=0, parni=0, neparni=0, parni1=0, neparni1=0;
		
		System.out.println("Unesite broj elemenata niza (0 ... 12):");
		do {
			n = TextIO.getInt();
		} while (n < 0 || n > 12);
		
		for (int i=0; i<n; i++) {
			System.out.printf("a[%d]=",i);
			niz[i] = TextIO.getInt();
			if((niz[i] % 2) == 0) {
				parni++;
			} else {
				neparni++;
			}
		}
		
		int[] niz_p = new int[parni];
		int[] niz_n = new int[neparni];
		
		for(int j=0; j<n; j++) {
			if((niz[j] % 2) == 0) {
				niz_p[parni1]=niz[j];
				parni1++;
			} else {
				niz_n[neparni1]=niz[j];
				neparni1++;
			}
		}
		
		System.out.print("Parni: ");
		for(int k=0; k<parni1; k++) {
			System.out.printf("%d ",niz_p[k]);
		}
		System.out.print("\nNeparni: ");
		for(int l=0; l<neparni1; l++) {
			System.out.printf("%d ",niz_n[l]);
		}
		*/
		
		/*	//Zadatak br.2
		int[] niz = new int[10];
		int n=0, parni=0, neparni=0, parni1=0, neparni1=0;
		
		System.out.println("Unesite broj elemenata niza (0 ... 10):");
		do {
			n = TextIO.getInt();
		} while (n < 0 || n > 10);
		
		for (int i=0; i<n; i++) {
			System.out.printf("a[%d]=",i);
			niz[i] = TextIO.getInt();
			if((i % 2) == 0) {
				parni++;
			} else {
				neparni++;
			}
		}
		
		int[] niz_p = new int[parni];
		int[] niz_n = new int[neparni];
		
		for(int j=0; j<n; j++) {
			if((j % 2) == 0) {
				niz_p[parni1]=niz[j];
				parni1++;
			} else {
				niz_n[neparni1]=niz[j];
				neparni1++;
			}
		}
		
		System.out.print("Elementi sa parnim indexom: ");
		for(int k=0; k<parni1; k++) {
			System.out.printf("%d ",niz_p[k]);
		}
		System.out.print("\nElementi sa neparnim indexi: ");
		for(int l=0; l<neparni1; l++) {
			System.out.printf("%d ",niz_n[l]);
		}
		*/
		
		/*	//Zadatak br.3
		int[] niz = new int[20];
		int n=0, broj=0, counter=0;
		
		System.out.println("Unesite broj elemenata niza (0 ... 20):");
		do {
			n = TextIO.getInt();
		} while (n < 0 || n > 20);
		
		for (int i=0; i<n; i++) {
			System.out.printf("a[%d]=",i);
			niz[i] = TextIO.getInt();
		}
		
		System.out.println("Unesite neki broj: ");
		broj = TextIO.getInt();
		
		for(int j=0; j<n; j++) {
			if (niz[j] == broj)
				counter++;
		}
		
		if(counter == 0) {
			System.out.println("Uneti broj se ne nalazi u nizu.");
		} else {
			System.out.println("Broj pojavljivanja unetog broja u nizu: " + counter);
		}
		*/
		
		/*	//Zadatak br.4
		char[] niz = new char[15];
		int n=0, counter=0, counter1=0;
		
		System.out.println("Unesite broj elemenata niza (0 ... 15):");
		do {
			n = TextIO.getInt();
		} while (n < 0 || n > 15);
		
		for (int i=0; i<n; i++) {
			System.out.printf("a[%d]=",i);
			niz[i] = TextIO.getChar();
			if(niz[i] >= 48 && niz[i] <= 57) {
				counter++;
			}
		}
		
		char[] brojevi = new char[counter];
		
		for (int j=0; j<n; j++) {
			if(niz[j] >= 48 && niz[j] <= 57) {
				brojevi[counter1] = niz[j];
				counter1++;
			}
		}
		
		if(counter1 == 0) {
			System.out.println("U unetom nizu se ne nalaze brojevi.");
		} else {
			System.out.println("U unetom nizu se nalaze sledeci brojevi: ");
			for (int k=0; k<counter; k++) {
				System.out.printf("%c ", brojevi[k]);
			}
		}
		*/
		
		/*	//Zadatak br.5
		int[] niz = new int[40];
		int n=0, counter=0, counter1=0;
		
		System.out.println("Unesite broj elemenata niza (0 ... 40):");
		do {
			n = TextIO.getInt();
		} while (n < 0 || n > 40);
		
		for (int i=0; i<n; i++) {
			System.out.printf("a[%d]=",i);
			niz[i] = TextIO.getInt();
			if(niz[i] < 0) {
				counter++;
			}
		}
		
		int[] abs = new int[counter];
		
		for (int j=0; j<n; j++) {
			if(niz[j] < 0) {
				abs[counter1] = Math.abs(niz[j]);
				counter1++;
			}
		}
		
		if(counter1 == 0) {
			System.out.println("Uneseni niz nema negativne elemente.");
		} else {
			System.out.println("Apsolutne vrednosti negativnih elemenata:");
			for(int k=0; k<counter; k++) {
				System.out.printf("%d ", abs[k]);
			}
		}
		*/
		
		char[] niz = new char[15];
		int n=0, counter=0, counter1=0;
		
		System.out.println("Unesite broj elemenata niza (0 ... 15):");
		do {
			n = TextIO.getInt();
		} while (n < 0 || n > 15);
		
		for (int i=0; i<n; i++) {
			System.out.printf("a[%d]=",i);
			niz[i] = TextIO.getChar();
			if(niz[i] >= 97 && niz[i] <= 122) {
				counter++;
			}
		}
		
		char[] mala_slova = new char[counter];
		
		for (int j=0; j<n; j++) {
			if(niz[j] >= 97 && niz[j] <= 122) {
				mala_slova[counter1] = niz[j];
				counter1++;
			}
		}
		
		if(counter1 == 0) {
			System.out.println("U unetom nizu se ne nalaze mala slova.");
		} else {
			System.out.println("U unetom nizu se nalaze sledeca mala slova: ");
			for (int k=0; k<counter; k++) {
				System.out.printf("%c ",mala_slova[k]);
			}
		}
		
	}	

}
