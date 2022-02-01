
public class Vehiculo {

	private float cantCo2;
	private String tipoCombustible;
	private boolean electricOno;
	private int capacidad;
	private String tamaño;
	private String patente;
	
	public Vehiculo() {
		
		this.cantCo2 = 0;
		this.tipoCombustible = "";
		this.electricOno = false;
		this.capacidad = 0;
		this.tamaño = "";
		this.patente = "";
	}
	
	

	public Vehiculo(float cantCo2, String tipoCombustible, boolean electricOno, int capacidad, 
			String tamaño, String patente) {
		super();
		this.cantCo2 = cantCo2;
		this.tipoCombustible = tipoCombustible;
		this.electricOno = electricOno;
		this.capacidad = capacidad;
		this.tamaño = tamaño;
		this.patente = patente;
	}

	public float getCantCo2() {
		return cantCo2;
	}

	public void setCantCo2(float cantCo2) {
		this.cantCo2 = cantCo2;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public boolean isElectricOno() {
		return electricOno;
	}

	public void setElectricOno(boolean electricOno) {
		this.electricOno = electricOno;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	

	
	@Override
	public String toString() {
		return "Vehiculo [cantCo2=" + cantCo2 + ", tipoCombustible=" + tipoCombustible 
				+ ", electricOno=" + electricOno
				+ ", capacidad=" + capacidad + ", tamaño=" + tamaño + "]";
	
	}
	
	public String desCongestiona()
	{
		String descon = this.capacidad + this.tamaño;
		
		return descon;
	}
	
	public String desContamina()
	{
		String desconta = this.cantCo2 + this.tipoCombustible + this.electricOno;
		
		return desconta;
	}
	
	public String optimiza() {
		String pocoContamina = "El vehículo es poco contaminante y eficiente";
		return pocoContamina;
	}
	
	public String mover() {
		
		return "El vehículo se mueve";
	}
	public String frenar() {
		
		return "El vehículo frena";
	}
	public String cargando() {
		
		return "El vehículo está cargando combustible";
	}
	
	public String mostrarDatos() {
		
		String datos = "|===== D A T O S  T R A N S P O R T E   V E H I C U L A R=====| " + // toLowerCase()
				"\nPatente Vehiculo    : " + this.patente.toUpperCase()+ 
				"\nTipo Combustible : " + this.tipoCombustible + 
				"\nCapacidad        : " + this.capacidad +
				"\nTamaño           : " + this.tamaño +
				"\nEmision de CO2   : " + this.cantCo2+
				"\nEléctrico 		: "	+ (this.isElectricOno() ? "si":"no");	
		
		return datos;
	}



	
	
	
}
