package zadatak5_3;

public class ANalizatorReciIRecenica {

	String tekst = "nepoznat";
	
	String getTekst() {
		return tekst;
	}
	
	void setTekst(String tekst) {
		if (tekst == null) {
			System.out.println("greska");
		} else {
			this.tekst = tekst;
		}
	}
	
	String tekstBezPrvogSlova() {
		return tekst.substring(1);
	}
	
	String tekstBezPrvaCetiriSlova() {
		return tekst.substring(3);
	}
	
	String tekstBezPrveReci() {
		int prekid = tekst.indexOf(' ');
		if (prekid == -1) {
			return null;
		} else {
			return tekst.substring(prekid + 1);
		}
	}
	
	String tekstBezPrveRecenice() {
		int prekid = tekst.indexOf('.');
		if (prekid == -1) {
			return null;
		} else {
			return tekst.substring(prekid + 1);
		}
	}
	
	String poslednjaRecIzTeksta() {
		int prekid = tekst.lastIndexOf(' ');
		if (prekid == -1) {
			return null;
		} else {
			return tekst.substring(prekid + 1);
		}
	}
	
	String poslednjaRecenicaIzTeksta() {
		int poslednjaTacka = tekst.lastIndexOf('.');
		if (poslednjaTacka == -1) {
			return null;
		} else {
			int prekid = tekst.lastIndexOf('.',poslednjaTacka - 1);
		
			if (prekid == -1) {
				return null;
			} else {
				return tekst.substring(prekid + 1);
			}

		}
				
	}
	
	String tekstBezPrvogIPoslednjegSlova() {
		return tekst.substring(1, tekst.length()-1);
	}
	
	String tekstOdTrecegDoPretposlednjegSlova() {
		return tekst.substring(2, tekst.length()-2);
	}
	
	String drugaRecIzTeksta() {
		int prekid1 = tekst.indexOf(' ');
		if (prekid1 == -1) {
			return null;
		} else {
			int prekid2 = tekst.indexOf(' ', prekid1 + 1);
			if (prekid2 == -1) {
				return tekst.substring(prekid1 + 1);
			} else {
				return tekst.substring(prekid1 + 1, prekid2 - 1);
			}
		}
	}
	
	boolean daLiJeNoviTekstNaPocetkuTeksta(String noviTekst) {
		if (noviTekst == null) {
			return false;
		} else {
			return tekst.startsWith(noviTekst);
		}
	}
	
	boolean daLiJeNoviTekstNaKrajuTeksta(String noviTekst) {
		if (noviTekst == null) {
			return false;
		} else {
			return tekst.endsWith(noviTekst);
		}
	}
}
