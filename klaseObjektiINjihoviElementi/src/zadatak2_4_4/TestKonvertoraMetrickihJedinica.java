package zadatak2_4_4;

public class TestKonvertoraMetrickihJedinica {

	public static void main(String[] args) {
		
		KonvertorMetrickihJedinica konvertor = new KonvertorMetrickihJedinica();
		
		double v1 = konvertor.konvertujCentimetreUStope(3124.6);
		double v2 = konvertor.konvertujKilometreUMilje(456.2);
		double v3 = konvertor.konvertujMiljeUKilometre(234.9);
		double v4 = konvertor.konvertujStopeUCentimetre(7683.47);

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
	}

}
