package zadatak11_4;

public class TestRacun {

	public static void main(String[] args) {

		Racun r = new Racun();
		
		try {
			r.setBrojRacuna(-111);
		} catch (RacunException e) {
			System.out.println("Greska: " + e.getMessage());
		}
		
		r.setIznosRacuna(1256);
		r.setProizvod("patike");
		
		System.out.println(r);

	}

}
