package zadatak4_2;

public class NizCelihBrojeva {

	int[] niz;
	int brojac = 0;
	
	public NizCelihBrojeva(int broj) {
		niz = new int[broj];
	}
	
	void dodajElement(int broj) {
		if(niz.length==brojac) {
			System.out.println("Nema vise mesta");
			System.out.println();
		}else {
			niz[brojac]=broj;
			brojac++;
			
		}
	}
	
	int vratiZbirPrvogIPoslednjeg() {
		if(brojac<1) {
			System.out.println("Niz je prazan");
			System.out.println();
			return 0;
		}else if (brojac == 1) {
			return niz[0];
		}else{
			return niz[0] + niz[brojac - 1];
		}
	
	}

	int vratiZbirPozitivnihElemenata() {
		int suma = 0;
		for(int i = 0;i < brojac;i++) {
			if(niz[i] > 0) {
				suma+=niz[i];
			}
		}
		return suma;
	}
	
	int vratiProizvodNegativnihElemenata() {
		int proizvod = 1;
		for(int i = 0;i < brojac;i++) {
			if(niz[i] < 0) {
				proizvod*=niz[i];
			}
		}
		return proizvod;
	}
	
	int vratiBrojPonavljanjaElementaUNizu(int broj) {
		int brojacPojavljivanjaElementa = 0;
		for(int i = 0; i < brojac;i++) {
			if(niz[i]==broj) {
				brojacPojavljivanjaElementa++;
			}
		}
		return brojacPojavljivanjaElementa;

	}
	
	void ispisiParneElemente() {
		for(int i = 0;i < brojac;i++) {
			if(niz[i]%2==0) {
				System.out.println(niz[i]);
			}
		}
		System.out.println();
	}

	void ispisiElementeDeljiveSaPet() {
		for(int i = 0;i < brojac;i++) {
			if(niz[i]%5==0) {
				System.out.println(niz[i]);
			}
		}
		System.out.println();
	}
	
	void ispisiElementeUObrnutomRedosledu() {
		for(int i = brojac-1;i >= 0 ;i--) {
				System.out.println(niz[i]);
		}
		System.out.println();
	}
	
}