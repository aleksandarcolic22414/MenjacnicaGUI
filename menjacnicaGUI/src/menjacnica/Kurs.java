package menjacnica;

import java.io.Serializable;

public class Kurs implements Serializable{

	private String sifra;
	private String skraceniNaziv;
	private double prodajni;
	private double srednji;
	private double kupovni;
	private String naziv;
	
	public Kurs(){}
	
	public Kurs(String sifra, String skraceniNaziv, double prodajni, double srednji, double kupovni, String naziv) {
		super();
		this.sifra = sifra;
		this.skraceniNaziv = skraceniNaziv;
		this.prodajni = prodajni;
		this.srednji = srednji;
		this.kupovni = kupovni;
		this.naziv = naziv;
	}
	
	public void setKurs(Kurs noviKurs){
		this.sifra = noviKurs.getSifra();
		this.skraceniNaziv = noviKurs.getSkraceniNaziv();
		this.prodajni = noviKurs.getProdajni();
		this.srednji = noviKurs.getSrednji();
		this.kupovni = noviKurs.getKupovni();
		this.naziv = noviKurs.getNaziv();
	}
	
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "Naziv: " + naziv + " ,skraceni naziv: " + skraceniNaziv
				+ " ,sifra: " + sifra + " ,prodajni: " + prodajni + ", srednji: "
				+ srednji + ", kupovni: " + kupovni + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sifra == null) ? 0 : sifra.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (sifra == null) {
			if (other.sifra != null)
				return false;
		} else if (!sifra.equals(other.sifra))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	
	
	
}
