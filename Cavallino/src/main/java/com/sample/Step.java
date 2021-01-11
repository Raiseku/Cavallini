package com.sample;

public class Step {
	
	private String seme;
	private String valore;
	private int posizione;
	private boolean da_girare;
	
	
	public Step(String seme, String valore, int posizione, boolean da_girare) {
		this.posizione = posizione;
		this.valore = valore;
		this.seme = seme;
		this.da_girare = da_girare;
	}
	
	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public boolean isDa_girare() {
		return da_girare;
	}

	public void setDa_girare(boolean da_girare) {
		this.da_girare = da_girare;
	}

	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme;
	}

}
