package zadatak2_5_2;

public class Proizvod {

	int sifra;
	String naziv;
	
	Proizvod(String naziv){
		this.naziv = naziv;
	}
	
	Proizvod(String naziv, int sifra){
		this.naziv = naziv;
		this.sifra = sifra;
	}
	
	void ispisi() {
		System.out.println("Sifra: " + sifra + " Naziv: " + naziv );
	}
}
