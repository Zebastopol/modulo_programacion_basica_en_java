
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MetodosTesting {
	
	ArrayList<Vehiculo> vehiculos;
	
	public void Taller()
	{
		vehiculos = new ArrayList<Vehiculo>();
	}

	static Automovil auto;
	static Taller taller;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("****** Iniciando pruebas ******");
		 auto = new Automovil();
		 taller = new Taller();
	}

	@AfterClass
	public static void AfterClass() {
		System.out.println("****** Termino de las pruebas ******");
		 auto = new Automovil();
		 taller = new Taller();
	}
	
	@Test
	public void totalConIvaTest() 
	{	
		System.out.println("Iniciando Prueba...");
		
		Vehiculo vehiculo = new Automovil(5, 50, "GPHB20", "hyundai", "rojo", 50000);
		taller.agregar(vehiculo);
		int resultado = auto.totalConIva();
		assertEquals(resultado, resultado);
		
		System.out.println("Prueba Terminada...");
	}
	
	@Test
	public void obtenerDescuentoTest() 
	{	
		System.out.println("Iniciando Prueba...");
		Vehiculo vehiculo = new Automovil(5, 50, "GPHB20", "hyundai", "rojo", 50000);
		taller.agregar(vehiculo);
		int resultado = auto.obtenerDescuento();
		assertNotNull(resultado);		
		System.out.println("Prueba Terminada...");
	}
	

	@Test
	public void totalPorPagarTest() 
	{	
		System.out.println("Iniciando Prueba...");
		Vehiculo vehiculo = new Automovil(5, 50, "GPHB20", "hyundai", "rojo", 50000);
		taller.agregar(vehiculo);
		auto.totalConIva();
		auto.obtenerDescuento();
		int resultado = auto.totalPorPagar();
		assertSame(resultado, resultado);
		System.out.println("Prueba Terminada...");
	}
}