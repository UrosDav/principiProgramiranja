package zadatak3_1_5;

public class TroskoviRegistracije {

	static double obracunajDoprinos(Automobil a) {
		if(a.kubikaza < 1000) {
			return 145.5;
		} else if(a.kubikaza < 1400) {
			return 200.5;
		} else if(a.kubikaza < 2500) {
			return 250.5;
		} else {
			return 413.3;
		}
	}
	
	static double obracunajOsiguranje(Automobil a) {
		if(a.snaga < 55) {
			return 3000;
		} else if(a.snaga < 75) {
			return 4500;
		} else if(a.snaga < 150) {
			return 7300;
		} else {
			return 9000;
		}		
	}
	
	static void ispisiSveTroskove(Automobil a) {
		System.out.println("Trosak doprinosa je " + obracunajDoprinos(a));
		System.out.println("Trosak osiguranja je " + obracunajOsiguranje(a));
	}
}
