package com.sample;

import java.util.List;

public class Gioco {
	
	private boolean attivo;
	private List<Giocatore> giocatori;
	
	public Gioco(boolean attivo, List<Giocatore> giocatori) {
		this.attivo = attivo;
		this.giocatori = giocatori;
		
	}

	public boolean isAttivo() {
		return attivo;
	}

	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}

	public List<Giocatore> getGiocatori() {
		return giocatori;
	}

	public void setGiocatori(List<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}
	
	
	
	

}
