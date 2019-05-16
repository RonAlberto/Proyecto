package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class vinculacion {

	@FXML
	ChoiceBox<String> NomAlumno;

	@FXML
	ChoiceBox<String> NomApellidos;

	@FXML
	ChoiceBox<String> NomEmpresa;

	@FXML
	ChoiceBox<String> Tutorempresa;

	@FXML
	private TextField horarioentradaMa;

	@FXML
	private TextField horariosalidaMa;

	@FXML
	private TextField horarioentradaTar;

	@FXML
	private TextField horariosalidaTar;

	@FXML
	private Button Borrar;
	@FXML
	private Button Modificar;
	@FXML
	private Button Vincular;

	@FXML
	private void initialize() {
	}
}
