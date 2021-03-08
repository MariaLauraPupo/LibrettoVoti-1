package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
//semplice contenitore di dati, non fa cose 
/**
 * 
 * @author Hp
 *
 */
public class Voto {
	private String nome;
	private int voto; //30L come lo rappresento?
	private LocalDate data;
	
	public Voto(String nome, int voto, LocalDate data) {
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " in data " + data ;
	}
	

}
