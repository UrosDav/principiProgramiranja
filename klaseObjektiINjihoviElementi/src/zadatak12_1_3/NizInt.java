package zadatak12_1_3;

//import java.util.Scanner;
import java.io.*;


public class NizInt {

/*
	private int[] niz;
	
	public void inicijalizacijaNiza() {
		Scanner sken = new Scanner(System.in);
*/		
		/*
		String unos = sken.nextLine();
		int broj = Integer.parseInt(unos);
		*/
/*		try {
			System.out.println("Ucitaj duzinu niza: ");
			int broj = sken.nextInt();
			if(broj<=0) {
				broj = 10;
			}
			niz = new int[broj];
		} catch (Exception e) {
			System.out.println("Greska: " + e.getMessage());
			niz = new int[10];
			sken.close();
		}
		
		sken.close();
	}
	
	public void popunjavanjeNiza() {
		
		if(niz == null) {
			throw new RuntimeException("Nema");
		}
		Scanner sken2 = new Scanner(System.in);
		for(int i = 0; i < niz.length;i++) {
			try {
				System.out.println("Unesi " + (i+1) + ". element niza");
				String s = sken2.nextLine();
				int b = Integer.parseInt(s);
				niz[i] = b;
			} catch (Exception e) {
				System.out.println("Ucitavanje nije uspelo");
			}
			
		}
		sken2.close();
	}
*/
	
	private int[] niz;
	
	public void unesiKapacitet() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unestie kapacitet niza: ");
			String s = br.readLine();
			int kapacitet = Integer.parseInt(s);
			if(kapacitet <= 0 ) {
				niz = new int[10];
			}else {
				niz = new int[kapacitet];
			}
		} catch (Exception e) {
			System.out.println("Greska pti unosu kapaciteta: " + e.getMessage());
			niz = new int[10];
		}
	}
	
	public void unesiElemente() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if(niz == null) {
			throw new RuntimeException("Niz nije inicijalizovan");
		}
		for(int i =0; i < niz.length;i++) {
			try {
				System.out.println("Unesite " + (i+1) + ". element niza:");
				String s =br.readLine();
				int b = Integer.parseInt(s);
				niz[i] = b;
			} catch (Exception e) {
				System.out.println("Greska pri unosu " + (i+1) + ". elementa: " + e.getMessage());
			}
		}
		
	}
	
	public void ispisi() {
		if(niz == null) {
			throw new RuntimeException("Niz nije inicijalizovan");
		}
		
		for(int i = 0; i < niz.length;i++) {
			System.out.println((i+1) + ". element: " + niz[i]);
		}
	}
	
	
}
