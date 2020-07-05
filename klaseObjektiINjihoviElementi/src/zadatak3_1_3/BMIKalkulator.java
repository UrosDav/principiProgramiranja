package zadatak3_1_3;

public class BMIKalkulator {
	
	static double izracunajBMI(double visina, double tezina) {
		if(visina < 1.2 || visina> 2.4) {
			System.out.println("Visina je van granica opsega");
			return 0;
		} else if (tezina < 30 || tezina > 200) {
			System.out.println("Tezina je van granica opsega");
			return 0;
		} else {
			return tezina/(visina*visina);
		}
	}

	static void ispisiBMI(double bmi) {
		if (bmi > 0 && bmi <=15) {
			System.out.println("Anoreksija");
		} else if (bmi > 15 && bmi <= 18.5) {
			System.out.println("Mrsavost");
		} else if (bmi > 18.5 && bmi <= 25) {
			System.out.println("Normalno");
		} else if (bmi > 25 && bmi <= 30) {
			System.out.println("Popunjen");
		} else if (bmi > 30 && bmi <= 40) {
			System.out.println("Debeo");
		} else if (bmi > 40){
			System.out.println("Gojazan");
		}
	}
	
}
