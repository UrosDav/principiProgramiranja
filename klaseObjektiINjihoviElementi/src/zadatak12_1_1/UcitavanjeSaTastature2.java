package zadatak12_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UcitavanjeSaTastature2 {

	private static void pozdrav() {
		System.out.println("Unesi recenice:");
	}
	
	public static void brojRecenicaUUnosu() {
		BufferedReader bafer = new BufferedReader(new InputStreamReader(System.in));
		int brojRecenica = 0;
		pozdrav();
		try {
			String s = bafer.readLine();
			brojRecenica = s.split("\\.").length;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Broj recenica je " + brojRecenica);
		
	}

	public static void brojReciUUnosu() {
		BufferedReader bafer = new BufferedReader(new InputStreamReader(System.in));
		int brojac = 0;
		pozdrav();
		try {
			String s = bafer.readLine();
			for(int i = 0; i<s.length();i++) {
				if (s.charAt(i) == '.' || s.charAt(i) == ' ' || s.charAt(i) == '?') {
					brojac++;
				}  
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Broj reci je " + brojac);
		
	}
	
	public static void brojReciSnegUUnosu() {
		BufferedReader bafer = new BufferedReader(new InputStreamReader(System.in));
		int brojSnega = 0;
		pozdrav();
		try {
			String s = bafer.readLine();
			brojSnega = s.split("sneg").length;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Broj reci sneg je " + brojSnega);
		
	}
	
	public static void distancaMetriUkilometre() {
		BufferedReader bafer = new BufferedReader(new InputStreamReader(System.in));
		double kilometri = 0;
		pozdrav();
		try {
			String s = bafer.readLine();
			int metri = Integer.parseInt(s);
			kilometri = (double)metri/1000;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Distanca u kilometrima je " + kilometri);
		
	}
	
	public static void sumaUpisanihBrojeva() {
		BufferedReader bafer = new BufferedReader(new InputStreamReader(System.in));
		double suma = 0;
		pozdrav();
		while(true) {
			try {
				String s = bafer.readLine();
				if(s.equals("kraj")) {
					break;
				}
				double broj = Double.parseDouble(s);
				suma += broj;
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}	
		}
				
		System.out.println("Suma brojeva je " + suma);
		
	}
	
	public static void faktorijelBroja() {
		BufferedReader bafer = new BufferedReader(new InputStreamReader(System.in));
		int proizvod = 1;
		pozdrav();
		try {
			String s = bafer.readLine();
			int broj = Integer.parseInt(s);
			for(int i = 1; i <= broj;i++) {
				proizvod *= i;
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}	
				
		System.out.println("Proizvod brojeva je " + proizvod);
		
	}
	
	public static void proizvodUpisanihBrojeva() {
		BufferedReader bafer = new BufferedReader(new InputStreamReader(System.in));
		int proizvod = 1;
		pozdrav();
		while(true) {
			try {
				String s = bafer.readLine();
				if(s.equals("kraj")) {
					break;
				}
				int broj = Integer.parseInt(s);
				proizvod *= broj;
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}	
		}
				
		System.out.println("Proizvod brojeva je " + proizvod);
		
	}
	
}
