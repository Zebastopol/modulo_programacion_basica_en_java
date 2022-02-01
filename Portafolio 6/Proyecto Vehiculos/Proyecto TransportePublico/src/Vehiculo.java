
public class Vehiculo {

	private float cantCo2;
	private String tipoCombustible;
	private boolean electricOno;
	private int capacidad;
	private String tama�o;
	private String patente;
	
	public Vehiculo() {
		
		this.cantCo2 = 0;
		this.tipoCombustible = "";
		this.electricOno = false;
		this.capacidad = 0;
		this.tama�o = "";
		this.patente = "";
	}
	
	

	public Vehiculo(float cantCo2, String tipoCombustible, boolean electricOno, int capacidad, 
			String tama�o, String patente) {
		super();
		this.cantCo2 = cantCo2;
		this.tipoCombustible = tipoCombustible;
		this.electricOno = electricOno;
		this.capacidad = capacidad;
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
				+ ", capacidad=" + capacidad + ", tama�o=" + tama�o + "]";
	
	}
	
	public String desCongestiona()
	{
		String descon = this.capacidad + this.tama�o;
		
		return descon;
	}
	
	public String desContamina()
	{
		String desconta = this.cantCo2 + this.tipoCombustible + this.electricOno;
		
		return desconta;
	}
	
	public String optimiza() {
		String pocoContamina = "El veh�culo es poco contaminante y eficiente";
		return pocoContamina;
	}
	
	public String mover() {
		
		return "El veh�culo se mueve";
	}
	public String frenar() {
		
		return "El veh�culo frena";
	}
	public String cargando() {
		
		return "El veh�culo est� cargando combustible";
	}
	
	public String mostrarDatos() {
		
		String datos = "|===== D A T O S  T R A N S P O R T E   V E H I C U L A R=====| " + // toLowerCase()
				"\nPatente Vehiculo    : " + this.patente.toUpperCase()+ 
				"\nTipo Combustible : " + this.tipoCombustible + 
				"\nCapacidad        : " + this.capacidad +
				"\nTama�o           : " + this.tama�o +
				"\nEmision de CO2   : " + this.cantCo2+
				"\nEl�ctrico 		: "	+ (this.isElectricOno() ? "si":"no");	
		
		return datos;
	}



	
	
	
}
