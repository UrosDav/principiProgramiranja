package zadatak2_4_1;

public class Radio {

	double fmFrekvencija = 87.5;
	int amFrekvencija = 567;
	char band = 'F';
	
	void podesiFMFrekvenciju(double fmFrekvencija) {
		
		this.fmFrekvencija = fmFrekvencija;
		
	}

	void podesiAMFrekvenciju(int amFrekvencija) {
		
		this.amFrekvencija = amFrekvencija;
		
	}
	
	double vratiFMFrekvenciju() {
		
		return fmFrekvencija;
		
	}

	int vratiAMFrekvenciju() {
		
		return amFrekvencija;
		
	}
	
	void promeniBandNaAM() {
		
		band = 'A';
		
	}

	void promeniBandNaFM() {
		
		band = 'F';
		
	}

	char vratiBand() {
		
		return band;
		
	}
	
	void ispisiParametre() {
		
		System.out.println("fm frekvencija je: " + fmFrekvencija);
		System.out.println("am frekvencija je: " + amFrekvencija);
		System.out.println("band je: " + band);
		
	}
	
	
}
