package zadatak10_1;

public class TestIspitnaLista {

	public static void main(String[] args) {
		
		IspitnaLista il = new IspitnaLista();
		
		Student s1 = new Student();
		s1.setBrojIndeksa("0001/99");
		s1.setIme("Ivana");
		s1.setPrezime("Stevanovic");
		s1.setOcena(10);
		
		Student s2 = new Student();
		s2.setBrojIndeksa("0123/06");
		s2.setIme("Petar");
		s2.setPrezime("Petrovic");
		s2.setOcena(6);
		
		Student s3 = new Student();
		s3.setBrojIndeksa("0021/05");
		s3.setIme("Jovan");
		s3.setPrezime("Jovanovic");
		s3.setOcena(8);
		
		il.dodajStudenta(s1);
		il.dodajStudenta(s2);
		il.dodajStudenta(s3);
		
		System.out.println(il.prosek());
		il.ispisiStareStudente();

	}

}
