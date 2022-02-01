


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Taller taller = new Taller();
			
		Automovil auto1 = new Automovil(4,25,"kk44z","Hyundai","azul",180000);
		Automovil auto2 = new Automovil(6,180,"hjf666","Chery","rojo",250000);
		Motocicleta moto1 = new Motocicleta("deportiva",150,"svyt63","Suzuki","negra",75000);
		
		System.out.println("\n|===== PROYECTO DE REGISTRO TALLER MECÁNICO ===== |");
		taller.agregar(auto1);
		taller.agregar(auto2);
		taller.agregar(moto1);
		System.out.println(taller.listar());
		System.out.println("\n"+ taller.contar());
		
		System.out.println("\n|--------TOTALES POR TIPO VEHÍCULO-----------|");

		for(Vehiculo aux: taller.getVehiculos())
		{
			
				
			if(aux instanceof Automovil)
			{	

				System.out.println("\nPatente de Automovil:  "  + aux.getPatente()); 
				System.out.println("Valor Descuento		:  $" + aux.obtenerDescuentoAuto());
				System.out.println("Descuento Aplicado	:  $" + aux.obtenerDescuento());
				System.out.println("Valor IVA           :  $" + aux.valorIVA());
				

			}
			else
			{
				System.out.println("\nPatente de Motocicleta:  "  + aux.getPatente()); 
				System.out.println("Valor Descuento		:  $" + aux.obtenerDescuentoMoto());
				System.out.println("Descuento Aplicado	:  $" + aux.obtenerDescuento());
				System.out.println("Valor IVA           :  $" + aux.valorIVA());
				
			}
			if(aux.getPatente().equalsIgnoreCase(aux.getPatente()))
			{
				System.out.println("\nTOTAL para patente:  "+ aux.getPatente() 
				+ " es:  $" + aux.totalApagar());
			}
			
		}
		
			taller.eliminar(auto1);
			System.out.println("\n"+ taller.contar());	
			
		
		
		
		
		
	}
}