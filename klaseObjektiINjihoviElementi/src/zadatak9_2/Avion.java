package zadatak9_2;

public class Avion {
	
	private MestoUAvionu[] mesta;
	final int ukupanBrojSedista = 120;
	
	public Avion() {
		mesta = new MestoUAvionu[ukupanBrojSedista];
		
		for(int i = 0; i < ukupanBrojSedista; i++) {
			mesta[i] = new MestoUAvionu();
		}
	}
	
	public void uvediPutnika(int sediste, String imeIPrezime, int starost) {
		if(sediste > 119 || sediste < 0 || !mesta[sediste].isSlobodno()) {
			System.out.println("Doslo je do greske prilikom unosa");
		} else {
			mesta[sediste].setSlobodno(false);
			mesta[sediste].setImeIPrezime(imeIPrezime);
			mesta[sediste].setStarost(starost);
			
		}
	}
	
	public void izvediPutnika(int sediste) {
		if(sediste > 119 || sediste < 0 || mesta[sediste].isSlobodno()) {
			System.out.println("Doslo je do greske prilikom unosa");
		} else {
			mesta[sediste].setSlobodno(true);
			mesta[sediste].setImeIPrezime(null);
			mesta[sediste].setStarost(0);
			
		}
	}

	public boolean daLiJeUAvionu(String imeIPrezime, int starost) {
		for(int i = 0; i < mesta.length; i++) {
			if(mesta[i].getStarost() == starost && mesta[i].getImeIPrezime().equals(imeIPrezime)) {
				return true;
			}
		}
		return false;
	}
	
	public double zauzetost() {
		int brojac = 0;
		for(int i = 0; i<mesta.length;i++) {
			if(!mesta[i].isSlobodno()) {
				brojac++;
			}
		}
		return brojac*100/(mesta.length);
	}
	
	public boolean imaLiSlobodnihSedista() {
		for(int i = 0; i<mesta.length;i++) {
			if(mesta[i].isSlobodno()) {
				return true;
			}
		}
		return false;
	}
	
	public int prosecnaStarostPutnika() {
		int godine = 0;
		int brojac = 0;
		for(int i = 0; i < mesta.length; i++ ) {
			if(!mesta[i].isSlobodno()) {
				godine+=mesta[i].getStarost();
				brojac++;
			}
		}
		return godine/brojac;
	}
	
	public int najstarijiPutnik() {
		int maks = mesta[0].getStarost();
		for(int i = 1; i < mesta.length; i++ ) {
			if(!mesta[i].isSlobodno() && mesta[i].getStarost() > maks) {
				maks = mesta[i].getStarost();
			}
		}
		return maks;
	}
	
	public int najmladjiPutnik() {
		int min = mesta[0].getStarost();
		for(int i = 1; i < mesta.length; i++ ) {
			if(!mesta[i].isSlobodno() && mesta[i].getStarost() < min) {
				min = mesta[i].getStarost();
			}
		}
		return min;
	}
	
	public void ispisi() {
		int lot;
		for(int i = 0; i < mesta.length; i++) {
			lot = i + 1;
			if(mesta[i].isSlobodno()) {
				System.out.println("Sediste " + lot + " je prazno");
			} else {
				//System.out.println("Na sedistu " + lot + " sedi " + mesta[i].getImeIPrezime() + ", godina starosti " + mesta[i].getStarost());
				System.out.println("Na sedistu " + lot + " sedi " + mesta[i]);
			}
		}
	}
	
	public void jovanovici() {
		int lot;
		for(int i = 0; i < mesta.length; i++) {
			lot = i + 1;
			if(!mesta[i].isSlobodno() && mesta[i].getImeIPrezime().split(" ")[1].equals("Jovanovic")) {
				System.out.println("Na sedistu " + lot + " sedi " + mesta[i].getImeIPrezime() + ", godina starosti " + mesta[i].getStarost());
			}
		}
		
	}
}
