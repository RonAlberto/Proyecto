package application;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class empresa {
	
	
	@FXML
	private TableView<DatosEmpresa> Tabla;
	
	@FXML
	private TableColumn<DatosEmpresa,String> ColIdEmpresa;

	@FXML
	private TableColumn<DatosEmpresa,String> ColNombre;
	
	@FXML
	private TableColumn<DatosEmpresa,String> ColConvenio;
	
	@FXML
	private TableColumn<DatosEmpresa,String> ColCiudad;
	
	@FXML
	private TableColumn<DatosEmpresa,String> ColFecha;
	
	@FXML
	private TableColumn<DatosEmpresa,String> ColRepresentante;

	@FXML
	private TableColumn<DatosEmpresa,String> ColDniTutor;
	
	@FXML
	private TableColumn<DatosEmpresa,String> ColEmailTutorEmpresa;
	
	
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
	private TextField myTextField8;
	   
	@FXML
	private Button Anadir;
	@FXML
	private Button Modificar;
    @FXML
	private Button Borrar;
	
	   @FXML
	   private void initialize(){
	}
	   @FXML
		public void anadirempresa() throws SQLException {
			
			DatosEmpresa miempresa = new DatosEmpresa(myTextField1.getText(),myTextField2.getText(),myTextField3.getText(),myTextField4.getText(),myTextField5.getText(),myTextField6.getText(),myTextField7.getText(),myTextField8.getText());
			TestConexion conexionbbdd = new TestConexion();
			conexionbbdd.InsertEmpresa(miempresa);
		}
}



