package com.sample;

public class Cavallo {
	
	public String seme;
	public int posizione = 0;
	public boolean da_muovere = false;
	public Cavallo(String seme, int posizione, boolean da_muovere) {
		this.seme = seme;
		this.posizione = posizione;
		this.da_muovere=da_muovere;
	}

	public boolean getDa_muovere() {
		return da_muovere;
	}

	public void setDa_muovere(boolean da_muovere) {
		this.da_muovere = da_muovere;
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme;
	}

	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}


	

}
