package zadatak2_4_2;

public class TestKlimaUredjaj {
	
	public static void main(String[] arg) {
		
		KlimaUredjaj klima1 = new KlimaUredjaj();
		KlimaUredjaj klima2 = new KlimaUredjaj();
		
		klima1.ukljuciRezimGrejanje();
		klima1.podesiTemperaturu(27);
		
		klima2.ukljuciRezimHladjenje();
		klima2.podesiTemperaturu(20);
		
		klima1.ispisiParametre();
		klima2.ispisiParametre();
	}

}
