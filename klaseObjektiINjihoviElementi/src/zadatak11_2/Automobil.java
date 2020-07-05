package zadatak11_2;

public class Automobil {

	private String marka;
	private String model;
	private int kubikaza;
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		if(marka != null) {
			this.marka = marka;
		} else {
			throw new RuntimeException("Marka ne sme biti null");
		}
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		if(model != null) {
			this.model = model;
		} else {
			throw new RuntimeException("Model ne sme biti null");
		}
	}
	
	public int getKubikaza() {
		return kubikaza;
	}
	
	public void setKubikaza(int kubikaza) {
		if(kubikaza >= 500 && kubikaza <= 8000) {
			this.kubikaza = kubikaza;
		} else {
			throw new RuntimeException("Kubikaza mora biti izmedju 500 i 8000");
		}
	}
	
	@Override
	public String toString() {
		return "Marka je " + marka + ", model je " + model + ", kubikaza je " + kubikaza;
	}
	
}
