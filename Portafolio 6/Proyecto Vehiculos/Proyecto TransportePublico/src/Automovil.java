
public class Automovil extends Vehiculo{
	
	private int año;
	private	String modelo;
	
	
	public Automovil() {
		super();
		this.año = 0;
		this.modelo = "";
	}


	public Automovil(float cantCo2, String tipoCombustible, boolean electricOno, 
			int capacidad, String tamaño, String patente, 
			int año, String modelo) {
		super(cantCo2, tipoCombustible , electricOno, capacidad, tamaño, patente);
		this.año = año;
		this.modelo = modelo;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public String getTipo() {
		return modelo;
	}


	public void setTipo(String modelo) {
		this.modelo = modelo;
	}
	

		public String mostraDatos() {
			return "|======Datos Automovil======| "+ 
					"\nPatente  		  : "+ super.getPatente() + 
					"\nAño del Automóvil  : "+ this.año + 
					"\nModelo	  		  : " + this.modelo +
					"\nTipo Combustible   : " + super.getTipoCombustible() + 
					"\nCapacidad pasajeros: " + super.getCapacidad() +
					"\nTamaño             : " + super.getTamaño()  +
					"\nEmision de CO2     : " + super.getCantCo2() +
					"\nEléctrico 		  : "	+ (super.isElectricOno() ? "si":"no");
		}

	
}


	
