package zadatak4_4;

public class DNKLanac {
	
	char[] karike;
	int brojKarika;
	
	DNKLanac(int broj){
		if(broj <=0) {
			karike = new char[256];
		}else {
			karike = new char[broj];
		}
		brojKarika=0;
	}
	
	void dodajKariku(char karika) {
		if(brojKarika == karike.length) {
			System.out.println("Nema mesta");
		}else if(karika == 'A' || karika == 'C' || karika == 'G' || karika == 'T') {
			karike[brojKarika] = karika;
			brojKarika++;
		}else {
			System.out.println("Pogresan unos");
		}
		
	}

	int brojAKarika() {
		int brojA = 0;
		for(int i = 0;i<brojKarika;i++) {
			if(karike[i]=='A') {
				brojA++;
			}
		}
		return brojA;
	}
	
	int duzinaLance() {
		return brojKarika;
	}
	
	int maksimalnaDuzinaLanca() {
		return karike.length;
	}
	
	int praznaMestaLanca() {
		return karike.length - brojKarika;
	}
	
	void ispisiKarike() {
		for(int i = 0;i<brojKarika;i++) {
			System.out.print(karike[i]);
		}
		System.out.println();
	}
	
	void ispisiKarikeObrnuto() {
		for(int i = brojKarika - 1;i>=0;i--) {
			System.out.print(karike[i]);
		}
		System.out.println();
	}
}
