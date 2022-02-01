import java.util.Scanner;

public class String_Nombre_Caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Actividad 4: Mostrar el nombre que tiene más caracteres.
		// investigación Que son las colecciónes y algunas diferencias con array
		
   		try (
   	Scanner lectura = new Scanner(System.in)) {
	int cantidad;
	System.out.println("¨¨¨¨¨¨¨¨¨¨ Bienvenido a cuenta letras ¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
	System.out.print("Ingrese la cantidad de nombre: ");                
	cantidad = lectura.nextInt(); // usuario ingresa cantidad de nombres
	
	String nombres[] = new String[cantidad]; // Crea el arreglo con la cantidad
	
	for (int i=0; i<cantidad; i++) //ciclo para Asignar valores al arreglo
	{        
	        System.out.print("ingrese nombre " + (i+1) + ": "); //Mensaje para usuario
	        nombres[i] = lectura.next(); //asignación del nombre según indice actual
	}
		int mayor = 0;
		String nombreMayor = "";
		for (int i = 0; i < nombres.length; i++) //Crea la condición que contara cada casilla
		{
			if(mayor < nombres[i].length()) 
			{
				mayor = nombres[i].length();
				nombreMayor = nombres[i];
				
			}			
		}
		System.out.println("El nombre que tiene más caracteres es: " + nombreMayor + " con " + mayor+ " letras. " );
	}
}
}
