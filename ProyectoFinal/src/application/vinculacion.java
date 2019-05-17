package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class vinculacion {
	
	
	
	@FXML
	ChoiceBox<String> NombreAlumno;
	
	ObservableList<String> NombreList = FXCollections.observableArrayList("");
	
	@FXML
	ChoiceBox<String> Apellidos;
	
	ObservableList<String> ApellidosList = FXCollections.observableArrayList("");
	
	@FXML
	ChoiceBox<String> NombreEmpresa;
	
	ObservableList<String> NombreEmpresaList = FXCollections.observableArrayList("");
	
	@FXML
	ChoiceBox<String> TutorEmpresa;
	
	ObservableList<String> TutorEmpresaList = FXCollections.observableArrayList("");

	@FXML
	private TextField horarioentradaMa;

	@FXML
	private TextField horariosalidaMa;

	@FXML
	private TextField horarioentradaTar;

	@FXML
	private TextField horariosalidaTar;
	
	@FXML
	private TextField InicioPracticas;

	@FXML
	private TextField FinPracticas;

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
