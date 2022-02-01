
public class Tren extends Vehiculo{
	private String ruta;
	private int capxVagon;
	
	public Tren() {
		
		this.ruta = "";
		this.capxVagon = 0;
	}

	public Tren(String ruta, int capxVagon,float cantCo2, String tipoCombustible, 
			boolean electricOno, int capacidad, 
			String tamaño, String patente) {
		super(cantCo2, tipoCombustible, electricOno, capacidad, tamaño, patente);
		this.ruta = ruta;
		this.capxVagon = capacidad;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}


	public int getCapxVagon() {
		return capxVagon;
	}

	public void setCapxVagon(int capxVagon) {
		this.capxVagon = capxVagon;
	}

	public String viajar() {
		String rutas = "Sur " + " Norte "+ " Centro "+" Litoral ";
		
		return rutas;
	}
	
	public String mostraDatos() {
		return "|======Datos Trenes======| "+ 
				"\nPatente  		  : "  + super.getPatente() + 
				"\nPasajeros por vagón : " + this.capxVagon + 
				"\nItinerario		   : " + this.ruta +
				"\nTipo Combustible    : " + super.getTipoCombustible() + 
				"\nCapacidad           : " + super.getCapacidad() +
				"\nTamaño              : " + super.getTamaño()  +
				"\nEmision de CO2      : " + super.getCantCo2() +
				"\nEléctrico 		   : "	+ (super.isElectricOno() ? "si":"no");
	}

}
