package zadatak8_3_2.ljudi;

public class Osoba {

	private String ime = "N";
	private String prezime = "N";
	private String jmbg;
	
	private boolean proveriJMBG (String jmbg) {
		if (jmbg.length() == 13 && jmbg != null) {
			return true;
		} else {
			return false;
		}
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if(ime != null) {
			this.ime = ime;
		} else {
			System.out.println("Doslo je do greske prilikom unosa imena");
		}
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		if(prezime != null) {
			this.prezime = prezime;
		} else {
			System.out.println("Doslo je do greske prilikom unosa prezimena");
		}
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		if(proveriJMBG(jmbg)) {
			this.jmbg = jmbg;
		} else {
			System.out.println("doslo je do greske prilikom unosa jmbg-a");
		}
		
	}
	
	protected void ispisi() {
		System.out.println("Ime osobe je " + ime);
		System.out.println("Prezime osobe je " + prezime);
		System.out.println("JMBG osobe je " + jmbg);
	}
	
}
