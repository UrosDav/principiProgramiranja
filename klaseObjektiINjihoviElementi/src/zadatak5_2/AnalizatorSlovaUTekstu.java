package zadatak5_2;

public class AnalizatorSlovaUTekstu {
	
	String tekst = "nepoznat";
	
	String getTekst() {
		return tekst;
	}
	
	void setTekst(String tekst) {
		if(this.tekst != null) {
			this.tekst = tekst;
		} else {
			System.out.println("Greska pri unosu");
		}
	}

	int duzinaTeksta() {
		return tekst.length();
	}
	
	int pojavljivanjeSlovaA(){
		int brojac = 0;
		for(int i = 0;i < tekst.length();i++) {
			if(tekst.charAt(i)=='a') {
				brojac++;
			}
		}
		return brojac;
	}
	
	int pojavljivanjeSlova(char slovo){
		int brojac = 0;
		for(int i = 0;i < tekst.length();i++) {
			if(tekst.charAt(i)==slovo) {
				brojac++;
			}
		}
		return brojac;
	}
	
	int brojRecenica(){
		int brojac = 0;
		for(int i = 0;i < tekst.length();i++) {
			if(tekst.charAt(i)=='.'|| tekst.charAt(i)=='?' || tekst.charAt(i)=='!') {
				brojac++;
			}
		}
		return brojac;
	}
	
	int brojSamoglasnika(){
//		int brojac = 0;
//		for(int i = 0;i < tekst.length();i++) {
//			if(tekst.equalsIgnoreCase("A") || tekst.equalsIgnoreCase("E") || tekst.equalsIgnoreCase("I") 
//					|| tekst.equalsIgnoreCase("O") || tekst.equalsIgnoreCase("U")) {
//				brojac++;
//			}
//		}
//		return brojac;
		
		return pojavljivanjeSlova('a') +
				pojavljivanjeSlova('e') +
				pojavljivanjeSlova('i') +
				pojavljivanjeSlova('o') +
				pojavljivanjeSlova('u') +
				pojavljivanjeSlova('A') +
				pojavljivanjeSlova('E') +
				pojavljivanjeSlova('I') +
				pojavljivanjeSlova('O') +
				pojavljivanjeSlova('U');
		
	}
	
	char najucestalijeSlovo() {
		char slovo = tekst.charAt(0);
		int broj = pojavljivanjeSlova(slovo);
		for(int i = 0; i < tekst.length();i++) {
			if(tekst.charAt(i)!=' ' && pojavljivanjeSlova(tekst.charAt(i))>broj){
				broj = pojavljivanjeSlova(tekst.charAt(i));
				slovo = tekst.charAt(i);
			}
		}
		return slovo;
		
		
	}
	
	char najredjeSlovo() {
		char slovo = tekst.charAt(0);
		int broj = pojavljivanjeSlova(slovo);
		for(int i = 0; i < tekst.length();i++) {
			if(tekst.charAt(i)!=' ' && pojavljivanjeSlova(tekst.charAt(i))<broj){
				broj = pojavljivanjeSlova(tekst.charAt(i));
				slovo = tekst.charAt(i);
			}
		}
		return slovo;
		
		
	}
	
	int prvoPojavljivanjeSlovaA() {
		return tekst.indexOf('a');
	}
	
	int poslednjePojavljivanjeSlovaA() {
		return tekst.lastIndexOf('a');
	}
	
	int prvoPojavljivanjeSlova(char slovo) {
		return tekst.indexOf(slovo);
	}
	
	int poslednjePojavljivanjeSlova(char slovo) {
		return tekst.lastIndexOf(slovo);
	}
	
	int drugoPojavljivanjeSlovaA() {
		int prviIndeks = tekst.indexOf('a');
		if(prviIndeks == -1) {
			return -1;
		} else {
			return tekst.indexOf('a', prviIndeks + 1);
		}
			
	}
	
	int pretposlednjePojavljivanjeSlovaA() {
		int poslednjiIndeks = tekst.lastIndexOf('a');
		if(poslednjiIndeks == -1) {
			return -1;
		} else {
			return tekst.indexOf('a', poslednjiIndeks - 1);
		}
			
	}
}
