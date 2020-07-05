package zadatak7_1_2;

public class Proizvod {

	String naziv;
	double cena;
	
	public Proizvod() {
		this.naziv = "nepoznat";
		this.cena = 0.0;
	}

	public Proizvod(String naziv, double cena) {
		if(naziv != null && cena > 0) {
			this.naziv = naziv;
			this.cena = cena;
		} else {
			System.out.println("Greska prilikom unosa");
			this.naziv = "nepoznat";
			this.cena = 0.0;
		}
	}
	
	public String getNaziv() {
		return this.naziv;
	}
	
	public void setNaziv(String naziv) {
		if(naziv != null) {
			this.naziv = naziv;
		} else {
			System.out.println("Greska prilikom unosa");
			this.naziv = "nepoznat";
		}
	}
	
	public double getCena() {
		return this.cena;
	}
	
	public void setCena(double cena) {
		if(cena > 0) {
			this.cena = cena;
		} else {
			System.out.println("Greska prilikom unosa");
			this.cena = 0;
		}
	}
}
