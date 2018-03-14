package kurs1_osnove;

public class Matrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrica = new int[20][10];
		int vrsta=0, kolona=0, suma=0, counter=0;
		double prosek=0;
		int[] niz = new int[20];
		
		System.out.println("Unesite broj vrsta:");
		do {
		vrsta = TextIO.getInt();
		} while(vrsta < 0 || vrsta > 10);
		
		System.out.println("Unesite broj kolona:");
		do {
		kolona = TextIO.getInt();
		} while(kolona < 0 || kolona > 20);
		
		for(int i=0; i<kolona; i++) {
			for(int j=0; j<vrsta; j++) {
				System.out.printf("a[%d][%d]= ",i,j);
				matrica[j][i] = TextIO.getInt();
				suma+=matrica[j][i];
				counter++;
				niz[i]+=matrica[j][i];
			}
		}
				
		prosek=(double)suma/counter;
		System.out.printf("Srednja vrednost elemenata je %.2f\n",prosek);
		System.out.println("Sume elemenata kolona:");
		for(int k=0; k<kolona; k++) {
			System.out.printf("Kolona %d: %d\n",k, niz[k]);
		}
	
	}

}
