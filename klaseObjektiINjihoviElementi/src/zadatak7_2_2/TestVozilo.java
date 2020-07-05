package zadatak7_2_2;

public class TestVozilo {

	public static void main(String[] args) {
		
		Automobil automobil = new Automobil();
		Avion avion = new Avion();
		
		automobil.setMarka("Mercedes");
		automobil.setModel("E220");
		
		avion.setMarka("Boing");
		avion.setModel("747");
		
		automobil.ispisi();
		avion.ispisi();
		
	}

}
