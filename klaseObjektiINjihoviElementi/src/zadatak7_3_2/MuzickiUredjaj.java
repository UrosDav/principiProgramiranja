package zadatak7_3_2;

public abstract class MuzickiUredjaj {

	public boolean ukljucenUredjaj;
	public int jacinaTona = 0;
	
	public void ukljuciUredjaj() {
		this.ukljucenUredjaj = true;
	}
	
	public void iskljuciUredjaj() {
		this.ukljucenUredjaj = false;
	}
	
	public void pojacajTon() {
	
		if(this.jacinaTona < 40) {
			this.jacinaTona ++;
		}
		
	}
	
	public void smanjiTon() {
		
		if(this.jacinaTona > 0 ) {
			this.jacinaTona --;
		}
		
	}
	
	public abstract void ispisi();

}
