package zadatak4_1;

public class ProveraNizBrojeva {

	public static void main(String[] args) {
		
		NizBrojeva niz1 = new NizBrojeva();
		NizBrojeva niz2 = new NizBrojeva();

		niz1.dodavanjeElementaUNizu(4);
		niz1.dodavanjeElementaUNizu(7);
		System.out.println(niz1.zbirElemenata());
		
		niz2.dodavanjeElementaUNizu(3);
		niz2.dodavanjeElementaUNizu(5);
		niz2.dodavanjeElementaUNizu(10);
		System.out.println(niz2.minElement());
		
	}

}
