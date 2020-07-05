package zadatak4_1;

public class NizBrojeva {

	int[] nizCelihBrojeva = new int[10];
	int brojacElemenataNiza = 0;
	
	void dodavanjeElementaUNizu(int broj) {
		
		nizCelihBrojeva[brojacElemenataNiza] = broj;
		brojacElemenataNiza++;			
	}
	
	void ispisivanjePrvogElementa() {
		System.out.println(nizCelihBrojeva[0]);
	}

	void ispisivanjeDesetogElementa() {
		System.out.println(nizCelihBrojeva[9]);
	}
	
	void ispisivanjeNtogElementa(int n) {
		System.out.println(nizCelihBrojeva[n]);
	}
	
	void ispisivanjeSvihElementa() {
		for (int i = 0;i<brojacElemenataNiza;i++) {
			System.out.println(nizCelihBrojeva[i]);
		}
	}
	
	int zbirElemenata() {
		int suma = 0;
		for (int i = 0;i<brojacElemenataNiza;i++) {
			suma+=nizCelihBrojeva[i];
		}
		return suma;
	}
	
	int proizvodElemenata() {
		int proizvod = 1;
		for (int i = 0;i<brojacElemenataNiza;i++) {
			proizvod*=nizCelihBrojeva[i];
		}
		return proizvod;
	}

	int minElement() {
		int ekstrem = nizCelihBrojeva[0];
		for (int i = 0;i<brojacElemenataNiza;i++) {
			if(nizCelihBrojeva[i]<ekstrem) {
				ekstrem=nizCelihBrojeva[i];
			}
		}
		return ekstrem;
	}
	
	int maxElement() {
		int ekstrem = nizCelihBrojeva[0];
		for (int i = 0;i<brojacElemenataNiza;i++) {
			if(nizCelihBrojeva[i]>ekstrem) {
				ekstrem=nizCelihBrojeva[i];
			}
		}
		return ekstrem;
	}
	
	boolean imaLiElementa(int broj) {
		for (int i = 0;i<brojacElemenataNiza;i++) {
			if(nizCelihBrojeva[i]==broj) {
				return true;
			}
		}
		return false;

	}
	
}
