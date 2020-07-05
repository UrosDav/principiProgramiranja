package primer35;

public class TestSistemNagradjivanja {

	public static void main(String[] args) {
		
		Zaposleni zaposleni = new Zaposleni();
		zaposleni.ime = "Uros";
		zaposleni.prezime = "Davidovic";
		zaposleni.godineStaza = 10;
		
		double nagrada = SistemNagradjivanja.izracunajVarijabilniDeoPlate(zaposleni);
		
		System.out.println("Nagrada je " + nagrada);

	}

}
