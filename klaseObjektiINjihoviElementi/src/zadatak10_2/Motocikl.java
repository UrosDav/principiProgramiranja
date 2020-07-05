package zadatak10_2;

public class Motocikl {
	
	private String marka;
	private String model;
	private int kubikaza;
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	
	@Override
	public String toString() {
		return "Motocikl [marka=" + marka + ", model=" + model + ", kubikaza=" + kubikaza + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Motocikl) {
			Motocikl m = (Motocikl) o;
				if(m.getKubikaza() == this.kubikaza && m.getMarka().equals(this.marka) && m.getModel().equals(this.model)) {
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
