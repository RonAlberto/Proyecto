package application;

public class DatosVinculacion {
	
	public String nombrealumno;
	public String apellidosalumno;
	public String nombreempresa;
	public String tutorempresa;
	public String fechainiciopracticas;
	public String fechafinpracticas;
	public String horarioentradama;
	public String horariosalidama;
	public String horarioentradatar;
	public String horariosalidatar;
	public DatosVinculacion(String nombrealumno, String apellidosalumno, String nombreempresa, String tutorempresa,
			String fechainiciopracticas, String fechafinpracticas, String horarioentradama, String horariosalidama,
			String horarioentradatar, String horariosalidatar) {
		super();
		this.nombrealumno = nombrealumno;
		this.apellidosalumno = apellidosalumno;
		this.nombreempresa = nombreempresa;
		this.tutorempresa = tutorempresa;
		this.fechainiciopracticas = fechainiciopracticas;
		this.fechafinpracticas = fechafinpracticas;
		this.horarioentradama = horarioentradama;
		this.horariosalidama = horariosalidama;
		this.horarioentradatar = horarioentradatar;
		this.horariosalidatar = horariosalidatar;
	}
	public String getNombrealumno() {
		return nombrealumno;
	}
	public void setNombrealumno(String nombrealumno) {
		this.nombrealumno = nombrealumno;
	}
	public String getApellidosalumno() {
		return apellidosalumno;
	}
	public void setApellidosalumno(String apellidosalumno) {
		this.apellidosalumno = apellidosalumno;
	}
	public String getNombreempresa() {
		return nombreempresa;
	}
	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
	}
	public String getTutorempresa() {
		return tutorempresa;
	}
	public void setTutorempresa(String tutorempresa) {
		this.tutorempresa = tutorempresa;
	}
	public String getFechainiciopracticas() {
		return fechainiciopracticas;
	}
	public void setFechainiciopracticas(String fechainiciopracticas) {
		this.fechainiciopracticas = fechainiciopracticas;
	}
	public String getFechafinpracticas() {
		return fechafinpracticas;
	}
	public void setFechafinpracticas(String fechafinpracticas) {
		this.fechafinpracticas = fechafinpracticas;
	}
	public String getHorarioentradama() {
		return horarioentradama;
	}
	public void setHorarioentradama(String horarioentradama) {
		this.horarioentradama = horarioentradama;
	}
	public String getHorariosalidama() {
		return horariosalidama;
	}
	public void setHorariosalidama(String horariosalidama) {
		this.horariosalidama = horariosalidama;
	}
	public String getHorarioentradatar() {
		return horarioentradatar;
	}
	public void setHorarioentradatar(String horarioentradatar) {
		this.horarioentradatar = horarioentradatar;
	}
	public String getHorariosalidatar() {
		return horariosalidatar;
	}
	public void setHorariosalidatar(String horariosalidatar) {
		this.horariosalidatar = horariosalidatar;
	}
	
	
}
