package zadatak3_3_3;

public class IspisivacMatrica {
	
	static void ispisivanjeMatrice4X4() {
		for(int i = 1;i<=4;i++){
			for(int j = 1;j<=4;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	static void ispisivanjeJedinicneMatrice(int n) {
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(j==i) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}

}
