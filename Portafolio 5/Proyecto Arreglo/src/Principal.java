import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Clase 10/01/2022 - Arreglo y Colecciones
		
		// Un Arreglo es un �ndice
		
		//actividad: solicitar 5 numeros y guardarlos en un arreglo
				//luego sumar todos los valores, mostrar el total de la suma y
		//promediarlos (mostrar promedio)
		
	
		
		  int []numeros = new int[5];
		  int total; 
		  
		try (Scanner leerTeclado = new Scanner(System.in)) {
			System.out.println("Ingrese 5 n�meros, para un arreglo");
			
			System.out.println("Ingrese el primer n�mero");
			numeros[0] = leerTeclado.nextInt(); 
			/*
			 *
			 */
			System.out.println("Ingrese el 2do n�mero");
			numeros[1] = leerTeclado.nextInt();
			/*
			 * 
			 */
			System.out.println("Ingrese el 3er n�mero");
			numeros[2] = leerTeclado.nextInt();			/*
			 * 
			 */
			System.out.println("Ingrese el 4to n�mero");
			numeros[3] = leerTeclado.nextInt();
			/*
			 * 
			 */
			System.out.println("Ingrese el 5to n�mero");
			numeros[4] = leerTeclado.nextInt(); 			/*
			 *
			 */
			
			
		}
		
		total = numeros[0] + numeros[1]+ numeros[2]+ numeros[3] +numeros[4]; 
			System.out.println("La suma Total es: " + total);
		System.out.println("El promedio es: "+ total/5);
			
		 
		
		
		
		
	}

}
