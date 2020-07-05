package zadatak6_1;

import java.util.GregorianCalendar;

public class IstorijskiDogadjaj {
	
	String nazivDogadjaja;
	GregorianCalendar datumDogadjaja;
	
	public IstorijskiDogadjaj(String nazivDogadjaja, int godina, int mesec, int dan ) {
		this.nazivDogadjaja = nazivDogadjaja;
		datumDogadjaja = new GregorianCalendar();
		this.datumDogadjaja.set(godina, mesec - 1, dan);
	}
	
	void godisnjeDobaDogadjaja() {
		int mesec = datumDogadjaja.get(GregorianCalendar.MONTH)+1;
		int dan = datumDogadjaja.get(GregorianCalendar.DAY_OF_MONTH);
		if((mesec == 3 && dan >=22) || mesec == 4 || mesec == 5 || (mesec == 6 && dan <= 21)) {
			System.out.println("Prolece");
		} else if((mesec == 6 && dan >=22) || mesec == 7 || mesec == 8 || (mesec == 9 && dan <= 22)) {
			System.out.println("Leto");
		} else if((mesec == 9 && dan >=23) || mesec == 10 || mesec == 11 || (mesec == 12 && dan <= 21)) {
			System.out.println("Jesen");
		} else {
			System.out.println("Zima");
		}
	}
	
	void staSeDesiloPre(IstorijskiDogadjaj dogadjaj) {
		if(this.datumDogadjaja.before(dogadjaj.datumDogadjaja)) {
			System.out.println("Pre se dogodio dogadjaj " + this.nazivDogadjaja);
		} else {
			System.out.println("Pre se dogodio dogadjaj " + dogadjaj.nazivDogadjaja);
		}
	}

	void ispisiDogadjaj() {
		int godina = datumDogadjaja.get(GregorianCalendar.YEAR);
		int mesec = datumDogadjaja.get(GregorianCalendar.MONTH) + 1;
		int dan = datumDogadjaja.get(GregorianCalendar.DATE);
		System.out.println("Dana" + dan + ":" + mesec + ":" + godina + " se desio dogadjaj: " + nazivDogadjaja );
	}
}
