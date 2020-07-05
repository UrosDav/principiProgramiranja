package zadatak8_3_2.zaposleni;

import zadatak8_3_2.ljudi.Osoba;

public class Zaposleni extends Osoba {

	private double plata;

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		if(plata > 0) {
			this.plata = plata;
		} else {
			System.out.println("Doslo je do greske prilikom unosa plate.");
		}
	
	}
	
	public void ispisiZaposlenog() {
		super.ispisi();
		System.out.println("Plata osobe je " + plata);
	}
	
	
}
