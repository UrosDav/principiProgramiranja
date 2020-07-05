package zadatak8_3_1.valute;

public class KonvertorValute {

	private double kursEvra;
	private double kursDolara;
	
	public void setKursEvra(double kursEvra) {
		if(kursEvra > 0) {
			this.kursEvra = kursEvra;
		} else {
			System.out.println("Doslo je do greske prilikom unosa kursa evra.");
		}
	}
	
	public void setKursDolara(double kursDolara) {
		if(kursDolara > 0) {
			this.kursDolara = kursDolara;
		} else {
			System.out.println("Doslo je do greske prilikom unosa kursa dolara.");
		}
		
	}
	
	public double konvertujDinareUEvre(double dinarskiUnos) {

		return dinarskiUnos/this.kursEvra;
		
	}

	public double konvertujDinareUDolare(double dinarskiUnos) {

		return dinarskiUnos/this.kursDolara;
		
	}	
	
	void ispisiKursnuListu() {
		System.out.println("EUR/RSD: " + kursEvra);
		System.out.println("USD/RSD: " + kursDolara);
	}
}
