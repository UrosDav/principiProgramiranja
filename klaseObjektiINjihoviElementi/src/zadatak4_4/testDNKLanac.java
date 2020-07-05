package zadatak4_4;

public class testDNKLanac {

	public static void main(String[] args) {

		DNKLanac lanac = new DNKLanac(8);
		
		lanac.dodajKariku('A');
		lanac.dodajKariku('C');
		lanac.dodajKariku('C');
		lanac.dodajKariku('G');
		lanac.dodajKariku('T');
		lanac.dodajKariku('T');
		lanac.dodajKariku('T');
		lanac.dodajKariku('T');
		
		lanac.ispisiKarike();
		lanac.ispisiKarikeObrnuto();
		

	}

}
