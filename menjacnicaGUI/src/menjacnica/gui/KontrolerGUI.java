package menjacnica.gui;

import java.awt.EventQueue;
import java.io.File;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import menjacnica.*;
import menjacnica.interfejs.MenjacnicaInterfejs;

public class KontrolerGUI {

	/*
	 ** Pokretanje aplikacije
	 */
	private static MenjacnicaGUI glavniProzor;
	private static MenjacnicaInterfejs menjacnica;
	private static DodajKursGUI dodajKursProzor;
	
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
	
	public static void dodajKurs(Kurs noviKurs){
		menjacnica.dodajKurs(noviKurs);
	}
	
	public static void obrisiKurs(Kurs kursZaBrisanje){
		menjacnica.obrisiKurs(kursZaBrisanje);
	}
	
	public static void izmeniKurs(Kurs stariKurs,Kurs noviKurs){
		menjacnica.izmeniPostojeciKurs(stariKurs, noviKurs);
	}
	
	public static List<Kurs> vratiSveKurseve(){
		return menjacnica.getKursevi();
	}

	public static void sacuvajUFajl() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(glavniProzor.getContentPane());

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				menjacnica.sacuvajUFajl(file.getAbsolutePath());
				KontrolerGUI.dodajTekstNaStatus("Sacuvan fajl: " + file.getAbsolutePath());
				
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(glavniProzor.getContentPane(), e1.getMessage(), "Greska",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public static void ucitajIzFajla() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(glavniProzor.getContentPane());

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				menjacnica.ucitajIzFajla(file.getAbsolutePath());
				KontrolerGUI.dodajTekstNaStatus("Ucitan fajl: " + file.getAbsolutePath());
				glavniProzor.osveziTabelu();
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(glavniProzor.getContentPane(), e1.getMessage(), "Greska",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void postaviTekstStatusa(String tekst){
		glavniProzor.postaviTekstStatusGUI(tekst);
	}
	
	public static void dodajTekstNaStatus(String tekst){
		glavniProzor.dodajTekstNaStatus(tekst);
	}

	public static void dodajKursUListuKurseva(Kurs kurs) {
		menjacnica.dodajKurs(kurs);
		glavniProzor.osveziTabelu();
		dodajTekstNaStatus("Dodaj je kurs: " + kurs);
	}
	
	public static void napraviProzorDodajKurs(){
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						dodajKursProzor = new DodajKursGUI();
						dodajKursProzor.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}
	
}
