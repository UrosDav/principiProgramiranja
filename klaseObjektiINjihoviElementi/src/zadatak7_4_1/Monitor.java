package zadatak7_4_1;

public class Monitor {

	public String marka;
	public String model;
	public double velicinaEkrana;
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		if(marka != null) {
			this.marka = marka;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model != null) {
			this.model = model;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	public double getVelicinaEkrana() {
		return velicinaEkrana;
	}
	public void setVelicinaEkrana(double velicinaEkrana) {
		if(velicinaEkrana >=12) {
			this.velicinaEkrana = velicinaEkrana;
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	
	public String toString() {
		return "Marka: " + this.marka + ", Model: " + this.model + ", Velicina ekrana: " + this.velicinaEkrana; 
	}
	
	public boolean equals(Object o) {
		if(o instanceof Monitor) {
			Monitor m = (Monitor) o;
			if(m.getMarka() == this.marka && m.getModel() == this.model && m.getVelicinaEkrana() == this.velicinaEkrana) {
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
			return false;
		}
		
		
	}
}
