package zadatak4_6;

public class TestUsluzneFunkcije {

	public static void main(String[] args) {
		
		int[] niz1 = new int[3];
		niz1[0] = 1;
		niz1[1] = 2;
		niz1[2] = 3;

		int[] niz2 = new int[3];
		niz2[0] = 4;
		niz2[1] = 5;
		niz2[2] = 6;
		
		
		UsluzneFunkcije.ispisiCelobrojnNiz(niz1);
		System.out.println();

		int[] novi = UsluzneFunkcije.spajanjeNizova(niz1, niz2);
		UsluzneFunkcije.ispisiCelobrojnNiz(novi);
	}

}
