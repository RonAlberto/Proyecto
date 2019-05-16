package application;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ciclo {
	

	@FXML
	private TableView<ciclo> Tabla;

	@FXML
	private TableColumn<ciclo,String> ColNombre;

	@FXML
	private TableColumn<ciclo,String> ColGrado;
	
	@FXML
	private TableColumn<ciclo,String> ColFamilia;

	@FXML
	private TableColumn<ciclo,String> ColPeriodo;
	
	@FXML
	private TableColumn<ciclo,String> ColCapacidades;
	
	@FXML
	private TableColumn<ciclo,String> ColActividades;
	
	@FXML
	private TableColumn<ciclo,String> ColCriterios;
	
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
		public void anadirciclo() throws SQLException {
			
			DatosCiclo miciclo = new DatosCiclo(myTextField1.getText(),myTextField2.getText(),myTextField3.getText(),myTextField4.getText(),myTextField5.getText(),myTextField6.getText(),myTextField7.getText(),myTextField8.getText());
			TestConexion conexionbbdd = new TestConexion();
			conexionbbdd.InsertCiclo(miciclo);
		}
}



