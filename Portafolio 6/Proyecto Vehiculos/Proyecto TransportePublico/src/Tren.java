
public class Tren extends Vehiculo{
	private String ruta;
	private int capxVagon;
	
	public Tren() {
		
		this.ruta = "";
		this.capxVagon = 0;
	}

	public Tren(String ruta, int capxVagon,float cantCo2, String tipoCombustible, 
			boolean electricOno, int capacidad, 
			String tama�o, String patente) {
		super(cantCo2, tipoCombustible, electricOno, capacidad, tama�o, patente);
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
				"\nPasajeros por vag�n : " + this.capxVagon + 
				"\nItinerario		   : " + this.ruta +
				"\nTipo Combustible    : " + super.getTipoCombustible() + 
				"\nCapacidad           : " + super.getCapacidad() +
				"\nTama�o              : " + super.getTama�o()  +
				"\nEmision de CO2      : " + super.getCantCo2() +
				"\nEl�ctrico 		   : "	+ (super.isElectricOno() ? "si":"no");
	}

}
