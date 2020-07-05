package zadatak3_4_2;

public class Ispisivac3 {

	static void deljiviSaSestIliSaDevet() {
		
		int brojacSvih = 0;
		int brojacDeljivih = 0;
		while (brojacDeljivih <10) {
			
			brojacSvih++;
			if (brojacSvih%6 == 0 || brojacSvih%9==0) {
				System.out.println(brojacSvih);
				brojacDeljivih++;
			}
			
			
		}
		
	}
	
	static void deljiviSaSedamIOsam() {
		
		int brojacSvih = 0;
		int brojacDeljivih = 0;
		while (brojacDeljivih <5) {
			
			brojacSvih++;
			if (brojacSvih%7 == 0 && brojacSvih%8==0) {
				System.out.println(brojacSvih);
				brojacDeljivih++;
			}
			
			
		}
		
	}	
	
	static void deljiviSaPetIliSest(int n) {
		
		int brojacSvih = 0;
		int brojacDeljivih = 0;
		while (brojacDeljivih <n) {
			
			brojacSvih++;
			if (brojacSvih%6 == 0 || brojacSvih%5==0) {
				System.out.println(brojacSvih);
				brojacDeljivih++;
			}
			
			
		}
		
	}	
	
		
	
}
