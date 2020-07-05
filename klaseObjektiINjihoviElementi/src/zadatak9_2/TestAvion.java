package zadatak9_2;

public class TestAvion {

	public static void main(String[] args) {
		
		Avion a = new Avion();
		
		a.uvediPutnika(21, "Jovan Jovanovic", 53);
		a.uvediPutnika(31, "Milos Milosevic", 23);
		a.uvediPutnika(41, "Ana Jovanovic", 41);
		
		a.ispisi();
		System.out.println();
		a.jovanovici();
		System.out.println();
		System.out.println("Prosecna starost putnika je " + a.prosecnaStarostPutnika());
		
	}

}
