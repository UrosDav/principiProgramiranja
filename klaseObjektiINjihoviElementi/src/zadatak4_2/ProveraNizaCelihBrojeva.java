package zadatak4_2;

public class ProveraNizaCelihBrojeva {

	public static void main(String[] args) {

		NizCelihBrojeva niz1 = new NizCelihBrojeva(3);
		NizCelihBrojeva niz2 = new NizCelihBrojeva(5);
		NizCelihBrojeva niz3 = new NizCelihBrojeva(10);

		niz1.dodajElement(1);
		niz1.dodajElement(-1);
		niz1.dodajElement(3);
		
		niz2.dodajElement(34);
		niz2.dodajElement(45);
		
		niz3.dodajElement(56);
		niz3.dodajElement(67);
		niz3.dodajElement(-89);
		
		System.out.println(niz1.vratiZbirPrvogIPoslednjeg());
		System.out.println();
		
		niz2.ispisiElementeUObrnutomRedosledu();
		niz3.ispisiElementeUObrnutomRedosledu();
		
		
	}

}
