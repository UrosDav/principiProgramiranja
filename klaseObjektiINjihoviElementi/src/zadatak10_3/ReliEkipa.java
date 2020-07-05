package zadatak10_3;

public class ReliEkipa {

	private String imeEkipe;
	private int brojPoena;
	
	public String getImeEkipe() {
		return imeEkipe;
	}
	public void setImeEkipe(String imeEkipe) {
		if(imeEkipe != null) {
			this.imeEkipe = imeEkipe;
		} else {
			System.out.println("imeEkipe ne moze da bude null");
		}
	}
	public int getBrojPoena() {
		return brojPoena;
	}
	public void setBrojPoena(int brojPoena) {
		if(brojPoena >= 0) {
			this.brojPoena = brojPoena;
		} else {
			System.out.println("brojPoena ne moze da bude negativan");
		}
	}
	
	@Override
	public String toString() {
		return "ReliEkipa [imeEkipe=" + imeEkipe + ", brojPoena=" + brojPoena + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof ReliEkipa) {
			ReliEkipa r = (ReliEkipa) o;
			if(this.imeEkipe.equals(r.getImeEkipe())) {
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("objekat mora da bude klase ReliEkipa");
			return false;
		}
	}
	
	
	
}