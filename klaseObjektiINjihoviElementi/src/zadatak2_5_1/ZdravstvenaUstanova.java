package zadatak2_5_1;

public class ZdravstvenaUstanova {

	String naziv;
	String adresa;
	
	ZdravstvenaUstanova(){
		naziv = "nepoznato";
		adresa = "nepoznato";
	}
	
	ZdravstvenaUstanova(String naziv){
		this.naziv = naziv;
	}
	
	ZdravstvenaUstanova(String naziv, String adresa){
		this.naziv = naziv;
		this.adresa = adresa;
	}
	
	void ispisi(){
		System.out.println("Naziv: " + naziv + " Adresa: " + adresa);
	}
}
