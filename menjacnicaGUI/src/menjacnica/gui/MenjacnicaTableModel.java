package menjacnica.gui;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import menjacnica.Kurs;

@SuppressWarnings("serial")
public class MenjacnicaTableModel extends AbstractTableModel{

	private final String[] kolone = { "Šifra", "Skraceni naziv" , "Prodajni" ,
			"Srednji" ,"Kupovni" ,"Naziv" };
	private List<Kurs> kursevi;
	
	public MenjacnicaTableModel(List<Kurs> kursevi) {
		if(kursevi == null)
			this.kursevi = new LinkedList<>();
		else this.kursevi = kursevi;
	}
	
	public MenjacnicaTableModel() {
		this.kursevi = new LinkedList<>();
	}
	
	@Override
	public int getRowCount() {
		return kursevi.size();
	}

	@Override
	public int getColumnCount() {
		return kolone.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Kurs k = kursevi.get(rowIndex);
		switch(columnIndex){
		case 0:{
			return k.getSifra();
		}
		case 1:{
			return k.getSkraceniNaziv();
			}
		case 2:{
			return k.getProdajni();
		}
		case 3:{
			return k.getSrednji();
		} 
		case 4:{
			return k.getKupovni();
		}
		case 5:{
			return k.getNaziv();
		}default:
			return "NN";
		}
	}
	
	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}
	
	public void ucitajKurseve(List<Kurs> kursevi){
		this.kursevi = kursevi;
		fireTableDataChanged();
	}

	public String[] getKolone() {
		return kolone;
	}
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	
	
}
