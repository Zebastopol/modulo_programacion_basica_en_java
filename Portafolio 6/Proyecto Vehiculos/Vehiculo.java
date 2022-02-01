
public class Vehiculo {
	private String patente;
	private String tipoCombustible;
	private String numeroChasis;
	private int ruedas;
	private int capacidadPasajeros;

	public Vehiculo() {
		this.patente = "";
		this.tipoCombustible = "";
		this.numeroChasis = "";
		this.ruedas = 0;
		this.capacidadPasajeros = 0;
	}
	
	
	public Vehiculo(String patente, String tipoCombustible, String numeroChasis, int ruedas, int capacidadPasajeros) {
		this.patente = patente;
		this.tipoCombustible = tipoCombustible;
		this.numeroChasis = numeroChasis;
		this.ruedas = ruedas;
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public String getTipoCombustible() {
		return tipoCombustible;
	}


	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}


	public String getNumeroChasis() {
		return numeroChasis;
	}


	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}


	public int getRuedas() {
		return ruedas;
	}


	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}


	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}


	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	
	public String mover()
	{
		return "El Vehiculo se mueve...";
	}

	public String frenar()
	{		
		return "El Vehiculo esta frenando...";
	}
	
	public String cargarCombustible()
	{
		return "El Vehiculo esta cargando " + this.tipoCombustible;
	}
	
	public String mostrarDatos() {
		return "\n==== Vehiculo ====" + 
				"\npatente           = " + this.patente + 
				"\ntipoCombustible   = " + this.tipoCombustible + 
				"\nnumeroChasis      = " + this.numeroChasis + 
				"\nruedas            = " + this.ruedas + 
				"\ncapacidadPasajeros= " + this.capacidadPasajeros; 
	}
}
