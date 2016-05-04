package menjacnica.interfejs;

import java.util.List;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(Kurs noviKurs);
	
	public Kurs obrisiKurs(Kurs kursZaBrisanje);
	
	public void izmeniPostojeciKurs(Kurs stariKurs,Kurs noviKurs);
	
	public List<Kurs> getKursevi();
	
	public void sacuvajUFajl(String putanja);
	
    public void ucitajIzFajla(String putanja);
}
