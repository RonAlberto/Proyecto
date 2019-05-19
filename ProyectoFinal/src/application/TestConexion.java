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
				pwd = propiedades.getProperty("contraseña");
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
				System.out.println("Conexión establecida");

			} else
				System.out.println("Fallo en Conexión");

		} catch (Exception e) {
			System.out.println("ERROR en conexión con ORACLE");
			e.printStackTrace();
		}

	}

	public String ConsultaAlumnos() {

		String aux = "";

		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM DATOS.ALUMNO");
			while (rset.next()) {
				aux += rset.getInt(1) + " " + rset.getString(2);
				aux += "\n";
			}
			rset.close();
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return aux;

	}

	public String ConsultaEmpresa() {

		String aux = "";

		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM DATOS.EMPRESA");
			while (rset.next()) {
				aux += rset.getInt(1) + " " + rset.getString(2);
				aux += "\n";
			}
			rset.close();
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return aux;

	}

	public String ConsultaCiclo() {

		String aux = "";

		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM DATOS.CICLO");
			while (rset.next()) {
				aux += rset.getInt(1) + " " + rset.getString(2);
				aux += "\n";
			}
			rset.close();
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return aux;

	}

	public String ConsultaTutorCentro() {

		String aux = "";

		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM DATOS.TUTORCENTRO");
			while (rset.next()) {
				aux += rset.getInt(1) + " " + rset.getString(2);
				aux += "\n";
			}
			rset.close();
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return aux;

	}

	public String ConsultaVinculacion() {

		String aux = "";

		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM DATOS.HACEPRACTICA");
			while (rset.next()) {
				aux += rset.getInt(1) + " " + rset.getString(2);
				aux += "\n";
			}
			rset.close();
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return aux;

	}

public static int InsertAlumno(DatosAlumno mialumno) throws SQLException{
		
		Statement stmt = conexion.createStatement();
	    int num = stmt.executeUpdate("INSERT INTO DATOS.ALUMNO VALUES (" + "'" + mialumno.DNI + "'" + "," + "'" + mialumno.Nombre + "'" + "," + "'" + mialumno.Apellido + "'" + "," + "'" + mialumno.Telefono + "'" + "," + mialumno.Nota + "," + "'" + mialumno.CP + "'" + "," + "'" + mialumno.dnitutor + "'" + ")");
		return num;
}
	
public static int InsertEmpresa(DatosEmpresa miempresa) throws SQLException{
	
	Statement stmt = conexion.createStatement();
    int num = stmt.executeUpdate("INSERT INTO DATOS.EMPRESA VALUES (" + "'" + miempresa.IdEmpresa + "'" + "," + "'" + miempresa.NombreEmpresa + "'" + "," + "'" + miempresa.Convenio + "'" + "," + "'" + miempresa.CiudadFirmaCov + "'" + "," + "'" + miempresa.FechaFirmaConv + "'" + "," + "'" + miempresa.Representante + "'" + "," + "'" + miempresa.DNITutorEmp + "'" + "," + "'" + miempresa.EmailtutorEmp + "'" + ")");
	return num;
}
		
public static int InsertCiclo(DatosCiclo miciclo) throws SQLException{
	
	Statement stmt = conexion.createStatement();
    int num = stmt.executeUpdate("INSERT INTO DATOS.CICLO VALUES (" + "'" + miciclo.idciclo + "'" + "," + "'" + miciclo.nombre + "'" + "," + "'" + miciclo.grado + "'" + "," + "'" + miciclo.periodopracticas + "'" + "," + "'" + miciclo.familiaprofesional + "'" + "," + "'" + miciclo.capacidadesterminales + "'" + "," + "'" + miciclo.actividades + "'" + "," + "'" + miciclo.criteriosevaluacion + "'" + ")");
	return num;
}
public static int InsertTutorCentro(DatosTutorCentro mitutor) throws SQLException{
	
	Statement stmt = conexion.createStatement();
    int num = stmt.executeUpdate("INSERT INTO DATOS.TUTORCENTRO VALUES (" + "'" + mitutor.dnitutor + "'" + "," + "'" + mitutor.nombre + "'" + "," + "'" + mitutor.apellidos + "'" + "," + "'" + mitutor.emailtutor + "'" + ")");
	return num;
}
		}

	

