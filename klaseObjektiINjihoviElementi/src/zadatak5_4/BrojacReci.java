package zadatak5_4;

public class BrojacReci {
	
	static int brojReciUTekstu(String tekst) {
		String[] nizReci = tekst.split(" ");
		return nizReci.length;
	}
	
	static int brojPojavljivanjaReciLep(String tekst) {
		String[] nizReci = tekst.split(" ");
		int brojac = 0;
		for(int i = 0; i< nizReci.length;i++) {
			if (nizReci[i] == "lep") {
				brojac++;
			}
		}
		return brojac;
	}

	static int brojOdredjeneReciUTekstu(String tekst, String rec) {
		String[] nizReci = tekst.split(" ");
		int brojac = 0;
		for(int i = 0; i< nizReci.length;i++) {
			if (nizReci[i].equalsIgnoreCase(rec) || 
					nizReci[i].substring(1).equalsIgnoreCase(rec) || nizReci[i].substring(0,nizReci[i].length()-1).equalsIgnoreCase(rec)) {
				brojac++;
			}
		}
		return brojac;
	}
	
	static String najcescaRecUTekstu(String tekst) {
		String[] nizReci = tekst.split(" ");
		String rec = " ";
		int maks = 0;
		for(int i = 0; i < nizReci.length;i++) {
			int broj = brojOdredjeneReciUTekstu(tekst,nizReci[i]);
			if( broj > maks) {
				maks = broj;
				rec = nizReci[i];
			}
		}
		return rec;
	}
	
	static String najredjaRecUTekstu(String tekst) {
		String[] nizReci = tekst.split(" ");
		String rec = " ";
		int min = nizReci.length + 1;
		for(int i = 0; i < nizReci.length;i++) {
			int broj = brojOdredjeneReciUTekstu(tekst,nizReci[i]);
			if( broj < min) {
				min = broj;
				rec = nizReci[i];
			}
		}
		return rec;
	}
	
	
}
