package zadatak10_2;

import java.util.LinkedList;

public class BazaMotocikala {
	
	private LinkedList<Motocikl> motocikli;
	
	public BazaMotocikala() {
		motocikli = new LinkedList<Motocikl>();
	}

	public boolean daLiJeUBazi(Motocikl m) {
		if(motocikli.size() > 0) {
			return motocikli.contains(m);
		} else {
			System.out.println("Baza je prazna");
			return false;
		}
	}
	
	public void unesiUBazu(Motocikl m) {
		if(!this.daLiJeUBazi(m)) {
			motocikli.add(m);
		} else {
			System.out.println("Motocikl je vec u bazi");
		}
	}
	
	public void izbaciIzBaze(Motocikl m) {
		if(this.daLiJeUBazi(m)) {
			motocikli.remove(m);
		} else {
			System.out.println("Motocikl nije u bazi");
		}
	}
	
	public void ispisi() {
		if(motocikli.size()>0) {
			for(int i = 0; i < motocikli.size();i++) {
				System.out.println(motocikli.get(i));
			}
			System.out.println();
		} else {
			System.out.println("Baza je prazna");
		}
	}
	
	public void ispisiKawasaki() {
		if(motocikli.size()>0) {
			for(int i = 0; i < motocikli.size();i++) {
				if(motocikli.get(i).getMarka().equals("Kawasaki")) {
					System.out.println(motocikli.get(i));
				}
			}
			System.out.println();
		} else {
			System.out.println("Baza je prazna");
		}
	}
	
	public int maxKubikaza() {
		int maks = 0;
		for(int i = 0; i < motocikli.size(); i++) {
			if(maks < motocikli.get(i).getKubikaza()) {
				maks = motocikli.get(i).getKubikaza();
			}
		}
		return maks;
	}
	
	public double prosecnaKubikaza() {
		int suma = 0;
		for(int i = 0; i < motocikli.size(); i++) {
			suma += motocikli.get(i).getKubikaza();
		}
		return suma/motocikli.size();
	}
	
	public void ispisiNajveci() {
		for(int i = 0; i<motocikli.size(); i++) {
			if(motocikli.get(i).getKubikaza() == maxKubikaza()) {
				System.out.println(motocikli.get(i));
			}
		}
	}
	
}
