package zadatak7_3_2;

public class MuzickiStub extends MuzickiUredjaj implements RadioKomponenta,CDKomponenta{
	
	double frekvencija = 87.5;
	int brojPesme;
	boolean ukljucenRadio;
	boolean ukljucenCD;
	
	public void promeniStanicu(double frekvencija) {
		this.ukljucenRadio = true;
		this.ukljucenCD = false;
		if(frekvencija >= 87.5 && frekvencija <=108) {
			this.frekvencija = frekvencija;
		} else {
			this.frekvencija = 87.5;
		}
	}

	public void pustiPesmu(int brojPesme) {
		this.ukljucenCD = true;
		this.ukljucenRadio = false;
		if(brojPesme >=1 && brojPesme <= 21) {
			this.brojPesme = brojPesme;
		} else {
			this.brojPesme = 1;
		}
	}
	
	public void ispisi() {
		if(this.ukljucenUredjaj) {
			System.out.println("Muzicki stub je ukljucen");
			System.out.println("Trenutna jacina tona je " + this.jacinaTona);
			if(this.ukljucenRadio) {
				System.out.println("Trenutna radio stanica je " + this.frekvencija);
			}
			if(this.ukljucenCD) {
				System.out.println("Trenutna pesma koja se pusta je " + this.brojPesme);
			}
		} else {
			System.out.println("Radio je iskljucen");
		}
		
	}
}
