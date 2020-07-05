package zadatak2_8_1;

public class TestFormula1Tim {

	public static void main(String[] args) {
		
		Formula1Tim tim = new Formula1Tim();
		tim.naziv = "Scuderia Ferrari Marlboro";
		
		tim.menadzer = new Osoba();
		tim.menadzer.ime = "Berny";
		tim.menadzer.prezime = "Eckleston";
		
		tim.prviVozac = new Osoba();
		tim.prviVozac.ime = "Kimi";
		tim.prviVozac.prezime = "Raikkonen";
		
		tim.drugiVozac = new Osoba();
		tim.drugiVozac.ime = "Felipe";
		tim.drugiVozac.prezime = "Massa";
		
		tim.ispisiPodatkeOTimu();
		
	}

}
