package kurs1_osnove;

public class SortiranjeVezba {
	
	final static int MAXELEMENATA = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int[] niz = new int[MAXELEMENATA];
		
		System.out.print("Unesite broj elemenata niza:");
		n = TextIO.getlnInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("a[%d]=",i);
			niz[i] = TextIO.getlnInt();
		}
		
		
		//	Bubble sort	
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
		
		System.out.println("Elementi niza sortirani po rastucem redosledu:");
		System.out.print("{");
		for(int i=0; i<n; i++) {
			System.out.printf(" %d ", niz[i]);
		}
		System.out.print("}");
	}

}
