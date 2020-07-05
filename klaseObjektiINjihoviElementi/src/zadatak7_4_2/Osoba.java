package zadatak7_4_2;

public class Osoba {
	
	public String ime = "N";
	public String prezime = "N";
	public String jmbg;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if(ime != null) {
			this.ime = ime;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
		
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		if (prezime != null) {
			this.prezime = prezime;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
		
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		if (jmbg != null) {
			this.jmbg = jmbg;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
		
	}
	
	public String toString() {
		return "ime: " + this.ime + ", prezime: " + this.prezime;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Osoba) {
			Osoba osoba = (Osoba) o;
			if (this.jmbg.equals(osoba.getJmbg()) && this.ime.equals(osoba.getIme()) && this.prezime.equals(osoba.getPrezime())) {
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
			return false;
		}
	}

}
