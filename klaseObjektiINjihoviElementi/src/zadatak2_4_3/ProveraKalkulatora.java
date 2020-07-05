package zadatak2_4_3;

public class ProveraKalkulatora {

	public static void main(String[] args) {
		
		Kalkulator kalkulator = new Kalkulator();
		
		int v1 = kalkulator.oduzmi(5, 3);
		double v2 = kalkulator.podeli(34.6, 28.9);
		int v3 = kalkulator.podeliDIV(349, 7);
		int v4 = kalkulator.podeliMOD(567, 34);
		double v5 = kalkulator.pomnozi(34.7, 5678.3);
		int v6 = kalkulator.pomnozi(33, 12);
		int v7 = kalkulator.saberi(57, 39);

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		
	}

}
