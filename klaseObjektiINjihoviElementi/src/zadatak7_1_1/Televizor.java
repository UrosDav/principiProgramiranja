package zadatak7_1_1;

public class Televizor extends KucniAparat {
	
	public int program = 1;
	
	public Televizor(String marka, String model, boolean ukljucen, int program) {
		super(marka, model, ukljucen);
		if(program < 1 && program > 40) {
			System.out.println("Pogresan unos");
		} else {
			this.program = program;
		}
	}

	public void promeniProgramNavise() {
		if(this.program == 40) {
			this.program = 1;
		} else {
			this.program++;
		}
		
	}
	
	public void promeniProgramNanize() {
		if(this.program == 1) {
			this.program = 40;
		} else {
			this.program--;
		}
	}
	
	public void ispisi() {
		super.ispisi();
		System.out.println("Program je: " + this.program);
	}
	
	
}
