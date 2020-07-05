package zadatak10_3;

import java.util.LinkedList;

public class ReliRangLista {

	private LinkedList<ReliEkipa> ekipe;
	
	public ReliRangLista() {
		ekipe = new LinkedList <ReliEkipa>();
	}
	
	public void unos(ReliEkipa r) {
		if(r != null && !ekipe.contains(r)) {
			for(int i = 0; i < ekipe.size();i++) {
				if(ekipe.get(i).getBrojPoena() < r.getBrojPoena()) {
					ekipe.add(i, r);
					break;
				}
			}
//			if(ekipe.getLast().getBrojPoena() < r.getBrojPoena()) {
			if(!ekipe.contains(r)) {	
				ekipe.addLast(r);
			}
		}
		
	}
	
	public void ispisiCeluListu() {
		for(int i = 0; i < ekipe.size();i++) {
			System.out.println((i+1) + ". " + ekipe.get(i));
		}
	}
	
	public void ispisiCeluListuObrnuto() {
		for(int i = ekipe.size()-1; i >= 0;i--) {
			System.out.println((i+1) + ". " + ekipe.get(i));
		}
	}
	
	public void ispisiDesetNajboljih() {
		int granica;
		if(ekipe.size()<10) {
			granica = ekipe.size();
		} else {
			granica = 10;
		}
		for(int i = 0; i < granica;i++) {
			System.out.println((i+1) + ". " + ekipe.get(i));
		}
	}
	
	public void promeniPoziciju(ReliEkipa r) {
		if(r != null && ekipe.contains(r)) {
			ekipe.remove(r);
			unos(r);
		}
	}

}
