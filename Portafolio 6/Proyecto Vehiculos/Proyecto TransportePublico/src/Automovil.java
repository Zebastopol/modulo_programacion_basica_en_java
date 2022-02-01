
public class Automovil extends Vehiculo{
	
	private int a�o;
	private	String modelo;
	
	
	public Automovil() {
		super();
		this.a�o = 0;
		this.modelo = "";
	}


	public Automovil(float cantCo2, String tipoCombustible, boolean electricOno, 
			int capacidad, String tama�o, String patente, 
			int a�o, String modelo) {
		super(cantCo2, tipoCombustible , electricOno, capacidad, tama�o, patente);
		this.a�o = a�o;
		this.modelo = modelo;
	}


	public int getA�o() {
		return a�o;
	}


	public void setA�o(int a�o) {
		this.a�o = a�o;
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
					"\nA�o del Autom�vil  : "+ this.a�o + 
					"\nModelo	  		  : " + this.modelo +
					"\nTipo Combustible   : " + super.getTipoCombustible() + 
					"\nCapacidad pasajeros: " + super.getCapacidad() +
					"\nTama�o             : " + super.getTama�o()  +
					"\nEmision de CO2     : " + super.getCantCo2() +
					"\nEl�ctrico 		  : "	+ (super.isElectricOno() ? "si":"no");
		}

	
}


	
