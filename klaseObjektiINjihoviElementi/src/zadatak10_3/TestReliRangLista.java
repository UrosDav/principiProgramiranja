package zadatak10_3;

public class TestReliRangLista {

	public static void main(String[] args) {
		
		ReliRangLista rl = new ReliRangLista();
		
		ReliEkipa r1 = new ReliEkipa();
		r1.setImeEkipe("Audi");
		r1.setBrojPoena(30);

		ReliEkipa r2 = new ReliEkipa();
		r2.setImeEkipe("BMW");
		r2.setBrojPoena(40);
		
		ReliEkipa r3 = new ReliEkipa();
		r3.setImeEkipe("Renault");
		r3.setBrojPoena(20);
		
		ReliEkipa r4 = new ReliEkipa();
		r4.setImeEkipe("VW");
		r4.setBrojPoena(5);
		
		ReliEkipa r5 = new ReliEkipa();
		r5.setImeEkipe("Subaru");
		r5.setBrojPoena(30);
		
		ReliEkipa r6 = new ReliEkipa();
		r6.setImeEkipe("Peugeot");
		r6.setBrojPoena(33);
		
		ReliEkipa r7 = new ReliEkipa();
		r7.setImeEkipe("Ford");
		r7.setBrojPoena(50);
		
		ReliEkipa r8 = new ReliEkipa();
		r8.setImeEkipe("Mitsubishi");
		r8.setBrojPoena(4);
		
		ReliEkipa r9 = new ReliEkipa();
		r9.setImeEkipe("Lancia");
		r9.setBrojPoena(23);
		
		ReliEkipa r10 = new ReliEkipa();
		r10.setImeEkipe("Skoda");
		r10.setBrojPoena(15);
		
		ReliEkipa r11 = new ReliEkipa();
		r11.setImeEkipe("Seat");
		r11.setBrojPoena(0);
		
		rl.unos(r1);
		rl.unos(r2);
		rl.unos(r3);
		rl.unos(r4);
		rl.unos(r5);
		rl.unos(r6);
		rl.unos(r7);
		rl.unos(r8);
		rl.unos(r9);
		rl.unos(r10);
		rl.unos(r11);
		
		rl.ispisiCeluListu();
		System.out.println();
		rl.ispisiCeluListuObrnuto();
		System.out.println();
		rl.ispisiDesetNajboljih();
		
		r2.setBrojPoena(55);
		
		rl.promeniPoziciju(r2);
		
		System.out.println();
		rl.ispisiCeluListu();
	}

}
