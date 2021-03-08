package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	private List<Voto> voti;

	public Libretto() {
	this.voti = new ArrayList<>();
	}
	public void add(Voto v) {
		voti.add(v);
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
	public List<Voto> listaVotiUguali(int punteggio){
		//restituisce solo i voti uguali al criterio
		List<Voto> risultato=new ArrayList<>();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
		
	}
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
	public String toString() {
		String s ="";
		for(Voto v:this.voti) {
			s = s + v.toString() + "\n";
		}
		return s;
	}

}
