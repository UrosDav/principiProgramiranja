package zadatak5_1;

public class AnalizatorTeksta {
	
	String tekst;
	
	public AnalizatorTeksta() {
		
		tekst = "nepoznat";
		
	}
	
	public AnalizatorTeksta(String tekst) {
		
		if(this.tekst == null) {
			this.tekst = tekst;
		} else {
			this.tekst = "nepoznat";
			System.out.println("Greska prilikom upisa");
		}
		
	}
	
	String getTekst() {
		return tekst;
	}

	void setTekst(String tekst) {
		if(tekst != null) {
			this.tekst = tekst;
		} else {
			System.out.println("Greska prilikom unosa");
		}
	}
	
	void konkatenacijaNaTekstPozadi (String dodaj) {
		if (tekst == null) {
			System.out.println("Greska prilikom unosa");
		} else if (tekst == "nepoznat") {
			tekst = dodaj; 
		} else {
			tekst = tekst + dodaj;
		}
	}
	
	void konkatenacijaNaTekstIspod (String dodaj) {
		if (tekst == null) {
			System.out.println("Greska prilikom unosa");
		} else if (tekst == "nepoznat") {
			tekst = dodaj; 
		} else {
			tekst = dodaj + tekst;
		}
	}
	
	void daLiJeStringIstiKejsSenzitiv(String unos) {
		boolean poredjenje = tekst.equals(unos);
		if(poredjenje == true) {
			System.out.println("Isti su");
		} else {
			System.out.println("Nisu isti");
		}
	}
	
	void daLiJeStringIsti(String unos) {
		boolean poredjenje = tekst.equalsIgnoreCase(unos);
		if(poredjenje == true) {
			System.out.println("Isti su");
		} else {
			System.out.println("Nisu isti");
		}
	}
	
	void daLiJeStringpre(String unos) {
		int poredjenje = tekst.compareTo(unos);
		if(poredjenje < 0) {
			System.out.println("Tekst je pre");
		} else {
			System.out.println("Tekst je posle");
		}
	}
	
	
	
	
	
}
