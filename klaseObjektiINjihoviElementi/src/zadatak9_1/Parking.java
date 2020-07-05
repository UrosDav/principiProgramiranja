package zadatak9_1;

public class Parking {
	
	private ParkingMesto[] mesta;

	public Parking(int kapacitetParkingMesta) {
		
		if(kapacitetParkingMesta > 0) {
			mesta = new ParkingMesto[kapacitetParkingMesta];
		} else {
			mesta = new ParkingMesto[40];
			System.out.println("Doslo je do greske prilikom unosa");
		}
		
		for(int i = 0; i < mesta.length;i++) {
			mesta[i] = new ParkingMesto();
			mesta[i].setSlobodno(true);
		}
		
	}
	
	public void ispisiRegistracijuNaPrvomMestu() {
		if(!mesta[0].isSlobodno()) {
			System.out.println("Registarska tablica je " + mesta[0].getRegistarskiBroj());
		}
			System.out.println("Mesto je slobodno");
	}
	
	public void ispisiRegistracijuNaPoslednjemMestu() {
		int poslednje = mesta.length - 1; 
		if(!mesta[poslednje].isSlobodno()) {
			System.out.println("Registarska tablica je " + mesta[poslednje].getRegistarskiBroj());
		}
			System.out.println("Mesto je slobodno");
	}
	
	public boolean imaLiSlobodnihMesta() {
		for(int i = 0; i < mesta.length; i++) {
			if(mesta[i].isSlobodno()) {
				return true;
			}
		}
		return false;
	}

	public int brojSlobodnihMesta() {
		int brojac = 0;
		for(int i = 0; i < mesta.length; i++) {
			if(mesta[i].isSlobodno()) {
				brojac++;
			}
		}
		return brojac;
	}
	
	public boolean imaLiVozila(String registarskiBroj) {
		for(int i = 0; i < mesta.length; i++){
			if(registarskiBroj.equals(mesta[i].getRegistarskiBroj())) {
				return true;
			}
		}
		return false;
	}
	
	public void uvediVozilo(String registarskiBroj) {
		if(imaLiSlobodnihMesta()) {
			for(int i = 0; i < mesta.length; i++) {
				if(mesta[i].isSlobodno()) {
					mesta[i].setRegistarskiBroj(registarskiBroj);
					mesta[i].setSlobodno(false);
					break;
				}
			}	
		} else {
			System.out.println("Nema mesta na parkingu");
		}
	}
	
	public void izvediVozilo(String registarskiBroj) {
		if(imaLiVozila(registarskiBroj)) {
			for(int i = 0; i < mesta.length; i++) {
				if(registarskiBroj.equals(mesta[i].getRegistarskiBroj())) {
					mesta[i].setRegistarskiBroj(null);
					mesta[i].setSlobodno(true);;
					break;
				}
			}	
		} else {
			System.out.println("Nema mesta na parkingu");
		}
	}
	
	public void ispisiRegistarskeBrojeve() {
		for(int i = 0; i < mesta.length; i++) {
			if(!mesta[i].isSlobodno()) {
				int lot = i + 1; 
				System.out.println("Na mestu " + lot + " je vozilo sa registarskom tablicom " + mesta[i].getRegistarskiBroj());
			}
		}
	}
	
	public void ispisiBeogradskeRegistarskeBrojeve() {
		for(int i = 0; i < mesta.length; i++) {
			if(!mesta[i].isSlobodno()) {
				if(mesta[i].getRegistarskiBroj().substring(0,2).equals("BG")) {
					int lot = i + 1; 
					System.out.println("Na mestu " + lot + " je vozilo sa registarskom tablicom " + mesta[i].getRegistarskiBroj());	
				}
				
			}
		}
	}
}
