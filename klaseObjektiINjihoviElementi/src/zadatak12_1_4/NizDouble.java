package zadatak12_1_4;

import java.io.*;

public class NizDouble {

	private double[] niz;
	
	public void incijalizujNiz() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesi duzinu niza:");
			int duzinaNiza = .nextInt();
			if(duzinaNiza <= 0) {
				throw new RuntimeException("Duzina niza mora biti pozitivan ceo broj");
			}
			niz = new double[duzinaNiza];
		} catch (Exception e) {
			System.out.println("Greska " + e);
		}	
	}
	
	public void unesiElemente() {
		Scanner sken = new Scanner(System.in);
		if(this.niz == null) {
			sken.close();
			throw new RuntimeException("Niz nije inicijalizovan");
		}
		

		for(int i = 0; i < niz.length;i++) {
			try {
				System.out.println("Unesi" + (i+1) +". element:");
				double elem = sken.nextDouble();
				niz[i] = elem;
			} catch (Exception e){
				sken.close();
				System.out.println("Greska " + e);
			}
		}
		sken.close();
		
	}
	
}
