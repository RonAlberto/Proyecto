package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
	

	public ObservableList<DatosAlumno> ConsultaAlumnos() {
		
		ObservableList<DatosAlumno> aux = FXCollections.observableArrayList();
		

		try {
			Statement stmt = conexion.createStatement();
			String query = "SELECT * FROM BASEDEDATOS.ALUMNO";
			System.out.println(query);
			ResultSet rset = stmt.executeQuery(query);
			while (rset.next()) {
				String DNI  = rset.getString(1);
				String Nombre  = rset.getString(2);
				String Apellido  = rset.getString(3);
				String Telefono  = rset.getString(4);
				int Nota  = rset.getInt(5);
				String CP  = rset.getString(6);
				String dnitutor  = rset.getString(7);
				DatosAlumno auxAlu = new DatosAlumno(DNI, Nombre, Apellido, Telefono, Nota, CP, dnitutor);
				aux.add(auxAlu);
			}
			rset.close();
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return aux;

	}
public ObservableList<DatosEmpresa> ConsultaEmpresa() {
		
		ObservableList<DatosEmpresa> aux = FXCollections.observableArrayList();
		

		try {
			Statement stmt = conexion.createStatement();
			String query = "SELECT * FROM BASEDEDATOS.EMPRESA";
			System.out.println(query);
			ResultSet rset = stmt.executeQuery(query);
			while (rset.next()) {
				String IdEmpresa  = rset.getString(1);
				String NombreEmpresa  = rset.getString(2);
				String Convenio  = rset.getString(3);
				String CiudadFirmaCov  = rset.getString(4);
				String FechaFirmaConv  = rset.getString(5);
				String Representante  = rset.getString(6);
				String DNITutorEmp  = rset.getString(7);
				String EmailtutorEmp  = rset.getString(8);
				DatosEmpresa auxEmp = new DatosEmpresa(IdEmpresa, NombreEmpresa, Convenio, CiudadFirmaCov, FechaFirmaConv, Representante, DNITutorEmp, EmailtutorEmp);
				aux.add(auxEmp);
			}
			rset.close();
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return aux;
}


public ObservableList<DatosCiclo> ConsultaCiclo() {
		
		ObservableList<DatosCiclo> aux = FXCollections.observableArrayList();
		

		try {
			Statement stmt = conexion.createStatement();
			String query = "SELECT * FROM BASEDEDATOS.CICLO";
			System.out.println(query);
			ResultSet rset = stmt.executeQuery(query);
			while (rset.next()) {
				String idciclo  = rset.getString(1);
				String nombre  = rset.getString(2);
				String grado  = rset.getString(3);
				String periodopracticas  = rset.getString(4);
				String familiaprofesional  = rset.getString(5);
				String capacidadesterminales  = rset.getString(6);
				String actividades  = rset.getString(7);
				String criteriosevaluacion  = rset.getString(8);
				DatosCiclo auxCiclo = new DatosCiclo(idciclo, nombre, grado, periodopracticas, familiaprofesional, capacidadesterminales, actividades, criteriosevaluacion);
				aux.add(auxCiclo);
			}
			rset.close();
			stmt.close();

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return aux;

	}
	
public ObservableList<DatosTutorCentro> ConsultaTutorCentro() {
	
	ObservableList<DatosTutorCentro> aux = FXCollections.observableArrayList();
	

	try {
		Statement stmt = conexion.createStatement();
		String query = "SELECT * FROM BASEDEDATOS.TUTORCENTRO";
		System.out.println(query);
		ResultSet rset = stmt.executeQuery(query);
		while (rset.next()) {
			String dnitutor  = rset.getString(1);
			String nombre  = rset.getString(2);
			String apellidos  = rset.getString(3);
			String emailtutor  = rset.getString(4);
			DatosTutorCentro auxTutorCentro = new DatosTutorCentro(dnitutor, nombre, apellidos, emailtutor);
			aux.add(auxTutorCentro);
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
	    int num = stmt.executeUpdate("INSERT INTO BASEDEDATOS.ALUMNO VALUES (" + "'" + mialumno.DNI + "'" + "," + "'" + mialumno.Nombre + "'" + "," + "'" + mialumno.Apellido + "'" + "," + "'" + mialumno.Telefono + "'" + "," + mialumno.Nota + "," + "'" + mialumno.CP + "'" + "," + "'" + mialumno.dnitutor + "'" + ")");
		return num;
}
	
public static int InsertEmpresa(DatosEmpresa miempresa) throws SQLException{
	
	Statement stmt = conexion.createStatement();
    int num = stmt.executeUpdate("INSERT INTO BASEDEDATOS.EMPRESA VALUES (" + "'" + miempresa.IdEmpresa + "'" + "," + "'" + miempresa.NombreEmpresa + "'" + "," + "'" + miempresa.Convenio + "'" + "," + "'" + miempresa.CiudadFirmaCov + "'" + "," + "'" + miempresa.FechaFirmaConv + "'" + "," + "'" + miempresa.Representante + "'" + "," + "'" + miempresa.DNITutorEmp + "'" + "," + "'" + miempresa.EmailtutorEmp + "'" + ")");
	return num;
}
		
public static int InsertCiclo(DatosCiclo miciclo) throws SQLException{
	
	Statement stmt = conexion.createStatement();
    int num = stmt.executeUpdate("INSERT INTO BASEDEDATOS.CICLO VALUES (" + "'" + miciclo.idciclo + "'" + "," + "'" + miciclo.nombre + "'" + "," + "'" + miciclo.grado + "'" + "," + "'" + miciclo.periodopracticas + "'" + "," + "'" + miciclo.familiaprofesional + "'" + "," + "'" + miciclo.capacidadesterminales + "'" + "," + "'" + miciclo.actividades + "'" + "," + "'" + miciclo.criteriosevaluacion + "'" + ")");
	return num;
}
public static int InsertTutorCentro(DatosTutorCentro mitutor) throws SQLException{
	
	Statement stmt = conexion.createStatement();
    int num = stmt.executeUpdate("INSERT INTO BASEDEDATOS.TUTORCENTRO VALUES (" + "'" + mitutor.dnitutor + "'" + "," + "'" + mitutor.nombre + "'" + "," + "'" + mitutor.apellidos + "'" + "," + "'" + mitutor.emailtutor + "'" + ")");
	return num;
}
		}

	

