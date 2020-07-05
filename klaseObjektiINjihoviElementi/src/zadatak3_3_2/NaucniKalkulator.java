package zadatak3_3_2;

public class NaucniKalkulator {

	static int sumaOdN(int n) {
		int sum = 0;
		if(n>0) {
			
			for(int i = 1; i<=n;i++) {
				sum += i;
			}

		}
		return sum;
	}
	
	static int faktorijelOdN(int n) {
		int fak = 1;
		if(n>0) {
			
			for(int i = 1; i<=n;i++) {
				fak *= i;
			}

		}
		return fak;
	}

	
	static int stepenOd2NaN(int n) {
		int step = 1;
		if(n>0) {
			
			for(int i = 1; i<=n;i++) {
				step *= 2;
			}

		}
		return step;
	}
	
	static int stepenOd3NaN(int n) {
		int step = 1;
		if(n>0) {
			
			for(int i = 1; i<=n;i++) {
				step *= 3;
			}

		}
		return step;
	}	
	
	static int stepenOdXNaN(int n,double x) {
		int step = 1;
		if(n>0) {
			
			for(int i = 1; i<=n;i++) {
				step *= x;
			}

		}
		return step;
	}
	
	static int stepenOdAPlusBNaN(int n,int a,int b) {
		int step = 1;
		if(n>0) {
			
			for(int i = 1; i<=n;i++) {
				step *= (a+b);
			}

		}
		return step;
	}
	
	static int sumaIzmedjuAiB(int a,int b) {
		int sum = 0;
		if(b>a) {
			
			for(int i = a; i<=b;i++) {
				sum += i;
			}

		} else {
			for(int i = b; i<=a;i++) {
				sum += i;
			}
		}
		return sum;
	}	
	
	static int sumaIzmedjuAiBbezB(int a,int b) {
		int sum = 0;
		if(b>a) {
			
			for(int i = a; i<b;i++) {
				sum += i;
			}

		} else {
			for(int i = b; i<a;i++) {
				sum += i;
			}
		}
		return sum;
	}		

	
	static int sumaParnihIzmedjuAiB(int a,int b) {
		int sum = 0;
		if(b>a) {
			
			for(int i = a; i<=b;i++) {
				if(i%2==0) {
					sum += i;
				}
			}

		} else {
			for(int i = b; i<a;i++) {
				if(i%2==0) {
					sum += i;
				}
			}
		}
		return sum;
	}

	static int sumaDeljivihSaTriIzmedjuAiB(int a,int b) {
		int sum = 0;
		if(b>a) {
			
			for(int i = a; i<=b;i++) {
				if(i%3==0) {
					sum += i;
				}
			}

		} else {
			for(int i = b; i<a;i++) {
				if(i%3==0) {
					sum += i;
				}
			}
		}
		return sum;
	}
	
	static int proizvodPozitivnihIzmedjuAiB(int a,int b) {
		int proiz = 1;
		if(b>a) {
			
			for(int i = a; i<=b;i++) {
				if(i > 0) {
					proiz *= i;
				}
			}

		} else {
			for(int i = b; i<a;i++) {
				if(i > 0) {
					proiz += i;
				}
			}
		}
		return proiz;
	}
	
	
}
