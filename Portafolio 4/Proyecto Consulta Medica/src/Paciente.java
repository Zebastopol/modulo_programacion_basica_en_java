

public class Paciente {

	// atributos
	private int rut;
	private char dv;
	private String nombre;
	private String apellido;
	private String seguroSalud; // fonasa, isapre1, isapre2, superisapre...
	private String motivoConsulta;
	private String diagnostico;
	private String remedio;
	private String examen;
	

	
	//constructores
	
	public Paciente() {
		this.rut = 0;
		this.dv = ' ';
		this.nombre = "";
		this.apellido = "";
		this.seguroSalud = "";
		this.motivoConsulta = "";
		this.diagnostico = "";
		this.remedio = "";
		this.examen = "";
	}
	public Paciente(int rut, char dv, String nombre, String apellido, String seguroSalud, String motivoConsulta,
			String diagnostico, String remedio, String examen) {
		this.rut = rut;
		this.dv = dv;
		this.nombre = nombre;
		this.apellido = apellido;
		this.seguroSalud = seguroSalud;
		this.motivoConsulta = motivoConsulta;
		this.diagnostico = diagnostico;
		this.remedio = remedio;
		this.examen = examen;
	}
	
	// G & S	
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public char getDv() {
		return dv;
	}
	public void setDv(char dv) {
		this.dv = dv;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSeguroSalud() {
		return seguroSalud;
	}
	public void setSeguroSalud(String seguroSalud) {
		this.seguroSalud = seguroSalud;
	}
	public String getMotivoConsulta() {
		return motivoConsulta;
	}
	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getRemedio() {
		return remedio;
	}
	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}
	public String getExamen() {
		return examen;
	}
	public void setExamen(String examen) {
		this.examen = examen;
	}
	
	// customer
	public String mostrarDatos()
	{
		String datos = "|===== F I C H A  A T E N C I Ó N  M É D I C A =====| " + // toLowerCase()
						"\nNombre paciente    : " + this.nombre.toUpperCase() + " " + this.apellido.toUpperCase() + 
						"\nRut paciente       : " + this.rut + "-" + this.dv + 
						"\nSeguro de salud    : " + this.seguroSalud;
		return datos;
	}
	public String fichaConsulta()
	{
		String datos = "|===== F I C H A  A T E N C I Ó N  M É D I C A =====| " + // toLowerCase()
						"\nNombre paciente    : " + this.nombre.toUpperCase() + " " + this.apellido.toUpperCase() + 
						"\nRut paciente       : " + this.rut + "-" + this.dv + 
						"\nSeguro de salud    : " + this.seguroSalud + 
						"\nMotivo de consulta : " + this.motivoConsulta +
						"\nDiagnóstico        : " + this.diagnostico;
		// trim  = elimina los espacios de los costados
		// length= cuanta los caracteres que contiene un string 
		if(this.remedio.trim().length() > 0)
		{
			datos += "\nRemedio            : " + this.remedio;
			//datos = datos + "\nRemedio            : " + this.remedio;
		}				
		if(this.examen.trim().length() > 0) 		
		{
			datos += "\nExamen            : " + this.examen;
		}	
		return datos; 
	}
	
	
}
