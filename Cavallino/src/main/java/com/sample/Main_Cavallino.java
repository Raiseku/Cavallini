package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.util.*; 


public class Main_Cavallino {

    public static final void main(String[] args) {
        try {
       	
        	System.out.println("Bootstrapping the Rule Engine ...");
    		KieServices ks = KieServices.Factory.get();
    		KieContainer kContainer = ks.getKieClasspathContainer();
    		KieSession kSession = kContainer.newKieSession("ksession-rules");

    		Scanner scan = new Scanner(System.in);
    		
    		// Creo il deck e lo inserisco nella WM
    		Deck d = new Deck();
    		d.creaDeck();
    		d.shuffle();
    		
    		
    		// Creiamo i cavalli
    		Cavallo c_cuori = new Cavallo("♥️", 0,false);
    		Cavallo c_quadri = new Cavallo("♦️", 0,false);
    		Cavallo c_fiori = new Cavallo("♣️", 0,false);
    		Cavallo c_picche = new Cavallo("♠️", 0,false);


    		System.out.println("Inserisci il numero di giocatori:");
    		int numero_giocatori = scan.nextInt();
    		while (numero_giocatori<=0){
    			System.out.println("Deve essere presente almeno un giocatore:");
    			numero_giocatori = scan.nextInt();
    		};
    		String nome = "";
    		String scelta = "";
    		int puntata = 0;

    		List<Giocatore> giocatori = new LinkedList<Giocatore>(); 

    		// Inserimento e stampa dei giocatori
    		for (int i = 0; i < numero_giocatori; i++) {
    			Giocatore p = new Giocatore(i, nome, scelta, puntata);
    			System.out.println("Giocatore ["+i+"] inserisci il tuo nome");
    			nome = scan.next();
    			p.setNome(nome);
    			
    			System.out.println(p.getNome()+ " su quale cavallo vuoi puntare?");
   			    System.out.println("1 = ♥️, 2 = ♦️, 3 = ♣️, 4 = ♠️");
   			    scelta = scan.next();
   			 while (!(scelta.equals("1")) && !(scelta.equals("2")) && !(scelta.equals("3")) && !(scelta.equals("4"))){
      			System.out.println("Puoi puntare solo su uno di questi 4 cavalli:");
      			System.out.println("1 = ♥️, 2 = ♦️, 3 = ♣️, 4 = ♠️");
      			scelta = scan.next();
      		};
   			    if(scelta.equals("1")) {scelta="♥️";}
	   			if(scelta.equals("2")) {scelta="♦️";}
	   			if(scelta.equals("3")) {scelta="♣️";}
	   			if(scelta.equals("4")) {scelta="♠️";}
	   			p.setScelta(scelta);
   
   			    System.out.println("Quanto vuoi puntare su: " + p.getScelta()+" ?");
   			    puntata = scan.nextInt();
   			 while (puntata<=0){
     			System.out.println("Non puoi puntare così poco:");
     			puntata = scan.nextInt();
     		};
   			    p.setPuntata(puntata);
			    
   			    // Aggiungiamo il giocatore nella lista
   			    giocatori.add(p);

    		}
    		
    		
    		//Creazione dell primo step "fittizio" e del gioco
    		Step s = new Step("","", 1, false);
    		Jolly j = new Jolly("", false);
    		Gioco g = new Gioco(true, giocatori);
    		

    		//Inserimento nella Working memory degli oggetti
    		kSession.insert(d);
    		kSession.insert(j);
    		kSession.insert(g);
    		kSession.insert(s);
        	kSession.insert(c_cuori);
    		kSession.insert(c_quadri);
    		kSession.insert(c_fiori);
    		kSession.insert(c_picche);

    		 
     		int fired = kSession.fireAllRules();
            System.out.println("Numero di regole eseguite: "+fired);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }
}
