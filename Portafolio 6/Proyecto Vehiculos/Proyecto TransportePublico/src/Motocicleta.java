
public class Motocicleta extends Vehiculo{
	private int cilindrada;
	private String	uso;
	
	public Motocicleta() {
		
		this.cilindrada = 0;
		this.uso = "";
	}

	public Motocicleta(int cilindrada, String uso, float cantCo2, String tipoCombustible, 
			boolean electricOno, int capacidad, String tama�o, String patente) {
		super(cantCo2, tipoCombustible, electricOno, capacidad, tama�o, patente);
		this.cilindrada = cilindrada;
		this.uso = uso;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public String velocidadTope() {
	
		String vel = "La moto llega a la velocidad m�xima";
		
		if(this.cilindrada == 125)
			vel = "La moto alcanza una velocidad m�xima de 100km/hr";
		if(this.cilindrada== 150)
			vel = "La moto alcanza una velocidad m�xima de 130km/hr";
		if(this.cilindrada >= 200 || this.cilindrada <= 250)
			vel = "La moto alcanza una velocidad m�xima entre 120 a 160Km/hr";
		if(this.cilindrada >=300 && this.cilindrada <= 1000)
			vel= "La moto alcanza una velocidad m�xima entre 200 a 300Km/hr";
		return vel;
	}
	public String mostraDatos() {
		return "|======Datos Motocicleta======| "+ 
				"\nPatente  		  : " + super.getPatente() + 
				"\nCilindrada		  : " + this.cilindrada + 
				"\nPara qu� la ocupa  : " + this.uso +
				"\nTipo Combustible   : " + super.getTipoCombustible() + 
				"\nCapacidad          : " + super.getCapacidad() +
				"\nTama�o             : " + super.getTama�o()  +
				"\nEmision de CO2     : " + super.getCantCo2() +
				"\nEl�ctrico 		  : " + (super.isElectricOno() ? "si":"no");
	}

}
