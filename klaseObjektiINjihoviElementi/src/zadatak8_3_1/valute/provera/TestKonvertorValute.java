package zadatak8_3_1.valute.provera;

import zadatak8_3_1.valute.KonvertorValute;

public class TestKonvertorValute {

	public static void main(String[] args) {
		
		KonvertorValute kv = new KonvertorValute();
		
		kv.setKursDolara(55);
		kv.setKursEvra(80);
		
		System.out.println(kv.konvertujDinareUDolare(550));
		System.out.println(kv.konvertujDinareUEvre(16000));
		
	}

}
