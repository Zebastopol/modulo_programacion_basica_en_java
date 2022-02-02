
public class Principal {

	public static void main(String[] args)
	{
		Taller taller = new Taller();
		Automovil auto = new  Automovil(5, 50, "GPHB20", "hyundai", "rojo", 50000);
		Automovil auto2 = new Automovil(4, 20, "RJTX90" , "BMW", "negro", 100000);
		Motocicleta moto = new Motocicleta("af3010", "honda", "verde",20000, 5,"naked");
		
		taller.agregar(auto);
		taller.agregar(auto2);
		taller.agregar(moto);
		//auto.obtenerDescuento(); // uso de sobrecarga. agregar descuento manual
		
		//System.out.println(taller.contabilizar());
		//System.out.println(auto.totalPorPagar());
		//System.out.println(auto2.totalPorPagar());
		//System.out.println(moto.totalPorPagar());
		
		//Total a pagar por patente
		for(Vehiculo aux: taller.vehiculos)
		{
			System.out.println("Patente Vehículo: " + aux.getPatente());
			//System.out.println(aux.mostrarDatos());
			if(aux instanceof Automovil)
			{
				System.out.println("Total a pagar: " +  aux.totalPorPagar());
			}
			else if(aux instanceof Motocicleta)
			{
				System.out.println("Total a pagar: " +  aux.totalPorPagar());
			}
		}
		
		//Listar todos los vehiculos
		for (Vehiculo aux : taller.vehiculos) 
		{
			System.out.println("===== Listado de Vehículos =====");
			System.out.println(aux.mostrarDatos());
		}
		
		//Totales por cada vehiculo
		for(Vehiculo aux: taller.vehiculos)
		{
			
			if(aux instanceof Automovil)
			{
				System.out.println("Patente: " + aux.getPatente());
				System.out.println("Costo servicio: " + aux.getCostoServicio());
				System.out.println("Descuento obtenido: " + aux.obtenerDescuento());
				System.out.println("Total con IVA: " + aux.totalConIva());				
				System.out.println("Total a pagar: " +  aux.totalPorPagar());
			}
			else if(aux instanceof Motocicleta)
			{				
				System.out.println("Patente: " + aux.getPatente());
				System.out.println("Costo servicio: " + aux.getCostoServicio());
				System.out.println("Descuento obtenido: " + aux.obtenerDescuento());
				System.out.println("Total con IVA: " + aux.totalConIva());				
				System.out.println("Total a pagar: " +  aux.totalPorPagar());
			}
		}
		
		System.out.println(taller.contabilizar());
		taller.eliminar("RJTX90");
		System.out.println(taller.listar());
		System.out.println(taller.contabilizar());
		
	}

}