package zadatak5_6;

public class TestOceneStudenata {

	public static void main(String[] args) {
		
		OcenaStudenta ocene1 = new OcenaStudenta("0067/99 Bojan Vukovic 10;0103/06 Patris Lumumba 6;0001/99 Mika Lazic 5");
		
		ocene1.ispisiPodatkeOSvimStudentima();
		System.out.println();
		ocene1.ispisiPodatkeOStudentimaKojiNisuPolozili();
		System.out.println();
		ocene1.ispisiPodatkeOStudentimaKojiSuPolozili();
		System.out.println();
		ocene1.ispisiPodatkeOStudentimaKojiSuUpisali1999();
	}

}
