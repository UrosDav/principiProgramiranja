package zadatak2_3_2;

public class TestOsoba {

	public static void main(String[] args) {
		
		Osoba osoba1 = new Osoba();
		Osoba osoba2 = new Osoba();
		
		osoba1.imePrezime = "Pera Peric";
		osoba1.tezina = 81.6;
		
		osoba2.imePrezime = "Mika Mikic";
		osoba2.tezina = 100;
		
		System.out.println(osoba1.imePrezime);
		System.out.println(osoba1.tezina);
		System.out.println(osoba2.imePrezime);
		System.out.println(osoba2.tezina);
		
		System.out.println("Ime osobe je: " + osoba1.imePrezime);
		System.out.println("Tezina osobe je: " + osoba1.tezina);
		System.out.println("Ime osobe je: " + osoba2.imePrezime);
		System.out.println("Tezina osobe je: " + osoba2.tezina);
		
		System.out.println("Ime: " + osoba1.imePrezime + " Tezina: " + osoba1.tezina);
		System.out.println("Ime: " + osoba2.imePrezime + " Tezina: " + osoba2.tezina);

	}

}
