package zadatak5_3;

public class TestAnalizatorReciIRecenica {

	public static void main(String[] args) {
		
		ANalizatorReciIRecenica analizator = new ANalizatorReciIRecenica();
		
		analizator.setTekst("Sunce sija. Nebo je plavo. Nema nijednog oblaka.");
		
		System.out.println(analizator.poslednjaRecIzTeksta());
		System.out.println(analizator.poslednjaRecenicaIzTeksta());
		
	}

}
