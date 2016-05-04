package menjacnica;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{

	private List<Kurs> listaKurseva = new LinkedList<>();
	
	@Override
	public void dodajKurs(Kurs noviKurs) {
		if(noviKurs != null || listaKurseva.contains(noviKurs))
			listaKurseva.add(noviKurs);
		else throw new RuntimeException("Greska pri unosu kursa");
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

	

	public void setListaKurseva(List<Kurs> listaKurseva) {
		this.listaKurseva = listaKurseva;
	}

	@Override
	public List<Kurs> getKursevi() {
		if(listaKurseva == null)
			listaKurseva = new LinkedList<>();
		return listaKurseva;
	}

	@Override
	public void sacuvajUFajl(String putanja) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(putanja)));

			out.writeObject(listaKurseva);

			out.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void ucitajIzFajla(String putanja) {
		
		try {
			ObjectInputStream in = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(putanja)));

			@SuppressWarnings("unchecked")
			LinkedList<Kurs> kursevi = (LinkedList<Kurs>) (in.readObject());
			listaKurseva.clear();
			listaKurseva.addAll(kursevi);

			in.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	
	
}
