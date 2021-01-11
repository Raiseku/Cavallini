package com.sample;
import java.util.*; 
import java.lang.*;
import java.util.Arrays;

public class Deck {
	
	private String[] SUITS = {"♣️", "♦️", "♥️", "♠️"};
    private String[] RANKS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "J"};
    
    //("1 = ♥️, 2 = ♦️, 3 = ♣️, 4 = ♠️");
    
    private int NCARDS = SUITS.length * RANKS.length;
    private String[] deck = new String[NCARDS] ;

    private String[] carte_Step = new String[6] ;

    
    
    public void creaDeck() {
	    for (int i = 0; i < RANKS.length; i++) {
	        for (int j = 0; j < SUITS.length; j++) {
	            deck[SUITS.length*i + j] = RANKS[i] + "" + SUITS[j];
	        }
	    }
    }
    
    public String[] getCarte_Step() {
		return carte_Step;
	}

	public void setCarte_Step(String[] carte_Step) {
		this.carte_Step = carte_Step;
	}

	public String[] getDeck() {
		return deck;
	}

	public void setDeck(String[] deck) {
		this.deck = deck;
	}

	public void shuffle() {
	    for (int i = 0; i < NCARDS; i++) {
	        int r = i + (int) (Math.random() * (NCARDS-i));
	        String temp = deck[r];
	        deck[r] = deck[i];
	        deck[i] = temp;
	    }
    }
    public void stampaDeck() {
    	for (int i = 0; i < NCARDS; i++) {
            System.out.println(deck[i]);
        }
    }

}
