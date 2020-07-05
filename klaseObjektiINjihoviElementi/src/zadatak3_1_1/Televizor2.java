package zadatak3_1_1;

public class Televizor2 {

	int jacinaTona = 0;
	int trenutniProgram = 1;
	boolean ukljucen = false;
	
	void ukljuci() {
		if (ukljucen == false) {
			ukljucen = true;
		} else {
			System.out.println("Televizor je vec ukljucen");
		}
	}
	
	void iskljuci() {
		if (ukljucen == true) {
			ukljucen = false;
		} else {
			System.out.println("Televizor je vec iskljucen");
		}
	}
	
	void pojacajTon() {
		if (jacinaTona < 10) {
			jacinaTona++;
		} else {
			System.out.println("Ton je vec na maksimumu");
		}
	}
	
	void smanjiTon() {
		if (jacinaTona > 0) {
			jacinaTona--;
		} else {
			System.out.println("Ton je vec na minimumu");
		}
	}

	void promeniProgramNavise() {
		if (trenutniProgram < 99) {
			trenutniProgram++;
		} else {
			trenutniProgram = 1;
		}
	}

	void promeniProgramNanize() {
		if (trenutniProgram > 1) {
			trenutniProgram--;
		} else {
			trenutniProgram = 99;
		}
	}
	
	void ispisiParametre() {
		System.out.println("Televizor je trenutno ukljucen: " + ukljucen);
		System.out.println("Trenutna jacina tona je: " + jacinaTona);
		System.out.println("Trenutni program je: " + trenutniProgram);
		System.out.println(" ");
	}
}
