package zadatak9_3;

public class Kontakt {
	
	private String imePrezime = null;
	private String adresa = null;
	private String telefon = null;
	
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		if(imePrezime == null) {
			System.out.println("Doslo je do greske prilikom unosa");
		} else {
			this.imePrezime = imePrezime;	
		}
		
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		if(adresa == null) {
			System.out.println("Doslo je do greske prilikom unosa");
		} else {
			this.adresa = adresa;
		}
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		if(telefon == null) {
			System.out.println("Doslo je do greske prilikom unosa");
		} else {
			this.telefon = telefon;
		}
	}
	
	@Override
	public String toString() {
		return "Kontakt [imePrezime=" + imePrezime + ", adresa=" + adresa + ", telefon=" + telefon + "]";
	}
	
	
}
