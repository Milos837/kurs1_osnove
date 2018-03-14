package kurs1_osnove;

public class Potprogrami3 {
	
	static final int MAX_POLAZNIKA = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] podaci = new String[MAX_POLAZNIKA][4];
		int izbor = 0;
		int n = unosBrojaPolaznika();
		unosPolaznika(podaci, n);
		
		do {
		System.out.println("Izbor kriterijuma za sortiranje: ");
		System.out.print("1 - Po imenu\n2 - Po prezimenu\n");
		System.out.print("3 - Po JMBG\n4 - Po gradu\n");
		
		izbor = TextIO.getlnInt();
		
		switch(izbor) {
			case 1:
				sortiraj(podaci, n, 0);
				break;
			case 2:
				sortiraj(podaci, n, 1);
				break;
			case 3:
				sortiraj(podaci, n, 2);
				break;
			case 4:
				sortiraj(podaci, n, 3);
			default:
				System.out.println("Uneli ste pogresan broj.");
		}
		} while(izbor < 1 || izbor > 4);
		
		
		ispisPodataka(podaci, n);
		
	}
	
	static int unosBrojaPolaznika() {
		int n=0;
		System.out.printf("Unesite broj polaznika (0 ... %d): ",MAX_POLAZNIKA);
		do {
			n = TextIO.getlnInt();
		} while (n < 0 || n > MAX_POLAZNIKA);
		return n;
	}
	
	static void unosPolaznika(String[][] matrica, int n) {
		
		for(int i=0; i<n; i++) {
			System.out.println("Podaci za " + (i+1) + ". polaznika:");
			System.out.println("Unesite ime: ");
			matrica[i][0] = TextIO.getlnWord();
			System.out.println("Unesite prezime: ");
			matrica[i][1] = TextIO.getlnWord();
			System.out.println("Unesite JMBG: ");
			matrica[i][2] = TextIO.getlnWord();
			System.out.println("Unesite grad: ");
			matrica[i][3] = TextIO.getlnWord();	
		}
	}
	
	static void sortiraj(String[][] matrica, int n, int a) {
		String temp = "";
		for (int i=0; i<n; i++) {
			for (int j=1; j<(n-i); j++) {
				if((matrica[j-1][a]).compareTo(matrica[j][a]) > 0) {
					for(int k=0; k<4; k++) {
						temp = matrica[j-1][k];
						matrica[j-1][k] = matrica[j][k];
						matrica[j][k] = temp;
					}
				}
			}
		}
	}
	
	static void ispisPodataka(String[][] matrica, int n) {
		System.out.println("Polaznici (Ime, prezime, JMBG, grad):");
		for(int i=0; i<n; i++) {
			System.out.printf("Polaznik broj %d: ", i+1);
			System.out.print(matrica[i][0] + " " + matrica[i][1]);
			System.out.print(", " + matrica[i][2] + ", " + matrica[i][3] + ".\n");
		}
	}

}
