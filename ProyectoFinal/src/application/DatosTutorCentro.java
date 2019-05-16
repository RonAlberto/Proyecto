package application;

public class DatosTutorCentro {

	public String dnitutor;
	public String nombre;
	public String apellidos;
	public String emailtutor;

	public DatosTutorCentro(String dnitutor, String nombre, String apellidos, String emailtutor) {
		super();
		this.dnitutor = dnitutor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.emailtutor = emailtutor;
	}

	public String getDnitutor() {
		return dnitutor;
	}

	public void setDnitutor(String dnitutor) {
		this.dnitutor = dnitutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmailtutor() {
		return emailtutor;
	}

	public void setEmailtutor(String emailtutor) {
		this.emailtutor = emailtutor;
	}

}
