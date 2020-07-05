package zadatak3_4_3;

public class KalkulatorKamate {
	
	static int izracunajVremeDuplirananja(double kamata) {
		
		int godina = 0;
		double glavnica=1;
		while (glavnica<2) {
			godina++;
		    glavnica = glavnica*(1+kamata);
		}
		return godina;
		
	}

	static int izracunajStednju(double kamata, double glavnica, double ciljnaSuma) {
		
		int godina = 0;
		while(glavnica<ciljnaSuma) {
			godina++;
			glavnica*=(1+kamata);
		}
		return godina;
	}
	
}
