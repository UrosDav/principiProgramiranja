package zadatak3_3_1;

public class Ispisivac2 {

	static void ispisiOd1Do50() {
		for(int i = 1;i<=50;i++) {
			System.out.println(i);
		}
		
		System.out.println(" ");
	}
	
	static void ispisiOd0Do30() {
		for(int i = 0;i<=30;i++) {
			System.out.println(i);
		}
		
		System.out.println(" ");
	}	
	
	static void ispisiOd50Do1() {
		for(int i = 50;i>=1;i--) {
			System.out.println(i);
		}
		
		System.out.println(" ");
	}

	static void ispisiOd32DoNeg2() {
		for(int i = 32;i>=-2;i--) {
			System.out.println(i);
		}
		
		System.out.println(" ");
	}

	static void ispisiOd0DoN(int n) {
	
		if(n>0) {
			for(int i = 0;i<=n;i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("Unos mora biti > 0");
		}
		
		System.out.println(" ");
	}
	
	static void ispisiOd0DoNegN(int n) {
		
		if(n<0) {
			for(int i = 0;i>=n;i--) {
				System.out.println(i);
			}
		}else {
			System.out.println("Unos mora biti < 0");
		}
		
		System.out.println(" ");
	}
	
	static void ispisiOdAdoB(int a, int b) {
		if (a<=b) {
			for(int i = a;i<=b;i++) {
				System.out.println(i);
			}
		}else {
			for(int i = b;i<=a;i++) {
				System.out.println(i);
			}
		}
		
		System.out.println("");
	}
	
	static void ispisiOdAdoBbezAiB(int a, int b) {
		if (a<b) {
			for(int i = a + 1;i<b;i++) {
				System.out.println(i);
			}
		}else if(b<a){
			for(int i = b + 1 ;i<a;i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("Brojevi su jednaki");
		}
		
		System.out.println("");
	}
	
	static void ispisiOdAdoBopadajuci(int a, int b) {
		if (a<=b) {
			for(int i = b;i>=a;i--) {
				System.out.println(i);
			}
		}else {
			for(int i = a;i>=b;i--) {
				System.out.println(i);
			}
		}
		
		System.out.println("");
	}
	
}

