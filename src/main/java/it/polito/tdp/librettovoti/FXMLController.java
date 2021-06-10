package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	//2 creo la variabile libretto dell'oggetto che ho creato al punto 1 nella classeEntryPoint
    private Libretto model;
    //3 aggiungo il metodo setModel() più in basso
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtEsame;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtData;

    @FXML
    private TextArea txtResult;

    @FXML
    void doInserisci(ActionEvent event) {
    	
    	// leggi e controlla i dati
    	
    	String nomeEsame = txtEsame.getText();
    	if(nomeEsame.length()==0) {
    		txtResult.setText("ERRORE: nome esame vuoto");
    		return;
    	}
    	
    	String votoEsame = txtVoto.getText();
    	//controllo che sia stato inserito un numero intero
    	int votoInt = 0;
    	try {
    		votoInt = Integer.parseInt(votoEsame);
    	}
    	catch(NumberFormatException ex) {
    		txtResult.setText("ERRORE: il voto deve essere un numero intero");
    		return;
    	}
    	//controllo che il numero intero sia compreso tra 18 e 30
    	if(votoInt<18||votoInt>30) {
    		txtResult.setText("ERRORE: il voto deve essere compreso tra 18 e 30 ");
    		return;
    	}
    	
    	
    	String dataEsame = txtData.getText();
    	//controllo che la data sia nel formato corretto
    	LocalDate data;
    	try {
    		data=LocalDate.parse(dataEsame);
    	}
    	catch(DateTimeParseException ex){
    		txtResult.setText("ERRORE: formato data sbagiato");
    		return;
    	}
    	
    	//esegui l'azione
    	Voto voto = new Voto(nomeEsame, votoInt, data);
    	model.add(voto);
    	
    	
    	
    	//aggiorna i risultati nella View
    	txtResult.setText(model.toString());
    	txtEsame.clear();
    	txtVoto.clear();
    	txtData.clear();

    }
    
    //3 metodo setModel()--> //4 devo richiamarlo nell'EntryPoint
    public void setModel(Libretto model) {
    	this.model = model;
    }
    @FXML
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"tstResult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
}

