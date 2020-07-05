package zadatak7_2_1;

public class Kocka extends GeometrijskoTelo{

	private double duzinaStranice;
	
	public double getDuzinaStranice() {
		return duzinaStranice;
	}
	
	public void setDuzinaStranice(double duzinaStranice) {
		if(duzinaStranice > 0) {
			this.duzinaStranice = duzinaStranice;
		} else {
			System.out.println("Greska prilikom unosa");
		}
		
	}
	
	public void izracunajPovrsinu() {
		povrsina = duzinaStranice * duzinaStranice * 6;
	}
	
	public void izracunajZapreminu() {
		zapremina = duzinaStranice * duzinaStranice * duzinaStranice;
	}
	
}
