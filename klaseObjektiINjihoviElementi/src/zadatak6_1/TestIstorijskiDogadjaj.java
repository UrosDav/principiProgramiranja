package zadatak6_1;

public class TestIstorijskiDogadjaj {

	public static void main(String[] args) {
		
		IstorijskiDogadjaj dogadjaj1 = new IstorijskiDogadjaj("Bombardovanje Beograda u II svetskom ratu", 1941, 4, 6);
		IstorijskiDogadjaj dogadjaj2 = new IstorijskiDogadjaj("NATO bombardovanje Beograda", 1999, 3, 24);
		
		dogadjaj1.godisnjeDobaDogadjaja();
		System.out.println();
		dogadjaj2.godisnjeDobaDogadjaja();
		System.out.println();
		dogadjaj1.staSeDesiloPre(dogadjaj2);
		
		
	}

}
