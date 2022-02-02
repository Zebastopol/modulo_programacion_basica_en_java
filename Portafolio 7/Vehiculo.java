

public abstract class Vehiculo implements IOperaciones 
{
	//Atributos
	private String patente;
	private String marca;
	private String color;
	private int costoServicio;
	
	//Constructores
	public Vehiculo(String patente, String marca, String color, int costoServicio) {
		
		this.patente = patente;
		this.marca = marca;
		this.color = color;
		this.costoServicio = costoServicio;
	}
	
	public Vehiculo() {
		
		this.patente = "";
		this.marca = "";
		this.color = "";
		this.costoServicio = 0;
	}
		

	//Getter y  Setter
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

	
	//Metodos custom

	public String mostrarDatos() {
		return "==== Vehiculo ==== " +
				"\n patente: "       + this.patente + 
				"\n marca: "         + this.marca + 
				"\n color: "         + this.color +
				"\n costoServicio: " + this.costoServicio;
	}
	
	public abstract int totalPorPagar();
	
	

}