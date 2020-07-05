package zadatak9_2;

public class MestoUAvionu {
	
	private boolean slobodno = true;
	private String imeIPrezime = null;
	private int starost = 0;
	
	public boolean isSlobodno() {
		return slobodno;
	}
	public void setSlobodno(boolean slobodno) {
		this.slobodno = slobodno;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public int getStarost() {
		return starost;
	}
	public void setStarost(int starost) {
		this.starost = starost;
	}
	
	@Override
	public String toString() {
		if(slobodno) {
			return "Slobodno";
		} else {
			return "imeIPrezime=" + imeIPrezime + ", starost=" + starost;
		}
	}
	
	
	

}
