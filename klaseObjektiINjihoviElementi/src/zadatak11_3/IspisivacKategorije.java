package zadatak11_3;

public class IspisivacKategorije {
	
	public static void visina(int v) throws Exception {
		if(v < 120 || v > 250) {
			throw new RuntimeException("Greska u unosu visine");
		}
		if(v<160) {
			System.out.println("Nizak covek");
		} else if(v >= 160 && v < 185) {
			System.out.println("Srednje visok covek");
		} else {
			System.out.println("Visok covek");
		}
	}
	
	public static void godine(int g) throws Exception {
		if(g < 0 || g > 125) {
			throw new RuntimeException("Greska u unosu godina");
		}
		if(g < 29) {
			System.out.println("Mlad covek");
		} else if(g >= 30 && g < 55) {
			System.out.println("Zreo covek");
		} else {
			System.out.println("Star covek");
		}
	}

}
