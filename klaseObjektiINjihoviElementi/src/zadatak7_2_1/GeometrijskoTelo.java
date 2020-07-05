package zadatak7_2_1;

public abstract class GeometrijskoTelo {
	
	double povrsina;
	double zapremina;
	
	public abstract void izracunajPovrsinu();
	public abstract void izracunajZapreminu();
	
	public double getPovrsina() {
		izracunajPovrsinu();
		return povrsina;
	}
	
	public double getZapremina() {
		izracunajZapreminu();
		return zapremina;
	}

}
