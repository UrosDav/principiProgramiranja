package zadatak3_4_1;

public class NaucniKalkulator2 {
	
	static int vratiNajmanje2NaKvadratVeceOdBroja(int broj) {
		int kvadrat = 2;
		while(broj > kvadrat) {
			kvadrat *= 2;
		}
		return kvadrat;
	}

	static int vratiNajvece2NaKvadratManjeOdBroja(int broj) {
		int kvadrat = 2;
		while(broj > kvadrat) {
			kvadrat *= 2;
		}
		return kvadrat/2;
	}

	static int vratiNajmanjeANaKvadratVeceOdB(int a, int b) {
		int kvadrat = a;
		while(b > kvadrat) {
			kvadrat *= a;
		}
		return kvadrat;
	}
	
	static int vratiNajmanjiStepenDizanjaBroja2DaBudeVeciOdB(int b) {
		
		int n = 1;
		int stepen = 2;
		while (stepen < b) {
			stepen *= 2;
			n++;
		}
		return n;
	}
	
	static void vratiBrojDeljenjaSa2(int b) {
		int rezultat = b;
		while(rezultat > 1) {
			System.out.println(rezultat /= 2);
		}
	}

	static void vratiBrojDeljenjaSaB(int a,int b) {
		int rezultat = a;
		while(rezultat > 1) {
			System.out.println(rezultat /= b);
		}
	}
}
