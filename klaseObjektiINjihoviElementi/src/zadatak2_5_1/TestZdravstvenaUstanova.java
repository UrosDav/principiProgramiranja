package zadatak2_5_1;

public class TestZdravstvenaUstanova {

	public static void main(String[] args) {
		
		ZdravstvenaUstanova ustanova1 = new ZdravstvenaUstanova();
		ustanova1.adresa = "Pasterova 2";
		ustanova1.naziv = "KCS";
		
		ZdravstvenaUstanova ustanova2 = new ZdravstvenaUstanova("Dom zdravlja Vozdovac");

		ZdravstvenaUstanova ustanova3 = new ZdravstvenaUstanova("Reumatoloski institu Beograd","Resavska 67");
		
		ustanova1.ispisi();
		ustanova2.ispisi();
		ustanova3.ispisi();
	}

}
