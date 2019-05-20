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
	public void pressedButton1(ActionEvent event) throws IOException{

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("datosalumno.fxml"));
		AnchorPane ventanaDos = (AnchorPane) loader.load();
        Stage ventana2 = new Stage();
        ventana2.setTitle("Datos alumno");
        Scene scene = new Scene(ventanaDos);
        ventana2.setScene(scene);
        ventana2.show();
        
       
	}
	public void pressedButton2(ActionEvent event) throws IOException{

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("datosempresa.fxml"));
		AnchorPane ventanaTres = (AnchorPane) loader.load();
        Stage ventana3 = new Stage();
        ventana3.setTitle("Datos empresa");
        Scene scene = new Scene(ventanaTres);
        ventana3.setScene(scene);
        ventana3.show();
        
       
	}
	public void pressedButton3(ActionEvent event) throws IOException{

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("datosciclo.fxml"));
		AnchorPane ventanaCuatro = (AnchorPane) loader.load();
        Stage ventana4 = new Stage();
        ventana4.setTitle("Datos ciclo");
        Scene scene = new Scene(ventanaCuatro);
        ventana4.setScene(scene);
        ventana4.show();
        
       
	}
	
	public void pressedButton4(ActionEvent event) throws IOException{

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("tutorcentro.fxml"));
		AnchorPane ventanaCinco = (AnchorPane) loader.load();
        Stage ventana5 = new Stage();
        ventana5.setTitle("Datos tutor centro");
        Scene scene = new Scene(ventanaCinco);
        ventana5.setScene(scene);
        ventana5.show();
        
       
	}
	public void pressedButton5(ActionEvent event) throws IOException{

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("vinculacion.fxml"));
		AnchorPane ventanaSexta = (AnchorPane) loader.load();
        Stage ventana6 = new Stage();
        ventana6.setTitle("Datos vinculacion");
        Scene scene = new Scene(ventanaSexta);
        ventana6.setScene(scene);
        ventana6.show();
        
       
	

    }
	
	
	
}