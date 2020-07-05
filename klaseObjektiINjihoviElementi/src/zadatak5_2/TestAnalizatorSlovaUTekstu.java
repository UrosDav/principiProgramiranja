package zadatak5_2;

public class TestAnalizatorSlovaUTekstu {

	public static void main(String[] args) {
		
		AnalizatorSlovaUTekstu analizator = new AnalizatorSlovaUTekstu();

		analizator.setTekst("Dan je lep. Da li je lep? Da, stvarno je LEP!");
		
		System.out.println(analizator.brojSamoglasnika());
		System.out.println(analizator.brojRecenica());
		System.out.println(analizator.drugoPojavljivanjeSlovaA());
	}

}
