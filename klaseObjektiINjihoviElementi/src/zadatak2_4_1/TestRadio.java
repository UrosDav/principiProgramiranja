package zadatak2_4_1;

public class TestRadio {

	public static void main(String[] args) {
		
		Radio radio1 = new Radio();
		Radio radio2 = new Radio();
		Radio radio3 = new Radio();
		
		radio1.promeniBandNaAM();
		radio1.podesiAMFrekvenciju(570);
		
		radio2.promeniBandNaFM();
		radio2.podesiFMFrekvenciju(87.9);
		
		radio3.promeniBandNaFM();
		radio3.podesiFMFrekvenciju(107.9);
		
		radio1.ispisiParametre();
		radio2.ispisiParametre();
		radio3.ispisiParametre();

	}

}
