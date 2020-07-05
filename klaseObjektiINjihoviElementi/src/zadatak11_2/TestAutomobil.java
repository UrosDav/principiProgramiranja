package zadatak11_2;

public class TestAutomobil {

	public static void main(String[] args) {

		Automobil a = new Automobil();
		a.setMarka("Zastava");
		a.setModel("Yugo Koral");
		//a.setKubikaza(800);
		
		try {
			a.setKubikaza(300);
		} catch(RuntimeException e) {
			System.out.println("Doslo je do greske prilikom unosa kubikaze: " + e);
		}
		
		System.out.println(a);

	}

}
