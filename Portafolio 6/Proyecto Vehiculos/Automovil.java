
public class Automovil extends Vehiculo{
	private boolean esAutomatico; //true / false
	private int cantidadAirBag;
	

	public Automovil() {
		super(); // invoca al contructor de Vehiculo sin parametros		
		this.esAutomatico = false;
		this.cantidadAirBag = 0;
	}
	
	public Automovil(String patente, String tipoCombustible, 
			String numeroChasis, int ruedas, int capacidadPasajeros, 
			boolean esAutomatico, int cantidadAirBag) {
		super(patente, tipoCombustible, numeroChasis, ruedas, capacidadPasajeros);
		this.esAutomatico = esAutomatico;
		this.cantidadAirBag = cantidadAirBag;

	}

	public boolean isEsAutomatico() {
		return esAutomatico;
	}

	public void setEsAutomatico(boolean esAutomatico) {
		this.esAutomatico = esAutomatico;
	}

	public int getCantidadAirBag() {
		return cantidadAirBag;
	}

	public void setCantidadAirBag(int cantidadAirBag) {
		this.cantidadAirBag = cantidadAirBag;
	}
	// sobre carga // overloading
	
	public String encender() {
		return "El Automovil enciende al girar al llave";
	}
	public String encender(int segundos) {
		return "El Automovil enciende en " + segundos + " segundos";
	}
	public String encender(boolean tieneBoton, boolean usaEmbriague) {
		
		if(!tieneBoton)
			return "error al encender";
		
		if(usaEmbriague)
			return "El Automovil enciende al presionar embriague";
		else
			return "El Automovil enciende al presionar el freno";
	}

	@Override  // sobre escritura
	public String mostrarDatos() {
		return "===== Automóvil =====" + 
				"\nPatente                = " + super.getPatente() + 
				"\nTipo Combustible       = " + super.getTipoCombustible() + 
				"\nNúmero Chasis          = " + super.getNumeroChasis() + 
				"\nRuedad                 = " + super.getRuedas() + 
				"\nCapacidad de Pasajeros = " + super.getCapacidadPasajeros() + 
				"\nes Automatico          = " + (this.isEsAutomatico() ? "Si" : "No")  + // this.esAutomatico 
				"\nCantidad de AirBag     = " + this.getCantidadAirBag();
	}

}
