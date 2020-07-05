package zadatak5_5;

public class Avion {
	
	String[] sedista;

	public Avion() {
		sedista = new String[50];
		for(int i = 0; i < 50; i++) {
			sedista[i] = null;
		}
	}
	
	String vratiImeIPrezimePutnika(int brojSedista) {
		String sediste = sedista[brojSedista-1];
		if(sediste==null) {
			return null;
		} else {
			return sediste;
		}
	}
	
	void uvediPutnikaNaOdredjenoMesto(int brojSedista, String putnik) {
		int javaBrojSedista = brojSedista - 1;
		if(sedista[javaBrojSedista]==null) {
			sedista[javaBrojSedista] = putnik;
			System.out.println("Putnik " + sedista[javaBrojSedista] + " je uveden na mesto broj " + brojSedista + ".");
		} else {
			System.out.println("Putnik " + sedista[javaBrojSedista] + " vec sedi na mestu broj " + brojSedista
					+ ". Putnik " + putnik + " nije mogao biti rasporedjen.");
		}
		
	}
	
	void izvediPutnikaSaOdredjenogMesta(int brojSedista) {
		int javaBrojSedista = brojSedista -1;
		if(sedista[javaBrojSedista]==null) {
			System.out.println("Na mestu broj " + brojSedista + " ne sedi niko.");
		} else {
			System.out.println("Putnik " + sedista[javaBrojSedista] + " sa mesta broj " + brojSedista
					+ " je izveden.");
			sedista[javaBrojSedista] = null;
			
		}
		
	}
	
	int vratiBrojSlobodnihMesta() {
		int brojac = 0;
		for (int i = 0; i< 50;i++) {
			if(sedista[i]==null) {
				brojac++;
			}
		}
		return brojac;
	}

	int vratiBrojZauzetihMesta() {
		int brojac = 0;
		for (int i = 0; i< 50;i++) {
			if(sedista[i]!=null) {
				brojac++;
			}
		}
		return brojac;
	}
	
	void ispisiImenaArsica() {
		for(int i = 0; i<50;i++) {
			if(sedista[i]!=null) {
				if (sedista[i].split(" ")[1].equals("Arsic")) {
					System.out.println(sedista[i].split(" ")[0]);
				}
			}
		}
	}
	
	int vratiBrojNikola() {
		int brojac = 0;
		for(int i = 0; i<50;i++) {
			if(sedista[i]!=null) {
				String[] imeIPrezime = sedista[i].split(" ");
				if (imeIPrezime[0].equals("Nikola")) {
					brojac++;
				}
			}
		}
		return brojac;
	}
	
	void ispisiSvaMesta() {
		int broj;
		for(int i = 0; i < 50; i++) {
			broj = i + 1;
			if(sedista[i]==null) {
				System.out.println(broj + ". : SLOBODNO");
			}else {
				System.out.println(broj + ". : " + sedista[i]);
			}
		}
	}
	
}
