package menjacnica.gui;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import menjacnica.Kurs;

@SuppressWarnings("serial")
public class MenjacnicaTableModel extends AbstractTableModel{

	private final String[] kolone = { "Sifra", "Skraceni naziv" , "Prodajni" ,
			"Srednji" ,"Kupovni" ,"Naziv" };
	private List<Kurs> kursevi;
	
	public MenjacnicaTableModel(List<Kurs> kursevi) {
		if(kursevi == null)
			this.kursevi = new LinkedList<>();
		else this.kursevi = kursevi;
	}
	
	
	@Override
	public int getRowCount() {
		return kursevi.size();
	}

	@Override
	public int getColumnCount() {
		return this.kolone.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Kurs k = kursevi.get(rowIndex);
		switch(columnIndex){
		case 1:{
			return k.getSifra();
		}
		case 2:{
			return k.getSkraceniNaziv();
			}
		case 3:{
			return k.getProdajni();
		}
		case 4:{
			return k.getSrednji();
		} 
		case 5:{
			return k.getKupovni();
		}
		case 6:{
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
	
}
