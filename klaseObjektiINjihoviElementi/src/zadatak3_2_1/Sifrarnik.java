package zadatak3_2_1;

public class Sifrarnik {

	static void ispisiOcenu(int ocena) {
		switch (ocena) {
		case 1: System.out.println("Nedovoljan");
		break;
		case 2: System.out.println("Dovoljan");
		break;		
		case 3: System.out.println("Dobar");
		break;
		case 4: System.out.println("Vrlo dobar");
		break;
		case 5: System.out.println("Odlican");
		break;
		default: System.out.println("Uneli ste pogresan podatak");
		}
	}

	static String vratiOcenu(int ocena) {
		switch (ocena) {
		case 1: return "Nedovoljan";
		case 2: return "Dovoljan";
		case 3: return "Dobar";
		case 4: return "Vrlo dobar";
		case 5: return "Odlican";
		default: System.out.println("Uneli ste pogresan podatak");
		return "";
		}
	}
	
}
