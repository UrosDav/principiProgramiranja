package zadatak2_3_1;

public class TestGrad {

	public static void main(String[] args) {
		
		Grad grad1 = new Grad();
		Grad grad2 = new Grad();
		Grad grad3 = new Grad();
		
		grad1.naziv = "Beograd";
		grad1.brojStanovnika = 1800000;

		grad2.naziv = "Njujork";
		grad2.brojStanovnika = 20000000;
		
		grad3.naziv = "Vankuver";
		
		System.out.println("Grad " + grad1.naziv + " ima " + grad1.brojStanovnika + " stanovnika.");
		System.out.println("Grad " + grad2.naziv + " ima " + grad2.brojStanovnika + " stanovnika.");
		System.out.println("Grad " + grad3.naziv + " ima " + grad3.brojStanovnika + " stanovnika.");
	}

}
