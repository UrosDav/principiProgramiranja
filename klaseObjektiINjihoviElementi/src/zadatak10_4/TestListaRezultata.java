package zadatak10_4;

public class TestListaRezultata {

	public static void main(String[] args) {
		
		ListaRezultata lista = new ListaRezultata();
		
		Takmicar t1 = new Takmicar();
		t1.setDrzava("Grcka");
		t1.setImePrezime("Costas Pappas");
		t1.setVreme(23.1);

		Takmicar t2 = new Takmicar();
		t2.setDrzava("SAD");
		t2.setImePrezime("Colin Firth");
		t2.setVreme(20.12);
		
		Takmicar t3 = new Takmicar();
		t3.setDrzava("Rusija");
		t3.setImePrezime("Ivan Ivanovic");
		t3.setVreme(19.05);
		
		Takmicar t4 = new Takmicar();
		t4.setDrzava("Turska");
		t4.setImePrezime("Mehmed Turk");
		t4.setVreme(0);
		
		Takmicar t5 = new Takmicar();
		t5.setDrzava("Velika Britanija");
		t5.setImePrezime("John Pale");
		t5.setVreme(22.78);
				
		Takmicar t6 = new Takmicar();
		t6.setDrzava("SAD");
		t6.setImePrezime("Jack stone");
		t6.setVreme(0);
		
		lista.unesiTakmicara(t1);
		lista.unesiTakmicara(t2);
		lista.unesiTakmicara(t3);
		lista.unesiTakmicara(t4);
		lista.unesiTakmicara(t5);
		lista.unesiTakmicara(t6);
		
		lista.ispisi();
		System.out.println();
		lista.ispisiOsamNajboljih();
		System.out.println();
		lista.ispisiReprezentativce("SAD");
		
		if(lista.daLiJeOborenRekord(19.1)) {
			System.out.println("Rekord je oboren!");
		}
		
	
	}

}
