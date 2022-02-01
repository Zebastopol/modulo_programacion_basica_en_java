
public class Motocicleta extends Vehiculo {

	private String estilo;
	private int  cilindrada;
	
	public Motocicleta() {

		this.estilo = "";
		this.cilindrada = 0;
	
	}
	public Motocicleta(String estilo, int cilindrada, 
			String patente, String marca, String color, int costoServicio) {
		super(patente, marca, color, costoServicio);
		this.estilo = estilo;
		this.cilindrada = cilindrada;
		
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	public String mostrarDatos() {
		return "\n$$$$$ Motocicleta $$$$$ "
				+ "\nPatente: 				 " + super.getPatente() 
				+ "\n Marca: 				 " + super.getMarca() 
				+ "\nColor: 				 " + super.getColor() 
				+ "\nCosto de Servicio:		$" + super.getCostoServicio()
				+ "\nCilindrada: 			 " + this.cilindrada
				+ "\nEstilo: 				 " + this.estilo;
	}
	
	@Override
	public int valorIVA() {
		double dsct = IOperacionesTaller.DESCUENTO_MOTOCICLETA;
		int neto = (int)((super.getCostoServicio()) * dsct * IOperacionesTaller.IVA);
		return neto;	
		
	}
	@Override
	public int obtenerDescuento() {
		double dsct = IOperacionesTaller.DESCUENTO_MOTOCICLETA;
		int neto = (int)((super.getCostoServicio())* dsct);
		return neto;
		
	}
	@Override
	public int totalApagar() {
		double iva = IVA; 
		double dsct = DESCUENTO_MOTOCICLETA;
		int  totalConDscto= (int)((super.getCostoServicio() * dsct));
		int  valorIva= (int)( totalConDscto * iva);
		int total = totalConDscto + valorIva;
		
		return total;
	}
	
	
}
