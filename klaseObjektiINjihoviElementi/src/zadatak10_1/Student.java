package zadatak10_1;

public class Student {

	private String brojIndeksa;  //format je XXXX/BB gde je XXXX broj indeksa, a BB godina upisa
	private String ime;
	private String prezime;
	private int ocena;
	
	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(String brojIndeksa) {
		if (brojIndeksa != null) {
				this.brojIndeksa = brojIndeksa;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if (ime != null) {
			this.ime = ime;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
		
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		if(prezime != null) {
			this.prezime = prezime;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
		
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		if (ocena >= 5 || ocena <= 10) {
			this.ocena = ocena;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
		
	}
	
	public String toString() {
		return "Student " + ime + " " + prezime + ", broj indeksa " + brojIndeksa + " dobio je ocenu " + ocena;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student) o;
			if(this.brojIndeksa.equals(s.getBrojIndeksa())) {
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
