package zadatak8_3_2.provera;

import zadatak8_3_2.ljudi.Osoba;
import zadatak8_3_2.zaposleni.Zaposleni;

public class TestOsoba {

	public static void main(String[] args) {
		
		Osoba o = new Osoba();
		Zaposleni z = new Zaposleni();
		
		o.setIme("Pera");
		o.setPrezime("Peric");
		o.setJmbg("3112979710089");
		
		z.setIme("Mika");
		z.setPrezime("Lazic");
		z.setJmbg("3110970710111");
		z.setPlata(40000);

		System.out.println("Ime osobe je " + o.getIme());
		System.out.println("Prezime osobe je " + o.getPrezime());
		System.out.println("JMBG osobe je " + o.getJmbg());
		
		z.ispisiZaposlenog();
		
	}

}
