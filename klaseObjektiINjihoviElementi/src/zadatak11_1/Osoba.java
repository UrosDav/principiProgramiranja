package zadatak11_1;

public class Osoba {
	
	private String ime;
	private String prezime;
	private int visina;
	private double tezina;
	private int godine;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if(ime != null) {
			this.ime = ime;
		} else {
			throw new NullPointerException("Ime je null") ;
		}
		
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		if(prezime != null) {
			this.prezime = prezime;
		} else {
			throw new NullPointerException("Prezime je null") ;
		}
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		if(visina >= 50 && visina <= 250 ) {
			this.visina = visina;
		} else {
			throw new NumberFormatException("Visina je van dozvoljenog opsega") ;
		}
	}
	public double getTezina() {
		return tezina;
	}
	public void setTezina(double tezina) {
		if(tezina >= 2 && tezina <= 250 ) {
			this.tezina = tezina;
		} else {
			throw new NumberFormatException("Tezina je van dozvoljenog opsega") ;
		}
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		if(godine >= 0 && godine <= 125 ) {
			this.godine = godine;
		} else {
			throw new NumberFormatException("Godine su van dozvoljenog opsega") ;
		}
	}
	
	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", visina=" + visina + ", tezina=" + tezina + ", godine="
				+ godine + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Osoba) {
			Osoba osoba = (Osoba) o; 
			//if(osoba.getIme().equals(this.getIme()) && osoba.getPrezime().equals(this.getPrezime())) {
			if(osoba.getIme().equals(ime) && osoba.getPrezime().equals(prezime)) {
				return true;
			}else {
				return false;
			}
	
		} else {
			throw new RuntimeException("Objekat nije Osoba");
		}
	}
	
	

}
