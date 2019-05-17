package application;

public class DatosAlumno {
	
	public String DNI;
	public String Nombre;
	public String Apellido;
	public String Telefono;
	public int Nota;
	public String CP;
	public String dnitutor;
	public DatosAlumno(String dNI, String nombre, String apellido, String telefono, int nota, String cP,
			String dnitutor) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
		Nota = nota;
		CP = cP;
		this.dnitutor = dnitutor;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public int getNota() {
		return Nota;
	}
	public void setNota(int nota) {
		Nota = nota;
	}
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}
	public String getDnitutor() {
		return dnitutor;
	}
	public void setDnitutor(String dnitutor) {
		this.dnitutor = dnitutor;
	}
	
	
}
	
	
	