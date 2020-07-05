package zadatak2_4_5;

public class ProveraKonvertoraTemperature {

	public static void main(String[] args) {
		
		KovertorTemperature konvertor = new KovertorTemperature();
		
		double tempF = konvertor.konvertujCUF(100);
		double tempC = konvertor.konvertujFUC(32);

		System.out.println(tempF);
		System.out.println(tempC);
		
	}

}
