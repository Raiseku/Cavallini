package com.sample;

import java.util.Collection;

public class Giocatore {
	
	private int id;
	private String scelta;
	private String nome;
	private int puntata;

	
	public Giocatore(int id, String nome, String scelta, int puntata) {
		this.id = id;
		this.nome = nome;
		this.scelta = scelta;
		this.puntata = puntata;
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPuntata() {
		return puntata;
	}


	public void setPuntata(int puntata) {
		this.puntata = puntata;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Giocatore [id=" + id + ", scelta=" + scelta + ", nome=" + nome + ", puntata=" + puntata + "]";
	}


	public String getScelta() {
		return scelta;
	}


	public void setScelta(String scelta) {
		this.scelta = scelta;
	}
	
	
}
