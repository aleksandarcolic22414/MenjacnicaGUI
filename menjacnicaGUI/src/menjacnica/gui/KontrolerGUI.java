package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import menjacnica.*;
import menjacnica.interfejs.MenjacnicaInterfejs;

public class KontrolerGUI {

	/*
	 ** Pokretanje aplikacije
	 */
	private static MenjacnicaGUI glavniProzor;
	private static MenjacnicaInterfejs menjacnica;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menjacnica = new Menjacnica();
					glavniProzor = new MenjacnicaGUI();
					glavniProzor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void ugasiAplikaciju() {
		int opcija = JOptionPane.showConfirmDialog(glavniProzor.getContentPane(), "Da li zelite da zatvorite program?",
				"Zatvaranje aplikacije", JOptionPane.YES_NO_OPTION);

		if (opcija == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public void dodajKurs(Kurs noviKurs){
		menjacnica.dodajKurs(noviKurs);
	}
	
	public void obrisiKurs(Kurs kursZaBrisanje){
		menjacnica.obrisiKurs(kursZaBrisanje);
	}
	
	public void izmeniKurs(Kurs stariKurs,Kurs noviKurs){
		menjacnica.izmeniPostojeciKurs(stariKurs, noviKurs);
	}
	
}
