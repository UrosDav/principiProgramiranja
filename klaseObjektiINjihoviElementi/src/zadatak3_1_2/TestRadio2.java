package zadatak3_1_2;

public class TestRadio2 {

	public static void main(String[] args) {

		Radio2 r1 = new Radio2();
		Radio2 r2 = new Radio2();
		
		r1.promeniBand('A');
		r1.podesiAmFrekvenciju(570);
		
		r2.promeniBand('F');
		r2.podesiFmFrekvenciju(107.9);
				
		r1.ispisiParametre();
		r2.ispisiParametre();

	}

}
