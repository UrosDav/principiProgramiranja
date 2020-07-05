package zadatak4_3;

public class TestNizCena {
	
	public static void main(String[] args) {
	
		NizCena niz = new NizCena();
		
		niz.dodajCenu(123);
		niz.dodajCenu(234.55);
		niz.dodajCenu(301);
		niz.dodajCenu(5000);
		
		niz.cenePreko(300);
		System.out.println(niz.razlikaMaxIMinCene());
		
	}
	
	
}
