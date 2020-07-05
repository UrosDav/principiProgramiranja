package zadatak7_1_1;

public class Radio extends KucniAparat{

	double frekvencija = 87.5;
	
	public Radio(String marka, String model, boolean ukljucen, double frekvencija) {
		super(marka, model, ukljucen);
		if(frekvencija >= 87.5 && frekvencija <= 108) {
			this.frekvencija = frekvencija;
		} else {
			System.out.println("Pogresan unos");
		}
	}
	
	public double getFrekvencija() {
		return this.frekvencija;
	}
	
	public void setFrekvencija(double frekvencija) {
		if(frekvencija >= 87.5 && frekvencija <= 108) {
			this.frekvencija = frekvencija;
		} else {
			System.out.println("Pogresan unos");
		}
	}
	
	@Override
	public void ispisi() {
		if(ukljucen) {
			System.out.println("Frekvencija je: " + frekvencija);
		} else {
			System.out.println("Radio je iskljucen");
		}
	}
}
