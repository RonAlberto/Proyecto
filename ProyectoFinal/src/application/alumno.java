package application;


import java.sql.SQLException;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class alumno {
	
	TestConexion conexionbbdd; 
		

	@FXML
	private TableView<DatosAlumno> Tabla;
	
	@FXML
	private TableColumn<DatosAlumno, String> ColDni;
	
	private final ObservableList<DatosAlumno> alumno = FXCollections.observableArrayList();

	@FXML
	private TableColumn<DatosAlumno, String> ColNombre;

	@FXML
	private TableColumn<DatosAlumno, String> ColApellido;

	@FXML
	private TableColumn<DatosAlumno, String> ColTelefono;

	@FXML
	private TableColumn<DatosAlumno, String> ColNota;
	
	@FXML
	private TableColumn<DatosAlumno, String> ColCp;
	
	@FXML
	private TableColumn<DatosAlumno, String> ColDniTutor;

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
	
	
	private DatosAlumno personData;

	@FXML
	private void initialize() {
		
        conexionbbdd = new TestConexion();
        
        
		
        
		Tabla.setItems(conexionbbdd.ConsultaAlumnos());
	
		ColDni.setCellValueFactory(new PropertyValueFactory<DatosAlumno,String>("DNI"));
		ColNombre.setCellValueFactory(new PropertyValueFactory<DatosAlumno,String>("Nombre"));
		ColApellido.setCellValueFactory(new PropertyValueFactory<DatosAlumno,String>("Apellidos"));
		ColTelefono.setCellValueFactory(new PropertyValueFactory<DatosAlumno,String>("Telefono"));
		ColNota.setCellValueFactory(new PropertyValueFactory<DatosAlumno,String>("Nota"));
		ColCp.setCellValueFactory(new PropertyValueFactory<DatosAlumno,String>("CP"));
		ColDniTutor.setCellValueFactory(new PropertyValueFactory<DatosAlumno,String>("dnitutor"));
	}

	
	@FXML
	public void anadiralumno() throws SQLException {
		
		DatosAlumno mialumno = new DatosAlumno(myTextField1.getText(),myTextField2.getText(),myTextField3.getText(),myTextField4.getText(),Integer.valueOf(myTextField5.getText()),myTextField6.getText(),myTextField7.getText());
		TestConexion conexionbbdd = new TestConexion();
		conexionbbdd.InsertAlumno(mialumno);
		Tabla.setItems(conexionbbdd.ConsultaAlumnos());
	}
	

	
	
	}

	


