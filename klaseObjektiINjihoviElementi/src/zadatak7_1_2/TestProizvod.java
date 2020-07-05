package zadatak7_1_2;

import java.util.GregorianCalendar;

public class TestProizvod {

	public static void main(String[] args) {
		
		GregorianCalendar datum = new GregorianCalendar();
		datum.set(2027, 11, 15);
		
		PrehrambeniProizvod proizvod1 = new PrehrambeniProizvod("hleb",30,datum);
		PrehrambeniProizvod proizvod2 = new PrehrambeniProizvod();
		
		proizvod2.setNaziv("senf");
		proizvod2.setCena(120.5);
		
		System.out.println("Naziv prvog proizvoda " + proizvod1.getNaziv());
		System.out.println("Cena prvog proizvoda " + proizvod1.getCena());
		
		System.out.println("Naziv drugog proizvoda " + proizvod2.getNaziv());
		System.out.println("Cena drugog proizvoda " + proizvod2.getCena());

	}

}
