package application;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class TestConexion {

	private String bd;
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private String usr;
	private String pwd;
	private static Connection conexion;

	public TestConexion() {

		Properties propiedades = new Properties();
		InputStream entrada = null;
		try {
			File miFichero = new File("src/configuracion.ini");
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				propiedades.load(entrada);

				usr = propiedades.getProperty("usuario");
				pwd = propiedades.getProperty("contrase�a");
			} else
				System.err.println("Fichero no encontrado");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);

			if (!conexion.isClosed()) {
				System.out.println("Conexi�n establecida");

			} else
				System.out.println("Fallo en Conexi�n");

		} catch (Exception e) {
			System.out.println("ERROR en conexi�n con ORACLE");
			e.printStackTrace();
		}

	}
	
public String ConsultaAlumnos() {
		
		String aux = "";
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM BASE.ALUMNO" );
			while(rset.next()) {
				aux += rset.getInt(1) + " " + rset.getString(2) ;
				aux += "\n";
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		return aux;
		
	}
public String ConsultaEmpresa() {
	
	String aux = "";
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT * FROM BASE.EMPRESA" );
		while(rset.next()) {
			aux += rset.getInt(1) + " " + rset.getString(2) ;
			aux += "\n";
		}
		rset.close();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	return aux;
	
}

public String ConsultaCiclo() {
	
	String aux = "";
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT * FROM BASE.CICLO" );
		while(rset.next()) {
			aux += rset.getInt(1) + " " + rset.getString(2) ;
			aux += "\n";
		}
		rset.close();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	return aux;
	
}

public String ConsultaTutorCentro() {
	
	String aux = "";
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT * FROM BASE.TUTORCENTRO" );
		while(rset.next()) {
			aux += rset.getInt(1) + " " + rset.getString(2) ;
			aux += "\n";
		}
		rset.close();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	return aux;
	
}

public String ConsultaVinculacion() {
	
	String aux = "";
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT * FROM BASE.HACEPRACTICA" );
		while(rset.next()) {
			aux += rset.getInt(1) + " " + rset.getString(2) ;
			aux += "\n";
		}
		rset.close();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	return aux;
	
}
	
	
	
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		new TestConexion();

	}

}
