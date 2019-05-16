package application;

public class DatosEmpresa {

	public String IdEmpresa;
	public String NombreEmpresa;
	public String Convenio;
	public String CiudadFirmaCov;
	public String FechaFirmaConv;
	public String Representante;
	public String DNITutorEmp;
	public String EmailtutorEmp;

	public DatosEmpresa(String idEmpresa, String nombreEmpresa, String convenio, String ciudadFirmaCov,
			String fechaFirmaConv, String representante, String dNITutorEmp, String emailtutorEmp) {
		super();
		IdEmpresa = idEmpresa;
		NombreEmpresa = nombreEmpresa;
		Convenio = convenio;
		CiudadFirmaCov = ciudadFirmaCov;
		FechaFirmaConv = fechaFirmaConv;
		Representante = representante;
		DNITutorEmp = dNITutorEmp;
		EmailtutorEmp = emailtutorEmp;
	}

	public String getIdEmpresa() {
		return IdEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		IdEmpresa = idEmpresa;
	}

	public String getNombreEmpresa() {
		return NombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}

	public String getConvenio() {
		return Convenio;
	}

	public void setConvenio(String convenio) {
		Convenio = convenio;
	}

	public String getCiudadFirmaCov() {
		return CiudadFirmaCov;
	}

	public void setCiudadFirmaCov(String ciudadFirmaCov) {
		CiudadFirmaCov = ciudadFirmaCov;
	}

	public String getFechaFirmaConv() {
		return FechaFirmaConv;
	}

	public void setFechaFirmaConv(String fechaFirmaConv) {
		FechaFirmaConv = fechaFirmaConv;
	}

	public String getRepresentante() {
		return Representante;
	}

	public void setRepresentante(String representante) {
		Representante = representante;
	}

	public String getDNITutorEmp() {
		return DNITutorEmp;
	}

	public void setDNITutorEmp(String dNITutorEmp) {
		DNITutorEmp = dNITutorEmp;
	}

	public String getEmailtutorEmp() {
		return EmailtutorEmp;
	}

	public void setEmailtutorEmp(String emailtutorEmp) {
		EmailtutorEmp = emailtutorEmp;
	}

}