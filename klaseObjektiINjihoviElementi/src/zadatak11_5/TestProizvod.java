package zadatak11_5;

public class TestProizvod {

	public static void main(String[] args) {
		
		Proizvod p = new Proizvod();
		
		try {
			p.setCenaProizvoda(1000);
		} catch (ProizvodException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			p.setNazivProizvoda(null);
		} catch (ProizvodException e) {
			System.out.println(e.getMessage());
		}

		try {
			p.setSifraProizvoda(0);;
		} catch (ProizvodException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(p);
	}

}
