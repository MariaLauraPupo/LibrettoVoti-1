package it.polito.tdp.librettovoti.model;


import java.time.LocalDate;
import java.util.List;

//classe con il metodo main
public class TestLibretto {
	public static void main(String[] args) {
		System.out.println("Test metodi libretto");
		
	//crea un libretto e gli dice di aggiungere dei voti
	Libretto libretto = new Libretto();
	
	Voto voto1 = new Voto("Analisi1", 30, LocalDate.of(2019, 2, 15));
	
	libretto.add(voto1);
	libretto.add(new Voto("Fisica1", 27, LocalDate.of(2019,7,12)));
	libretto.add(new Voto("Informatica", 18, LocalDate.of(2019,9,8)));
	libretto.add(new Voto("Chimica", 25, LocalDate.of(2019,7,6)));
	

	System.out.println(libretto);
	
	//utilizzando il metodo 3
	List<Voto> venticinque = libretto.listaVotiUguali(25);
	System.out.println(venticinque);
	
	//utilizzando il metodo 4
	Libretto librettoventicinque = libretto.votiUguali3(25);
	System.out.println(librettoventicinque);
 
}
}