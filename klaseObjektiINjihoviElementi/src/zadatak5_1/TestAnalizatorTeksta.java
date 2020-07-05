package zadatak5_1;

public class TestAnalizatorTeksta {

	public static void main(String[] args) {
		
		AnalizatorTeksta analizator1 = new AnalizatorTeksta();
		AnalizatorTeksta analizator2 = new AnalizatorTeksta("Danas je lep dan");
		
		analizator1.setTekst("Nebo je plavo.");
		analizator1.konkatenacijaNaTekstPozadi("Sunce sija");
		analizator2.daLiJeStringIsti("lep dan");
		
		System.out.println(analizator1.getTekst());
		System.out.println(analizator2.getTekst());

	}

}
