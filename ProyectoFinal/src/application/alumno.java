package application;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class alumno {
	
		

	@FXML
	private TableView<alumno> Tabla;

	@FXML
	private TableColumn<alumno, String> ColNombre;

	@FXML
	private TableColumn<alumno, String> ColApellido;

	@FXML
	private TableColumn<alumno, String> ColDni;

	@FXML
	private TableColumn<alumno, String> ColTelefono;

	@FXML
	private TableColumn<alumno, String> ColCp;

	@FXML
	private TableColumn<alumno, String> ColNota;

	@FXML
	private TextField myTextField1;
	@FXML
	private TextField myTextField2;
	@FXML
	private TextField myTextField3;
	@FXML
	private TextField myTextField4;
	@FXML
	private TextField myTextField5;
	@FXML
	private TextField myTextField6;
	@FXML
	private TextField myTextField7;
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
	public void anadiralumno() throws SQLException {
		
		DatosAlumno mialumno = new DatosAlumno(myTextField1.getText(),myTextField2.getText(),myTextField3.getText(),myTextField4.getText(),Integer.valueOf(myTextField5.getText()),myTextField6.getText(),myTextField7.getText());
		TestConexion conexionbbdd = new TestConexion();
		conexionbbdd.InsertAlumno(mialumno);
	}
	

	
}


