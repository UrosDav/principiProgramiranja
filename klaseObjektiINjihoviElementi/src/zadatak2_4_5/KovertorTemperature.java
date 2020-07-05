package zadatak2_4_5;

public class KovertorTemperature {

	double konvertujCUF(double celzijusi) {
		double farenhajti = (celzijusi * 9)/5. +32;
		return farenhajti;
	}
	
	double konvertujFUC(double farenhajti) {
		double celzijusi = (farenhajti -32)*(5./9);
		return celzijusi;
	}
	
}
