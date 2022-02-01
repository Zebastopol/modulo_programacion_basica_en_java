
public abstract class Vehiculo implements IOperacionesTaller{

	private String patente;
	private String marca;
	private String color;
	private int costoServicio;
	
	public Vehiculo() {
		
		this.patente = "";
		this.marca = "";
		this.color = "";
		this.costoServicio = 0;
	}
	
	public Vehiculo(String patente, String marca, String color, int costoServicio) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.color = color;
		this.costoServicio = costoServicio;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCostoServicio() {
		return costoServicio;
	}

	public void setCostoServicio(int costoServicio) {
		this.costoServicio = costoServicio;
	}
	
		
	public String mostrarDatos() {
		return "\n$$$$$ Vehiculo $$$$$ "
				+ "/nPatente: 			" + patente 
				+ "/n Marca: 			" + marca 
				+ "/nColor: 			" + color 
				+ "/nCosto de Servicio: " + costoServicio;
	}

	public abstract int totalApagar();
	
	public int valorIVA() {
		double dsct = 0;
		int neto = (int)((this.costoServicio) * dsct * IOperacionesTaller.IVA);
		return neto;
	}
	
	public int obtenerDescuento() {
		double dsct = 0;
		int neto = (int)((this.costoServicio)* dsct);
		return neto;
	}
	
	public int obtenerDescuentoAuto() {
		// TODO Auto-generated method stub
		return (int)(this.getCostoServicio() * 0.05) ;
	}
	
	public int obtenerDescuentoMoto() {
		// TODO Auto-generated method stub
		return (int)(this.getCostoServicio() * 0.1) ;
	}
}
