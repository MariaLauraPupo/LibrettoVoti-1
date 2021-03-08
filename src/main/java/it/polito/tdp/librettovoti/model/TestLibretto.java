package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

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
	
	System.out.println(libretto);

}
}