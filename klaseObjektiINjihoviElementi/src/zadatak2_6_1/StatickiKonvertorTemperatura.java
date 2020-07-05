package zadatak2_6_1;

public class StatickiKonvertorTemperatura {

	static double konvertujCUF(double temperatura){
		return temperatura*9/5 + 32;
	}

	static double konvertujFUC(double temperatura){
		return (temperatura - 32)*5/9;
	}
}
