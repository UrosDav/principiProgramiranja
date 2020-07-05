package zadatak4_6;

public class UsluzneFunkcije {
	
	static void ispisiCelobrojnNiz(int[] niz) {
		for (int i = 0 ; i<niz.length;i++) {
			System.out.println(niz[i]);
		}
	}
	
	static void ispisiRealanNiz(double[] niz) {
		for (int i = 0 ; i<niz.length;i++) {
			System.out.println(niz[i]);
		}
	}

	static double[] vratiRealanNiz(double[] niz) {
			return niz;
	}

	static int[] spajanjeNizova(int[] prvi, int[] drugi) {
		int[] niz = new int[prvi.length + drugi.length];
		for(int i = 0;i<prvi.length;i++) {
			niz[i] = prvi[i];
		}
		for(int i = 0; i<drugi.length;i++) {
			niz[i + prvi.length] = drugi[i];
		}
		return niz;
	}
	
	
}
