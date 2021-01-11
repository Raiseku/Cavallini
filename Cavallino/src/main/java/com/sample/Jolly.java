package com.sample;

public class Jolly {
	
	public String seme_jolly;
	public boolean girato;
	
	public Jolly(String seme_jolly, boolean girato) {
		this.seme_jolly = seme_jolly;
		this.girato = girato;
	}

	public boolean isGirato() {
		return girato;
	}

	public void setGirato(boolean girato) {
		this.girato = girato;
	}

	public String getSeme_jolly() {
		return seme_jolly;
	}

	public void setSeme_jolly(String seme_jolly) {
		this.seme_jolly = seme_jolly;
	}
	
}
