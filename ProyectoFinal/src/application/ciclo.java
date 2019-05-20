package application;

import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ciclo {
	
	TestConexion conexionbbdd; 

	@FXML
	private TableView<DatosCiclo> Tabla;
	
	@FXML
	private TableColumn<DatosCiclo,String> ColIdCiclo;
	
	private final ObservableList<DatosCiclo> ciclo = FXCollections.observableArrayList();

	@FXML
	private TableColumn<DatosCiclo,String> ColNombre;

	@FXML
	private TableColumn<DatosCiclo,String> ColGrado;
	
	@FXML
	private TableColumn<DatosCiclo,String> ColPeriodo;
	
	@FXML
	private TableColumn<DatosCiclo,String> ColFamilia;

	@FXML
	private TableColumn<DatosCiclo,String> ColCapacidades;
	
	@FXML
	private TableColumn<DatosCiclo,String> ColActividades;
	
	@FXML
	private TableColumn<DatosCiclo,String> ColCriterios;
	
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
		   
		   conexionbbdd = new TestConexion();
	        
	        
			
	        
			Tabla.setItems(conexionbbdd.ConsultaCiclo());
		
			ColIdCiclo.setCellValueFactory(new PropertyValueFactory<DatosCiclo,String>("idciclo"));
			ColNombre.setCellValueFactory(new PropertyValueFactory<DatosCiclo,String>("nombre"));
			ColGrado.setCellValueFactory(new PropertyValueFactory<DatosCiclo,String>("grado"));
			ColPeriodo.setCellValueFactory(new PropertyValueFactory<DatosCiclo,String>("periodopracticas"));
			ColFamilia.setCellValueFactory(new PropertyValueFactory<DatosCiclo,String>("familiaprofesional"));
			ColCapacidades.setCellValueFactory(new PropertyValueFactory<DatosCiclo,String>("capacidadesterminales"));
			ColActividades.setCellValueFactory(new PropertyValueFactory<DatosCiclo,String>("actividades"));
			ColCriterios.setCellValueFactory(new PropertyValueFactory<DatosCiclo,String>("criteriosevaluacion"));
		}
	

	   @FXML
		public void anadirciclo() throws SQLException {
			
			DatosCiclo miciclo = new DatosCiclo(myTextField1.getText(),myTextField2.getText(),myTextField3.getText(),myTextField4.getText(),myTextField5.getText(),myTextField6.getText(),myTextField7.getText(),myTextField8.getText());
			TestConexion conexionbbdd = new TestConexion();
			conexionbbdd.InsertCiclo(miciclo);
			Tabla.setItems(conexionbbdd.ConsultaCiclo());
		}
}



