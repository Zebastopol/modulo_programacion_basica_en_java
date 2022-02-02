public class Automovil extends Vehiculo
{
	private int cantidadPuertas;
	private int capacidadMaletero;
	private int totalAPagar;
	
	
	//Constructores
	public Automovil() {
		super();
		this.cantidadPuertas = 0;
		this.capacidadMaletero = 0;
	}
	
	public Automovil(int cantidadPuertas, int capacidadMaletero, String patente, 
			        String marca, String color, int costoServicio) {
		super(patente, marca, color, costoServicio);
		this.cantidadPuertas = cantidadPuertas;
		this.capacidadMaletero = capacidadMaletero;
	}

	//Getter y Setter
	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(int capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	
		
	
	//Metodos custom
	@Override
	public String mostrarDatos() {
		return "==== Automovil ==== " +
				"\n patente: "            + super.getPatente() + 
				"\n marca: "              + super.getMarca() + 
				"\n color: "              + super.getColor() +
				"\n costoServicio: "      + super.getCostoServicio() +
				"\n capacidad Maletero: " + this.capacidadMaletero +
				"\n cantidadPuertas: "    + this.cantidadPuertas;
	}
	
	@Override
	public int totalConIva() {
		totalAPagar = (int)(super.getCostoServicio() * IOperaciones.IVA);
		return totalAPagar;
	}

	@Override
	public int obtenerDescuento() { // descuento es sobre precio con iva
		totalAPagar = (int)(this.totalConIva() * IOperaciones.DESCUENTO_AUTOMOVIL);
		return totalAPagar;
	}
	public int obtenerDescuento(double descuento) {
		totalAPagar = (int)(this.totalConIva() * descuento);
		return totalAPagar;
	}

	@Override
	public int totalPorPagar() {
		totalAPagar = (int)(this.totalConIva() + (this.obtenerDescuento()));
		return totalAPagar;
	}



}