package zadatak4_5;

public class Autobus {

	boolean[] sedista = new boolean[50];
	
	public Autobus() {
		for(int i = 0;i<50;i++) {
			sedista[i]=true;
		}
	}
	
	
	void uvodjenjePutnika(int brojSedista) {
		if(brojSedista < 0 || brojSedista > 49) {
			System.out.println("Pogresan unis");
		} else if(sedista[brojSedista] == false) {
			System.out.println("Sediste je vec zauzeto");
		} else {
			sedista[brojSedista] = false;
		}
	}
	
	boolean imaLiSlobodnihMesta() {
		for (int i = 0; i < 50;i++) {
			if(sedista[i] == true) {
				return true;
			}
		}
		return false;
	}
	
	int brojSlobodnihMesta() {
		int suma = 0;
		for (int i = 0; i < 50;i++) {
			if(sedista[i] == true) {
				suma++;
			}
		}
		return suma;
	}
	
	int brojZauzetihMesta() {
		return 50 - brojSlobodnihMesta();
	}
	
	void ispisiStatusSedista() {
		for(int i = 0;i<50;i++) {
			if (sedista[i] == true) {
				System.out.println("Sediste broj " + i + " je slobodno");
			} else {
				System.out.println("Sediste broj " + i + " je zauzeto");
			}
			
		}
	}
}
