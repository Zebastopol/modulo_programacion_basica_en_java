
public class Motocicleta extends Vehiculo
{
	private int medidaManillar;
	private String estilo;
	private int totalAPagar;
	
	
	
	//Constructores
	public Motocicleta(String patente, String marca, String color, int costoServicio, int medidaManillar,
			String estilo) {
		super(patente, marca, color, costoServicio);
		this.medidaManillar = medidaManillar;
		this.estilo = estilo;
	}

	public Motocicleta() {
		super();
		this.medidaManillar = 0;
		this.estilo = "";
	}

	//Getter y Setter
	public int getMedidaManillar() {
		return medidaManillar;
	}

	public void setMedidaManillar(int medidaManillar) {
		this.medidaManillar = medidaManillar;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	//Metodos custom
	@Override
	public String mostrarDatos() {
		return "==== Motocicleta ==== " +
				"\n patente: "            + super.getPatente() + 
				"\n marca: "              + super.getMarca() + 
				"\n color: "              + super.getColor() +
				"\n costoServicio: "      + super.getCostoServicio() +
				"\n estilo: "             + this.estilo +
				"\n medida manillar: "    + this.medidaManillar;
	}



	public int totalConIva() {
		totalAPagar = (int)(super.getCostoServicio() * IOperaciones.IVA);
		return totalAPagar;
	}

	@Override
	public int obtenerDescuento() { // descuento es sobre precio con iva
		totalAPagar = (int)(this.totalConIva() * IOperaciones.DESCUENTO_MOTOCICLETA);
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