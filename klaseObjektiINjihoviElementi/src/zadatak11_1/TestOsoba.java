package zadatak11_1;

public class TestOsoba {

	public static void main(String[] args) {
		
		Osoba osoba = new Osoba();
		osoba.setGodine(33);
		osoba.setIme("Uros");
		osoba.setPrezime("Davidovic");
		osoba.setTezina(75);
		osoba.setVisina(175);
		
		System.out.println(osoba);
		System.out.println();
		
		Osoba osoba2 = new Osoba();
		osoba2.setGodine(33);
		osoba2.setIme("Uros");
		osoba2.setPrezime("Davidovic");
		osoba2.setTezina(75);
		osoba2.setVisina(175);
		
		System.out.println(osoba.equals(osoba2));
		System.out.println();
		
		osoba.setVisina(49);
		System.out.println(osoba);
		System.out.println();

	}

}
