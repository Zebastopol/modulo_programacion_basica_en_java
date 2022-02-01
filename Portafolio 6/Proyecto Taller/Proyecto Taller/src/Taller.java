import java.util.ArrayList;


public class Taller {

	private	ArrayList<Vehiculo> vehiculos;

	public Taller() {
		
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	
	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
	public boolean agregar(Vehiculo vehiculo)
	{
		for(Vehiculo aux : vehiculos)
		{	if(aux.getPatente().equalsIgnoreCase(vehiculo.getPatente()))
			return false; //Ya está agregado es falso que hay que agregar
			
		}		
		vehiculos.add(vehiculo);
		return true; //Sí no está agregado se agrega y es verdadero porque hay que agregarlo
		
	}
	public String listar()
	{
		String datos = "";
		for(Vehiculo aux : vehiculos)
		{
			datos += "\n" + aux.mostrarDatos(); // Acumulador
		}
		return datos;
	}
	public String contar()
	{
		int auto = 0;
		int moto = 0;
		for(Vehiculo aux : vehiculos)
		{
			if(aux instanceof Automovil)
				auto++;	// Contador
			else
				moto++; // Contador
		}
		return "Existen:\n" + auto + " automoviles y " + moto + " motocicletas";
	}
	
	public boolean eliminar(Vehiculo vehiculo)
	{
		for(Vehiculo aux: vehiculos)
		{
			if(aux.getPatente().equalsIgnoreCase(vehiculo.getPatente()))
			{
				vehiculos.remove(aux);
				return true;
			}
		}
				return false;
	}
	
	
}	