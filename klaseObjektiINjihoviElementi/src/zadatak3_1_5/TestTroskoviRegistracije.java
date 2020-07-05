package zadatak3_1_5;

public class TestTroskoviRegistracije {

	public static void main(String[] args) {
		
		Automobil a = new Automobil();
		
		a.marka = "Mercedes";
		a.model = "A 170";
		a.kubikaza = 1690;
		a.snaga = 95;

		TroskoviRegistracije.ispisiSveTroskove(a);
		
		double doprinos = TroskoviRegistracije.obracunajDoprinos(a);
		double osiguranje = TroskoviRegistracije.obracunajOsiguranje(a);
		double troskovi = doprinos + osiguranje;
		
		System.out.println("Ukupni troskovi su " + troskovi);
		
		
	}

}
