package zadatak7_4_2;

public class TestOsoba {

	public static void main(String[] args) {
		
		Osoba o1 = new Osoba();
		o1.ime = "Pera";
		o1.prezime = "Peric";
		o1.jmbg = "1010980710034";
		
		Osoba o2 = new Osoba();
		o2.ime = "Pera";
		o2.prezime = "Peric";
		o2.jmbg = "1010980710034";

		if(o1.equals(o2)) {
			System.out.println("Osoba je ista");
		} else {
			System.out.println("Osobe su razlicite");
		}
		
		System.out.println(o1);
	}

}
