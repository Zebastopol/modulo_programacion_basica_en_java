
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class TallerTesting 
{
	ArrayList<Vehiculo> vehiculos;
	
	public void Taller()
	{
		vehiculos = new ArrayList<Vehiculo>();
	}
	static Taller taller;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("****** Iniciando pruebas ******");
		taller = new Taller();
	}

	@AfterClass
	public static void AfterClass() {
		System.out.println("****** Termino de las pruebas ******");
		taller = new Taller();
	}
	
	@Test
	public void agregarTest() {
		System.out.println("Iniciando Prueba...");

		Vehiculo vehiculo = new Automovil(5, 50, "GPHB20", "hyundai", "rojo", 50000);
		boolean resultado = taller.agregar(vehiculo);
		assertTrue(resultado);
		
		System.out.println("Prueba Terminada...");
	}
	
	@Test
	public void listarTest() {
		System.out.println("Iniciando Prueba...");

		Vehiculo vehiculo = new Automovil(5, 50, "GPHB20", "hyundai", "rojo", 50000);
		String resultado = taller.listar();
		assertNotNull(resultado);
		
		System.out.println("Prueba Terminada...");
	}
	
	@Test
	public void eliminarTest() {
		System.out.println("Iniciando Prueba...");

		Vehiculo vehiculo = new Automovil(5, 50, "GPHB20", "hyundai", "rojo", 50000);
		boolean resultado = taller.eliminar("GPHB20");
		assertTrue(resultado);
		
		System.out.println("Prueba Terminada...");
	}
}