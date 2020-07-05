package zadatak2_4_2;

public class KlimaUredjaj {

	int temperatura = 18;
	char rezimRada = 'A';
	
	void smanjiTemperaturu() {
		temperatura--;
	}

	void povecajTemperaturu() {
		temperatura++;
	}
	
	void podesiTemperaturu(int temperatura) {
		this.temperatura = temperatura;
	}	

	void ukljuciRezimGrejanje() {
		rezimRada = 'G';
	}	

	void ukljuciRezimHladjenje() {
		rezimRada = 'H';
	}

	void ukljuciRezimAutomatski() {
		rezimRada = 'A';
	}
	
	void ispisiParametre() {
		System.out.println("Temperatura je " + temperatura);
		System.out.println("Rezim rada je " + rezimRada);
	}
	
}
