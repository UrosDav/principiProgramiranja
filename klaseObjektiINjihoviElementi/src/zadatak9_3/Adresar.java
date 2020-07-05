package zadatak9_3;

public class Adresar {
	
	private Kontakt[] kontakti;
	
	public Adresar() {
		kontakti = new Kontakt[250];
		for(int i = 0; i < 250; i++) {
			kontakti[i] = new Kontakt();
		}
	}
	
	public boolean imaLiSlobodnih() {
		for(int i = 0; i < kontakti.length; i++) {
			if(kontakti[i].getImePrezime()==null) {
				return true;
			}
		}
		return false;
	}
	
	public void unesiUAdresar(String imePrezime, String adresa, String telefon) {
		if(imaLiSlobodnih()) {
			for(int i = 0; i < kontakti.length; i++) {
				if(kontakti[i].getImePrezime()==null) {
					kontakti[i].setImePrezime(imePrezime);
					kontakti[i].setAdresa(adresa);
					kontakti[i].setTelefon(telefon);
					break;
				}
			}
		} else {
			System.out.println("Nema mesta u adresaru");
		}
		
	}
	
	public void unesiUAdresar(Kontakt kontaktUnos) {
		if(imaLiSlobodnih()) {
			for(int i = 0; i < kontakti.length; i++) {
				if(kontakti[i].getImePrezime()==null) {
					kontakti[i] = kontaktUnos;
					break;
				}
			}
		} else {
			System.out.println("Nema mesta u adresaru");
		}
		
	}

	public void izbaciIzAdresara(String imePrezime) {
		for(int i = 0; i < kontakti.length; i++) {
			if(kontakti[i] != null && kontakti[i].getImePrezime().equals(imePrezime)) {
				kontakti[i] = null;
			}
		}
	}

	public void ispisi() {
		for(int i = 0; i < kontakti.length; i++) {
			if(kontakti[i].getImePrezime() != null) {
				System.out.println(kontakti[i]);			
			}
		}
	}
	
}
