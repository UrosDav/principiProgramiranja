package zadatak5_4;

public class TestBrojacReci {

	public static void main(String[] args) {
		
		String tekst = "Danas je lep dan. Bas lep.";
		
		System.out.println(BrojacReci.brojOdredjeneReciUTekstu(tekst,"lep"));
		
		System.out.println(BrojacReci.najcescaRecUTekstu(tekst));

		System.out.println(BrojacReci.najredjaRecUTekstu(tekst));
	}

}
