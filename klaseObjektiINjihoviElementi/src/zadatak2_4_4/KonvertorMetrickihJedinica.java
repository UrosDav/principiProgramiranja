package zadatak2_4_4;

public class KonvertorMetrickihJedinica {

	double konvertujKilometreUMilje(double kilometri) {
		double milje = kilometri / 1.609;
		return milje;
	}
	
	double konvertujMiljeUKilometre(double milje) {
		double kilometri = milje * 1.609;
		return kilometri;
	}

	double konvertujStopeUCentimetre(double stope) {
		double centimetri = stope * 30.48;
		return centimetri;
	}
	
	double konvertujCentimetreUStope(double centimetri) {
		double stope = centimetri / 30.48;
		return stope;
	}
}
