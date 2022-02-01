import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		
		Vehiculo vehiculo1 = new Automovil("af3015", "Petróleo", "a12312",4, 5,false, 4);
		System.out.println(vehiculo1.mostrarDatos());
		
		Vehiculo vehiculo2 = new Tren("t800","electrico","aer097",12, 100,5,"pasajeros");
		System.out.println(vehiculo2.mostrarDatos());
		Vehiculo vehiculo3 = new Motocicleta("car12313","bencina","r11234",2,2,50,"chopera");
		System.out.println(vehiculo3.mostrarDatos());

		//vehiculo.
		//Automovil automovil = new Vehiculo(); // no es soportado
		//Tren automovilTren = new Vehiculo();
		// da error pq no es un tren y no tiene definido el metodo
		//System.out.println(vehiculo2.cambiarCarril());
		Tren trenNos = (Tren)vehiculo2;
		System.out.println(trenNos.cambiarCarril());

		// actividad: como resolver este problema???
		
		// se debe convertir en automóvil para acceder al método encender
		Automovil auto = (Automovil)vehiculo1;
		System.out.println(auto.encender(10));
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(trenNos);
		vehiculos.add(auto);
		vehiculos.add(vehiculo3);
		
		for(Vehiculo aux: vehiculos)
		{
			System.out.println(aux.getPatente());
			System.out.println(aux.mostrarDatos());
			if(aux instanceof Tren)
			{
				System.out.println( ((Tren)aux).cambiarCarril());
			}
			else if(aux instanceof Automovil)
			{
				System.out.println(((Automovil)aux).encender(true, false));
			}	
			else if(aux instanceof Motocicleta)
			{
				System.out.println(((Motocicleta)aux).accionarManeta());
			}	
		}
		
	}

}