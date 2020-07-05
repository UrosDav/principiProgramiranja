package zadatak8_3_1.valute;

public class TestKonvertorValute {

	public static void main(String[] args) {
		
		KonvertorValute kv = new KonvertorValute();
		
		kv.setKursDolara(60.34);
		kv.setKursEvra(76.89);
		
		System.out.println(kv.konvertujDinareUDolare(600));
		System.out.println(kv.konvertujDinareUEvre(4500));
		
		kv.ispisiKursnuListu();

	}

}
