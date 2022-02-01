
public class Motocicleta extends Vehiculo {
	//Atributos
		private int medidaManillar;
		private String estilo;


		//Constructores
		public Motocicleta(String patente, String tipoCombustible, String numeroChasis, int ruedas, int capacidadPasajeros,
			int medidaManillar, String estilo) {
			super(patente, tipoCombustible, numeroChasis, ruedas, capacidadPasajeros);
			this.medidaManillar = medidaManillar;
			this.estilo = estilo;
		}

		public Motocicleta() {
		super();
		this.medidaManillar = 0;
		this.estilo = "";
		}

		//Getter y setter
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
		
		public String accionarManeta()
		{
			return "Maneta accionada";
		}
		
		@Override //Sobre escritura
		public String mostrarDatos() {
			return " ==== Motocicleta ==== " +
			"\n Patente                = " + super.getPatente() +
			"\n Tipo de Combustible    = " + super.getTipoCombustible() +
			"\n Numero de Chasis       = " + super.getNumeroChasis() +
			"\n Ruedas                 = " + super.getRuedas() +
			"\n Capacidad de Pasajeros = " + super.getCapacidadPasajeros() +
			"\n Medida Manillar        = " + this.getMedidaManillar() + // this.esAutomatico
			"\n Estilo                 = " + this.getEstilo();
		}
}
