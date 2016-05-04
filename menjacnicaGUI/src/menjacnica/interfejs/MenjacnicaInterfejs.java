package menjacnica.interfejs;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(Kurs noviKurs);
	public Kurs obrisiKurs(Kurs kursZaBrisanje);
	public void izmeniPostojeciKurs(Kurs stariKurs,Kurs noviKurs);
	
}
