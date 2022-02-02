import java.util.ArrayList;

public class Taller 
{
	//Vehiculo vehiculo = new Automovil(5, 50, "GPHB20", "hyundai", "rojo", 50000);
	//Vehiculo vehiculo2 = new Motocicleta("af3010", "honda", "verde",20000, 5,"naked");
	
	
	//Automovil auto = (Automovil) vehiculo;
	//Motocicleta moto = (Motocicleta)vehiculo2;		
	
		ArrayList<Vehiculo> vehiculos;
	
		public Taller()
		{
			vehiculos = new ArrayList<Vehiculo>();
		}
		
		//Agregar Vehiculo
		
		public boolean agregar(Vehiculo vehiculo)
		{
			for(Vehiculo aux: vehiculos)
			{
				if(aux.getPatente().equalsIgnoreCase(vehiculo.getPatente()))
					return false; 		
			}
			vehiculos.add(vehiculo);
			return true; 
		}
		
		//Listado de vehiculos
		public String listar()
		{
			String datos = "";
			for(Vehiculo aux: vehiculos)
			{
				datos += "\n" + aux.mostrarDatos(); 
			}
			return datos;
		}
		
		//Conteo
		public String contabilizar()
		{
			int auto = 0;
			int moto = 0;
			for(Vehiculo aux: vehiculos)
			{
				if(aux instanceof Automovil)
					auto++;
				else 
					moto++; 
			}
			return "Existen:\n" + auto + " automóviles y " + moto + " motocicletas";
		}
		
		public boolean eliminar(String patente) 
		{
			for(Vehiculo aux: vehiculos)
			{
				if(aux.getPatente().equalsIgnoreCase(patente)) 
				{
					vehiculos.remove(aux);
					return true; 		
				}						
			}
			return false;
		}
}