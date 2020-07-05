package zadatak3_1_2;

public class Radio2 {
	
	double fmFrekvencija = 87.5;
	int amFrekvencija = 567;
	char band = 'F';
	
	void podesiFmFrekvenciju(double fmFrekvencija) {
		if ((fmFrekvencija >= 87.5) && (fmFrekvencija <= 108.0)) {
			this.fmFrekvencija = fmFrekvencija;
		} else {
			System.out.println("Nepravilan unos fmFrekvencije");
		}
	}

	void podesiAmFrekvenciju(int amFrekvencija) {
		if (amFrekvencija >= 567 && amFrekvencija <= 1567) {
			this.amFrekvencija = amFrekvencija;
		} else {
			System.out.println("Nepravilan unos amFrekvencije");
		}
	}
	
	void promeniBand(char band) {
		if (band == 'A' || band == 'F') {
			this.band = band;
		} else {
			System.out.println("Nepravilan unos banda");
		}
	}
	
	void ispisiParametre() {
		System.out.println("Band je: " + band);
		if(band == 'F') {
			System.out.println("FM frekvencija je: " + fmFrekvencija);
		} else {
			System.out.println("AM frekvencija je: " + amFrekvencija);
		}
	}
		
	
	
	
}
