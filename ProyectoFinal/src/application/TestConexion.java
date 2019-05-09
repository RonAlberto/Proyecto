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

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		new TestConexion();

	}

}
