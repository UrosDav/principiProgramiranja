package zadatak7_2_1;

public class TestGeometrijskihTela {

	public static void main(String[] args) {
		
		Kocka kocka = new Kocka();
		Kvadar kvadar = new Kvadar();
		
		kocka.setDuzinaStranice(25.5);
		kvadar.setDuzina(20);
		kvadar.setSirina(10);
		kvadar.setVisina(30);
				
		System.out.println("Povrsina kocke je " + kocka.getPovrsina());
		System.out.println("Zapremina kocke je " + kocka.getZapremina());
		
		System.out.println("Povrsina kvadra je " + kvadar.getPovrsina());
		System.out.println("Zapremina kvadra je " + kvadar.getZapremina());

	}

}
