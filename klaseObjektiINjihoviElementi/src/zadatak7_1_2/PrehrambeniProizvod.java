package zadatak7_1_2;

import java.util.GregorianCalendar;

public class PrehrambeniProizvod extends Proizvod{
	
	GregorianCalendar rokTrajanja;
	
	public PrehrambeniProizvod() {
		
		super();
		this.rokTrajanja = new GregorianCalendar();
		
	}

	public PrehrambeniProizvod(String naziv, double cena, GregorianCalendar rokTrajanja) {
		
		super(naziv, cena);
		if(rokTrajanja != null && rokTrajanja.after(new GregorianCalendar())) {
			this.rokTrajanja = rokTrajanja;
		} else {
			System.out.println("Greska prilikom unosa");
			rokTrajanja = new GregorianCalendar();
		}
		
		
		
	}

	
}
