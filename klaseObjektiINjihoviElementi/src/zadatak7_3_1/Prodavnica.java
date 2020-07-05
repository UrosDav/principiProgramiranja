package zadatak7_3_1;

public class Prodavnica implements SluzbaNabavke, SluzbaProdaje {

	int brojProizvoda = 0;
	
	public void dodajRobu(int brojKomada) {
		if(brojKomada > 0) {
			this.brojProizvoda = this.brojProizvoda + brojKomada;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
		
	}
	
	public void prodajRobu(int brojKomada) {
		if(brojKomada > 0 && brojKomada<=this.brojProizvoda) {
			this.brojProizvoda = this.brojProizvoda - brojKomada;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
		
	}
	
	public void ispisi() {
		System.out.println("Broj proizvoda u prodavnici je: " + brojProizvoda);
	}
}
