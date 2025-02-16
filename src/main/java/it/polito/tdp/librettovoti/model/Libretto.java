package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libretto {
	private List<Voto> voti;
	private Map<String, Voto> votiMap;//ogni volta  che inserisco un nuovo voto lo inserisco sia nella mappa che nella lista

	public Libretto() {
	this.voti = new ArrayList<>();
	this.votiMap = new HashMap<>();
	}
	public void add(Voto v) {
		voti.add(v);
		votiMap.put(v.getNome(), v);
		
	}
	/*metodi per stampare i voti uguali a 25*/
	//1
	/*public void stampaVotiUguali(int punteggio) {
		//sa fare solo
		System.out.println();
	}
	//2
	public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti
		//sarà poi il richiamante a stamparli
		//più generale
		//come comporre la stringa?
	}*/
	//3
	/*public List<Voto> listaVotiUguali(int punteggio){
		//restituisce solo i voti uguali al criterio
		List<Voto> risultato=new ArrayList<>();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
		
	}*/
	//4 TODO
	public Libretto votiUguali3(int punteggio) {
		//restituisco il libretto formato da quei determinati voti, così ha tutte le funzionalità del libretto
	Libretto risultato = new Libretto();
	for(Voto v:this.voti) {
		if(v.getVoto()==punteggio) {
			risultato.add(v);
		}
	}return risultato;
	}
	/**
	 * ricerca un Voto  del corso di cui è specificato il nome
	 * se il corso non esiste, restituisce null
	 * @param nomeCorso
	 * @return
	 */
	public Voto ricercaCorso(String nomeCorso) {
		/*Voto risultato=null;
		for(Voto v:this.voti) {
			if(v.getNome().equals(nomeCorso)) {
				risultato=v;
				break;
			}
		}
		return risultato;*/ // se non faccio la Mappa
		return this.votiMap.get(nomeCorso);
	}
	//punto 3-->veridficare che non esistano duplicati
	/**
	 * verifica che nel libretto non ci sia lo stesso esame con la stassa valutazione
	 * @param v
	 * @return
	 */
	public boolean esisteDuplicato(Voto v) {
		/*boolean trovato = false;
		for(Voto voto: this.voti) {
			if(voto.getNome().equals(v.getNome()) && voto.getVoto()==v.getVoto()) {
				trovato=true;
				break;
				
			}
		}
		return trovato;*/ // così se non uso la Mappa
		//se uso la mappa invece
		Voto trovato=this.votiMap.get(v.getNome());
		if(trovato==null)
			return false;
		if(trovato.getVoto()==v.getVoto())
			return true;
		else
			return false;
	}
	//punto 4-->verificare che nel libretto non ci sia lo stesso esame ma con votazione diversa
	/**
	 * verifica se nel libretto c'è già un voto con lo stesso esame ma valutazione diversa
	 * @param v
	 * @return
	 */
	public boolean esisteConflitto(Voto v) {
		/*boolean trovato = false;
		for(Voto voto: this.voti) {
			if(voto.getNome().equals(v.getNome()) && voto.getVoto()!=v.getVoto()) {
				trovato=true;
				break;
				
			}
		}
		return trovato;*/ //senza usare la Mappa
		Voto trovato=this.votiMap.get(v.getNome());
		if(trovato==null) {
			return false;
		}
		if(trovato.getVoto()!=v.getVoto()) {
			return true;
		}
		else
			return false;
	}
	
	public String toString() {
		String s ="";
		for(Voto v:this.voti) {
			s = s + v.toString() + "\n";
		}
		return s;
	}

}
