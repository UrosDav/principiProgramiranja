package zadatak4_5;

public class TestAutobus {

	public static void main(String[] args) {
		
		Autobus autobus = new Autobus();
		
		autobus.uvodjenjePutnika(0);
		autobus.uvodjenjePutnika(19);
		autobus.uvodjenjePutnika(49);

		System.out.println(autobus.brojSlobodnihMesta());
		
		autobus.ispisiStatusSedista();
	}

}
