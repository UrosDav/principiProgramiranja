package zadatak4_3;

public class NizCena {

	double[] cene = new double[100];
	int brojac = 0;
	
	void dodajCenu(double cena) {
		if(brojac == 100) {
			System.out.println("Nema vise mesta");
		}else {
			cene[brojac] = cena;
			brojac++;
		}
		
	}
	
	double prosecnaCena() {
		if(brojac == 0) {
			System.out.println("Niz je prazan");
			return 0;
		} else {
			double suma = 0;
			for(int i = 0; i < brojac;i++) {
				suma+=cene[i];
			}
			return suma/(brojac);
		}
	}
	
	double najnizaCena() {
		if(brojac == 0) {
			System.out.println("Niz je prazan");
			return 0;
		} else {
			double min = cene[0];
			for(int i = 0; i < brojac;i++) {
				if(min > cene[i]) {
					min = cene[i];
				}
			}
			return min;
		}
	}

	double najvisaCena() {
		if(brojac == 0) {
			System.out.println("Niz je prazan");
			return 0;
		} else {
			double max = cene[0];
			for(int i = 0; i < brojac;i++) {
				if(max < cene[i]) {
					max = cene[i];
				}
			}
			return max;
		}
	}
	
	double razlikaMaxIMinCene() {
		if(brojac == 0) {
			System.out.println("Niz je prazan");
			return 0;
		} else {
			return najvisaCena() - najnizaCena();
		}
	}
	
	void cenePreko(double cena) {
		if(brojac == 0) {
			System.out.println("Niz je prazan");
		} else {
			for(int i = 0; i < brojac;i++) {
				if(cene[i] > cena) {
					System.out.println(cene[i]);
				}	
			
			}
		}
	}
	
}
