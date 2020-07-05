package zadatak11_3;

public class TestIspitivacKategorija {

	public static void main(String[] args) {

		try {
			IspisivacKategorije.visina(12);
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		try {
			IspisivacKategorije.godine(200);
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
