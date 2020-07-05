package zadatak2_8_1;

public class Formula1Tim {

	String naziv;
	Osoba menadzer;
	Osoba prviVozac;
	Osoba drugiVozac;
	
	void ispisiPodatkeOTimu() {
		
		System.out.println("Naziv tima je " + naziv);
		System.out.println("Menadzer:");
		menadzer.ispisiPodatkeOOsobi();
		System.out.println("Prvi vozac:");
		prviVozac.ispisiPodatkeOOsobi();
		System.out.println("Drugi vozac:");
		drugiVozac.ispisiPodatkeOOsobi();
		
	}
	
}
