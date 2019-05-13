package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Principal {

	@FXML
	private Button alumno;
	@FXML
	private Button empresa;
	@FXML
	private Button ciclo;
	@FXML
	private Button tutorcentro;
	@FXML
	private Button vincular;
	@FXML
	private Button generaranexos;

	@FXML
	private void initialize(){
	}

	//Método cuando se aprieta el botón
	public void pressedButton(ActionEvent event) throws IOException{

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("datosalumno.fxml"));
		AnchorPane ventanaDos = (AnchorPane) loader.load();
        Stage ventana = new Stage();
        ventana.setTitle("Venta Dos");
        Scene scene = new Scene(ventanaDos);
        ventana.setScene(scene);
        ventana.show();
	}
	
	
}
