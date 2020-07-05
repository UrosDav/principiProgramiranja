package zadatak11_5;

public class Proizvod {
	
	private int sifraProizvoda;
	private String nazivProizvoda;
	private double cenaProizvoda;
	
	public int getSifraProizvoda() {
		return sifraProizvoda;
	}
	
	public void setSifraProizvoda(int sifraProizvoda) throws ProizvodException {
		if(sifraProizvoda <= 0) {
			throw new ProizvodException("Sifra mora biti veca od 0");
		}
		this.sifraProizvoda = sifraProizvoda;
	}
	
	public String getNazivProizvoda() {
		return nazivProizvoda;
	}
	
	public void setNazivProizvoda(String nazivProizvoda) throws ProizvodException {
		if(nazivProizvoda == null) {
			throw new ProizvodException("Naziv mora biti razlicit od null");
		}
		this.nazivProizvoda = nazivProizvoda;
	}
	
	public double getCenaProizvoda() {
		return cenaProizvoda;
	}
	
	public void setCenaProizvoda(double cenaProizvoda) throws ProizvodException {
		if(cenaProizvoda <= 0) {
			throw new ProizvodException("Cena mora biti veca od 0");
		}
		this.cenaProizvoda = cenaProizvoda;
	}
	
	@Override
	public String toString() {
		return "Proizvod " + nazivProizvoda + " (sifra " + sifraProizvoda + ") kosta RSD " + cenaProizvoda ;
	}
	
}
