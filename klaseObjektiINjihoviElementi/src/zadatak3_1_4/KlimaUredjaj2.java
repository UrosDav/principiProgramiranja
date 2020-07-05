package zadatak3_1_4;

public class KlimaUredjaj2 {

	double trenutnaTemperatura = 18;
	char rezimRada = 'A';
	
	void smanjiTemperaturu() {
		if(trenutnaTemperatura > 18) {
			trenutnaTemperatura--;
		} else {
			System.out.println("Ne moze da se smanji");
		}
	}
	
	void povecajTemperaturu() {
		if(trenutnaTemperatura < 30) {
			trenutnaTemperatura++;
		} else {
			System.out.println("Ne moze da se poveca");
		}
	}	
	
	void podesiTemperaturu(double temperatura) {
		if(temperatura >= 18 && temperatura <= 30) {
			trenutnaTemperatura = temperatura;
		} else {
			System.out.println("Ne moze da se podesi");
		}
	}
	
	void promeniRezimRada(char rezim) {
		if (rezim == 'A' || rezim == 'H' || rezim == 'G') {
			rezimRada = rezim;
		} else {
			System.out.println("Rezim ne postoji");
		}
		
	}
	
	void ispisiParametre() {
		System.out.println("Rezim rada je " + rezimRada);
		System.out.println("Trenutna temperatura je " + trenutnaTemperatura);
		System.out.println(" ");
	}
}
