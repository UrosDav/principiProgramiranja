package zadatak5_6;

public class OcenaStudenta {

	String[] ocene;
		
	public OcenaStudenta(String oceneZaViseStudenata) {
		if(oceneZaViseStudenata == null) {
			System.out.println("greska pri unosu");
		} else {
			ocene = oceneZaViseStudenata.split(";");
		}
	}

	void ispisiPodatkeOSvimStudentima() {
		for(int i = 0; i<ocene.length;i++){
			System.out.println(ocene[i]);
		}
	}
	
	void ispisiPodatkeOStudentimaKojiNisuPolozili() {
		for(int i = 0; i<ocene.length;i++){
			if(ocene[i].split(" ")[3].equals("5")) {
				System.out.println(ocene[i]);
			}
		}
	}
	
	void ispisiPodatkeOStudentimaKojiSuPolozili() {
		for(int i = 0; i<ocene.length;i++){
			if(!ocene[i].split(" ")[3].equals("5")) {
				System.out.println(ocene[i]);
			}
		}
	}
	
	void ispisiPodatkeOStudentimaKojiSuUpisali1999() {
		for(int i = 0; i<ocene.length;i++){
			if(ocene[i].split(" ")[0].substring(5).equals("99")) {
				System.out.println(ocene[i]);
			}
		}
	}
	
}
