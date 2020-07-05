package zadatak7_3_1;

public class Skladiste implements SluzbaNabavke{
	
	int stanjeNaSkladistu = 1000;
	
	public void dodajRobu(int brojKomada) {
		if(brojKomada > 0) {
			this.stanjeNaSkladistu = this.stanjeNaSkladistu + brojKomada;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	
	public void skiniSaStanja(int brojKomada) {
		if(brojKomada > 0 && brojKomada <= this.stanjeNaSkladistu) {
			this.stanjeNaSkladistu = this.stanjeNaSkladistu - brojKomada;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	
}
