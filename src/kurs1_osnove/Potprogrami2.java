package kurs1_osnove;

public class Potprogrami2 {
	
	static final int MAX_POLAZNIKA = 40;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] podaci = new String[MAX_POLAZNIKA][4];
		int n = unosBrojaPolaznika();
		unosPolaznika(podaci, n);
		sortPoJmbg(podaci, n);
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
	
	static void sortPoJmbg(String[][] matrica, int n) {
		String temp = "";
		for (int i=0; i<n; i++) {
			for (int j=1; j<(n-i); j++) {
				if((matrica[j-1][2]).compareTo(matrica[j][2]) > 0) {
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
