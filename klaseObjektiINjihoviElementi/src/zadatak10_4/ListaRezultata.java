package zadatak10_4;

import java.util.LinkedList;

public class ListaRezultata {

	private LinkedList<Takmicar> takmicari; 
	
	public ListaRezultata() {
		takmicari = new LinkedList<Takmicar>();
	}
	
	public void unesiTakmicara(Takmicar t) {
		if(t != null && !takmicari.contains(t)) {
			if(t.getVreme() == 0) {
				takmicari.addLast(t);
			} else {
				for(int i = 0;i<takmicari.size();i++) {
					if(t.getVreme() < takmicari.get(i).getVreme() || takmicari.get(i).getVreme() == 0) {
						takmicari.add(i, t);
						break;
					}
				}
				
				if(!takmicari.contains(t)) {
					takmicari.addFirst(t);  //ovo ce biti u slucaju da je lista inicijalno prazna
				}
			}
			
		} else {
			System.out.println("Greska");
		}
	}
	
	public void ispisi() {
		for(int i = 0 ; i < takmicari.size();i++) {
			System.out.println((i+1) + ". " + takmicari.get(i));
		}
	}
	
	public void ispisiOsamNajboljih() {
		int broj = 8;
		if(takmicari.size() < broj) {
			broj = takmicari.size();
		}
		for(int i = 0; i < broj; i++) {
			if(takmicari.get(i).getVreme() > 0) {
				System.out.println((i+1) + ". " + takmicari.get(i));
			}
		}
		
	}
	
	public void ispisiReprezentativce(String drzava) {
		for(int i = 0; i<takmicari.size();i++) {
			if(takmicari.get(i).getDrzava().equals(drzava)) {
				System.out.println((i+1) + ". " + takmicari.get(i));
			}
		}
	}
	
	public boolean daLiJeOborenRekord(double rekord) {
		for(int i = 0; i<takmicari.size();i++) {
			if(takmicari.get(i).getVreme() < rekord) {
				return true;
			}
		}
		return false;
	}
}
