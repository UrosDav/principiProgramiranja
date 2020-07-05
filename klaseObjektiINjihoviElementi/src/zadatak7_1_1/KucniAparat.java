package zadatak7_1_1;

public class KucniAparat {

	String marka;
	String model;
	boolean ukljucen;
	
	public KucniAparat(String marka, String model, boolean ukljucen) {
		
		if(marka != null && model != null) {
			this.marka = marka;
			this.model = model;
			this.ukljucen = ukljucen;
		} else {
			System.out.println("Fali unos");
		}
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		
		if(marka != null) {
			this.marka = marka;
		} else {
			System.out.println("Pogresan unos");
		}
		
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		
		if(model != null) {
			this.model = model;
		} else {
			System.out.println("Pogresan unos");
		}
		
	}
	
	
	public void iskljuci () {
		ukljucen = false;
	}
	
	public void ukljuci () {
		ukljucen = true;
	}
	
	public void ispisi() {
		System.out.println("Marka je: " + marka);
		System.out.println("Model je: " + model);
		System.out.println("Ukljucen je: " + ukljucen);
	}
	
	
}