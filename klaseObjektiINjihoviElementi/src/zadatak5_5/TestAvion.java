package zadatak5_5;

public class TestAvion {

	public static void main(String[] args) {
		
		Avion avion1 = new Avion();
		Avion avion2 = new Avion();
		
		avion1.uvediPutnikaNaOdredjenoMesto(1, "Petar Petrovic");
		avion1.uvediPutnikaNaOdredjenoMesto(20, "Natasa Jankovic");
		avion1.uvediPutnikaNaOdredjenoMesto(50, "Nikola Arsic");

		avion2.uvediPutnikaNaOdredjenoMesto(2, "Masa Petrovic");
		avion2.uvediPutnikaNaOdredjenoMesto(10, "Nikola Tomic");
		avion2.uvediPutnikaNaOdredjenoMesto(20, "Nikola Trajkovski");
		
		avion1.ispisiImenaArsica();
		System.out.println(avion2.vratiBrojNikola());
	}

}
