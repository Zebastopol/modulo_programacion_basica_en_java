
public class Automovil extends Vehiculo {

	private int cantPuertas;
	private float capMaleta;
	
	public Automovil() {
		this.cantPuertas = 0;
		this.capMaleta = 0;
		
	}
	public Automovil(int cantPuertas, float capMaleta,
			String patente, String marca, String color, int costoServicio ) {
		super(patente, marca, color, costoServicio);
		this.cantPuertas = cantPuertas;
		this.capMaleta = capMaleta;
	}
	public int getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public float getCapMaleta() {
		return capMaleta;
	}
	public void setCapMaleta(float capMaleta) {
		this.capMaleta = capMaleta;
	}
	
	public String mostrarDatos() {
		return "\n$$$$$ Automovil $$$$$ "
				+ "\nPatente: 				" + super.getPatente() 
				+ "\n Marca: 				" + super.getMarca() 
				+ "\nColor: 				" + super.getColor() 
				+ "\nCosto de Servicio:    $" + super.getCostoServicio()
				+ "\nCantidad puertas: 		" + this.cantPuertas
				+ "\nCapacidad Maletero:	" + this.capMaleta;
	}
	
	
	@Override//  Método heredado de la Clase Abstracta
	public int valorIVA() {
		double dsct = IOperacionesTaller.DESCUENTO_AUTOMOVIL;
		int neto = (int)((super.getCostoServicio()) * dsct * IOperacionesTaller.IVA);
		return neto;	
		
	}
	@Override// Método heredado de la Clase Abstracta
	public int obtenerDescuento() {
		double dsct = IOperacionesTaller.DESCUENTO_AUTOMOVIL;
		int neto = (int)((super.getCostoServicio())* dsct);
		return neto;
	}
	@Override//Método Abstracto de la Clase Abstracta
	public int totalApagar(){
		double iva = IOperacionesTaller.IVA; 
		double dsct = IOperacionesTaller.DESCUENTO_AUTOMOVIL;
		int  totalConDscto= (int)((super.getCostoServicio() * dsct));
		int  valorIva= (int)( totalConDscto * iva);
		int total = totalConDscto + valorIva;
		
		return total;
	}
	
}
