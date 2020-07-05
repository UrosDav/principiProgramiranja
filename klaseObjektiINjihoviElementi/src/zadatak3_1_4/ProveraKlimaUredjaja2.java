package zadatak3_1_4;

public class ProveraKlimaUredjaja2 {

	public static void main(String[] args) {
		
		KlimaUredjaj2 k1 = new KlimaUredjaj2();
		KlimaUredjaj2 k2 = new KlimaUredjaj2();

		
		k1.ispisiParametre();
		k1.promeniRezimRada('G');
		k1.podesiTemperaturu(26);
		k1.ispisiParametre();
		
		k2.ispisiParametre();
		k2.promeniRezimRada('H');
		k2.podesiTemperaturu(18);
		k2.ispisiParametre();
		
	}

}
