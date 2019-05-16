package application;

public class DatosCiclo {

	public String idciclo;
	public String nombre;
	public String grado;
	public String periodopracticas;
	public String familiaprofesional;
	public String capacidadesterminales;
	public String actividades;
	public String criteriosevaluacion;

	public DatosCiclo(String idciclo, String nombre, String grado, String periodopracticas, String familiaprofesional,
			String capacidadesterminales, String actividades, String criteriosevaluacion) {
		super();
		this.idciclo = idciclo;
		this.nombre = nombre;
		this.grado = grado;
		this.periodopracticas = periodopracticas;
		this.familiaprofesional = familiaprofesional;
		this.capacidadesterminales = capacidadesterminales;
		this.actividades = actividades;
		this.criteriosevaluacion = criteriosevaluacion;
	}

	public String getIdciclo() {
		return idciclo;
	}

	public void setIdciclo(String idciclo) {
		this.idciclo = idciclo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getPeriodopracticas() {
		return periodopracticas;
	}

	public void setPeriodopracticas(String periodopracticas) {
		this.periodopracticas = periodopracticas;
	}

	public String getFamiliaprofesional() {
		return familiaprofesional;
	}

	public void setFamiliaprofesional(String familiaprofesional) {
		this.familiaprofesional = familiaprofesional;
	}

	public String getCapacidadesterminales() {
		return capacidadesterminales;
	}

	public void setCapacidadesterminales(String capacidadesterminales) {
		this.capacidadesterminales = capacidadesterminales;
	}

	public String getActividades() {
		return actividades;
	}

	public void setActividades(String actividades) {
		this.actividades = actividades;
	}

	public String getCriteriosevaluacion() {
		return criteriosevaluacion;
	}

	public void setCriteriosevaluacion(String criteriosevaluacion) {
		this.criteriosevaluacion = criteriosevaluacion;
	}

}
