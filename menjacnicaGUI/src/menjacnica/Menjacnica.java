package menjacnica;

import java.util.LinkedList;
import java.util.List;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{

	private List<Kurs> listaKurseva = new LinkedList<>();
	
	@Override
	public void dodajKurs(Kurs noviKurs) {
		if(noviKurs != null)
			listaKurseva.add(noviKurs);
		else throw new RuntimeException("Novi kurs nije inicijalizovan");
	}

	@Override
	public Kurs obrisiKurs(Kurs kursZaBrisanje) {
		if(kursZaBrisanje != null){
			if(listaKurseva.contains(kursZaBrisanje)){
					Kurs k = listaKurseva.get(listaKurseva.indexOf(kursZaBrisanje));
					listaKurseva.remove(kursZaBrisanje);
					return k;
			}
			else throw new RuntimeException("Kurs se ne nalazi u listi");
		}else throw new RuntimeException("Uneti kurs nije inicijalizovan");
		
	}

	@Override
	public void izmeniPostojeciKurs(Kurs stariKurs, Kurs noviKurs) {
		if(stariKurs != null){
			if(listaKurseva.contains(stariKurs)){
				listaKurseva.get(listaKurseva.indexOf(stariKurs)).setKurs(noviKurs);;
			}else throw new RuntimeException("Kurs se ne nalazi u listi");
		}else throw new RuntimeException("Uneti kurs nije inicijalizovan");
	}

	
	
}
