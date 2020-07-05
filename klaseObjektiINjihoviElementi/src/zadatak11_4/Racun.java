package zadatak11_4;

public class Racun {
	
	private int brojRacuna;
	private String proizvod;
	private double iznosRacuna;
	
	public int getBrojRacuna() {
		return brojRacuna;
	}
	
	public void setBrojRacuna(int brojRacuna) {
		if(brojRacuna <= 0) {
			throw new RacunException("Broj racuna mora biti pozitivan");
		}
		this.brojRacuna = brojRacuna;
	}
	
	public String getProizvod() {
		return proizvod;
	}
	
	public void setProizvod(String proizvod) {
		if(proizvod == null) {
			throw new RacunException("Proizvod racuna mora biti pozitivan");
		}
		this.proizvod = proizvod;
	}
	
	public double getIznosRacuna() {
		return iznosRacuna;
	}
	
	public void setIznosRacuna(double iznosRacuna) {
		if(iznosRacuna <= 0) {
			throw new RacunException("Iznos racuna mora biti pozitivan");
		}
		this.iznosRacuna = iznosRacuna;
	}
	
	@Override
	public String toString() {
		return "Proizvod " + proizvod + " po ceni RSD " + iznosRacuna + " je prodat po racunu broj " + brojRacuna;
	}

}
