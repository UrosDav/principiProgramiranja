package zadatak7_4_1;

public class TestMonitor {
	
	public static void main(String[] arg) {
	
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		
		m1.setModel("SyncMaster 151n");
		m1.setMarka("Samsung");
		m1.setVelicinaEkrana(15);

		m2.setModel("WS");
		m2.setMarka("Sony");
		m2.setVelicinaEkrana(17);
	
		if (m1.equals(m2)) {
			System.out.println("Monitori su isti");
		} else {
			System.out.println("Monitori nisu usti");
		}
		
		System.out.println(m1);
		System.out.println(m2);
	}
}
