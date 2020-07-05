package zadatak9_1;

public class TestParking {

	public static void main(String[] args) {
		
		Parking parking = new Parking(50);
		
		parking.uvediVozilo("BG 123-456");
		parking.uvediVozilo("NS 234-56");
		
		parking.ispisiRegistarskeBrojeve();
		System.out.println();
		parking.ispisiBeogradskeRegistarskeBrojeve();
		
	}

}
