package zadatak7_3_1;

public class TestProdavnica {

	public static void main(String[] args) {
		
		Prodavnica prodavnica = new Prodavnica();
		Skladiste skladiste = new Skladiste();
		Dobavljac dobavljac = new Dobavljac();
		
		prodavnica.ispisi();
		dobavljac.izvrsiIsporuku(prodavnica, 100);
		prodavnica.ispisi();
		dobavljac.izvrsiIsporuku(skladiste, 500);
		prodavnica.ispisi();

	}

}
