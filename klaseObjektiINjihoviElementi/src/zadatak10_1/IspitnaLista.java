package zadatak10_1;

import java.util.LinkedList;

public class IspitnaLista {

	private LinkedList<Student> studenti;
	
	public IspitnaLista() {
		studenti = new LinkedList<Student>();
	}
	
	public boolean daLiJeUListi(Student s) {
		if(s instanceof Student) {
			return studenti.contains(s);
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
			return false;
		}
	}
	
	public void dodajStudenta(Student s) {
		studenti.add(s);
	}
	
	public void dodajStudentaNaPocetak(Student s) {
		if(s != null && !studenti.contains(s)) {
			studenti.addFirst(s);
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	
	public void dodajStudentaNaKraj(Student s) {
		if(s != null && !studenti.contains(s)) {
			studenti.addLast(s);
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	
	public void dodajStudentaNaMesto(Student s,int mesto) {
		if(s != null && !studenti.contains(s) && mesto >=0 && mesto < studenti.size()) {
			studenti.add(mesto, s);
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	
	public void izbrisiStudenta(Student s) {
		if(s != null && studenti.contains(s)) {
			studenti.remove(s);
		} else {
			System.out.println("Doslo je do greske prilikom unosa");
		}
	}
	
	public void izbrisiStudentaSaPocetka() {
		if(!studenti.isEmpty()) {
			studenti.removeFirst();
		} else {
			System.out.println("Doslo je do greske prilikom brisanja");
		}
	}
	
	public void izbrisiStudentaSaKraja() {
		if(!studenti.isEmpty()) {
			studenti.removeLast();
		} else {
			System.out.println("Doslo je do greske prilikom brisanja");
		}
	}
	
	public void izbrisiStudentaSaMesta(int mesto) {
		if(studenti.size()>mesto && mesto >=0) {
			studenti.remove(mesto);
		} else {
			System.out.println("Doslo je do greske prilikom brisanja");
		}
	}
	
	public void obrisiListu() {
		if(studenti.size()>0) {
			studenti.clear();
		} else {
			System.out.println("Nema sta da se brise");
		}
	}
	
	public void ispisiPrvog() {
		if(studenti.size()>0) {
			System.out.println(studenti.getFirst());
		} else {
			System.out.println("List je prazana");
		}
		
	}
	
	public void ispisiPoslednjeg() {
		if(studenti.size()>0) {
			System.out.println(studenti.getLast());
		} else {
			System.out.println("List je prazana");
		}
		
	}
	
	public void ispisiSve() {
		if(studenti.size()>0) {
			for(int i = 0; i < studenti.size();i++) {
				System.out.println(studenti.get(i));
			}
		} else {
			System.out.println("List je prazana");
		}
		
	}
	
	public void ispisiDesetke() {
		if(studenti.size()>0) {
			for(int i = 0; i < studenti.size();i++) {
				if(studenti.get(i).getOcena() == 10) {
					System.out.println(studenti.get(i));
				}
			}
		} else {
			System.out.println("List je prazana");
		}
		
	}
	
	public double prosek() {
		if(studenti.size()>0) {
			double suma=0;
			for(int i = 0; i < studenti.size();i++) {
				suma += studenti.get(i).getOcena();
			}
			return suma/(studenti.size());
		} else {
			System.out.println("List je prazana");
			return 0;
		}
		
	}
	
	public void ispisiStareStudente() {
		for(int i = 0; i < studenti.size();i++) {
			if(studenti.get(i).getBrojIndeksa().substring(5).equals("99")) {
				System.out.println(studenti.get(i));
			}
		}
		
	}
	
	
}
