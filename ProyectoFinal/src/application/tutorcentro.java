package application;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class tutorcentro {

	@FXML
	private TextField myTextField1;
	@FXML
	private TextField myTextField2;
	@FXML
	private TextField myTextField3;
	@FXML
	private TextField myTextField4;

	@FXML
	private Button Anadir;
	@FXML
	private Button Modificar;
	@FXML
	private Button Borrar;

	@FXML
	private void initialize() {
	}

	
	@FXML
	public void anadirTutorCentro() throws SQLException {
		
		DatosTutorCentro mitutor = new DatosTutorCentro(myTextField1.getText(),myTextField2.getText(),myTextField3.getText(),myTextField4.getText());
		TestConexion conexionbbdd = new TestConexion();
		conexionbbdd.InsertTutorCentro(mitutor);
	}
	
}