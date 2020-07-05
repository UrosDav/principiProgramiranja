package zadatak12_1_2;

import java.util.Scanner;

public class UcitavanjeSaTastature3 {

	private static void pozdrav() {
		System.out.println("Unesi recenice:");
	}
	
	public static void brojRecenicaUUnosu() {
		Scanner bafer = new Scanner(System.in);
		int brojRecenica = 0;
		pozdrav();
		try {
			String s = bafer.nextLine();
			brojRecenica = s.split("\\.").length;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			bafer.close();
		}
		
		System.out.println("Broj recenica je " + brojRecenica);
		bafer.close();
	}

	public static void brojReciUUnosu() {
		Scanner bafer = new Scanner(System.in);
		int brojac = 0;
		pozdrav();
		try {
			String s = bafer.nextLine();
			for(int i = 0; i<s.length();i++) {
				if (s.charAt(i) == '.' || s.charAt(i) == ' ' || s.charAt(i) == '?') {
					brojac++;
				}  
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			bafer.close();
		}
		
		System.out.println("Broj reci je " + brojac);
		bafer.close();
	}
	
	public static void brojReciSnegUUnosu() {
		Scanner bafer = new Scanner(System.in);
		int brojSnega = 0;
		pozdrav();
		try {
			String s = bafer.nextLine();
			brojSnega = s.split("sneg").length;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			bafer.close();
		}
		
		System.out.println("Broj reci sneg je " + brojSnega);
		bafer.close();
	}
	
	public static void distancaMetriUkilometre() {
		Scanner bafer = new Scanner(System.in);
		double kilometri = 0;
		pozdrav();
		try {
			String s = bafer.nextLine();
			int metri = Integer.parseInt(s);
			kilometri = (double)metri/1000;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			bafer.close();
		}
		
		System.out.println("Distanca u kilometrima je " + kilometri);
		bafer.close();
	}
	
	public static void sumaUpisanihBrojeva() {
		Scanner bafer = new Scanner(System.in);
		double suma = 0;
		pozdrav();
		while(true) {
			try {
				String s = bafer.nextLine();
				if(s.equals("kraj")) {
					break;
				}
				double broj = Double.parseDouble(s);
				suma += broj;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				bafer.close();
			}	
		}
				
		System.out.println("Suma brojeva je " + suma);
		bafer.close();
	}
	
	public static void faktorijelBroja() {
		Scanner bafer = new Scanner(System.in);
		int proizvod = 1;
		pozdrav();
		try {
			String s = bafer.nextLine();
			int broj = Integer.parseInt(s);
			for(int i = 1; i <= broj;i++) {
				proizvod *= i;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			bafer.close();
		}	
				
		System.out.println("Proizvod brojeva je " + proizvod);
		bafer.close();
	}
	
	public static void proizvodUpisanihBrojeva() {
		Scanner bafer = new Scanner(System.in);
		int proizvod = 1;
		pozdrav();
		while(true) {
			try {
				String s = bafer.nextLine();
				if(s.equals("kraj") || s.equals("") || s.equals(" ")) {
					break;
				}
				int broj = Integer.parseInt(s);
				proizvod *= broj;
			} catch (Exception e) {
				System.out.println("Greska: " + e.getMessage());
			}
		}
				
		System.out.println("Proizvod brojeva je " + proizvod);
		bafer.close();
	}
	
}
