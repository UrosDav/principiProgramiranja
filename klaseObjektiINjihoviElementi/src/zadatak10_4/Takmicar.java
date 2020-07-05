package zadatak10_4;

public class Takmicar {
	
	private String drzava;
	private String imePrezime;
	private double vreme;
	
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		if(drzava != null) {
			this.drzava = drzava;
		} else {
			System.out.println("Greska");
		}
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		if(imePrezime != null) {
			this.imePrezime = imePrezime;
		} else {
			System.out.println("Greska");
		}
	}
	public double getVreme() {
		return vreme;
	}
	public void setVreme(double vreme) {
		if(vreme >= 0 ) {
			this.vreme = vreme;
		} else {
			System.out.println("Greska");
		}
	}
	
	@Override
	public String toString() {
		if (vreme > 0) {
			return "Takmicar " + imePrezime +" iz drzave " + drzava + " postigao je vreme " + vreme;
		} else {
			return "Takmicar " + imePrezime +" iz drzave " + drzava + " je diskvalifikovan";
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Takmicar) {
			Takmicar t = (Takmicar) o;
			if(this.drzava.equals(t.getDrzava()) && this.imePrezime.equals(t.getImePrezime())) {
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Greska");
			return false;
		}
	}
}
