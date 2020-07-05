package zadatak7_2_2;

public abstract class Vozilo {
	
	String marka;
	String model;
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		if(marka != null) {
			this.marka = marka;
		} else {
			System.out.println("Greska prilikom upisa");
		}
		
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		if(model != null) {
			this.model = model;
		} else {
			System.out.println("Greska prilikom upisa");
		}
		
	}
	
	public abstract boolean daLiIdePoKopnu();
	
	public abstract boolean daLiIdePoVodi();
	
	public abstract boolean daLiIdePoVazduhu();

	public void ispisi() {
		System.out.println(marka);
		System.out.println(model);
		if(daLiIdePoKopnu()) System.out.println("Ide po kopnu");
		if(daLiIdePoVodi()) System.out.println("Ide po vodi");
		if(daLiIdePoVazduhu()) System.out.println("Ide po vazduhu");
	}	
}
