// Ejercicio: promediar 3 notas. 
Proceso Promediar_tres_notas
// Definir las variables.
	Definir numero1 Como Real;
	Definir numero2 Como Real;
	Definir numero3 Como Real;
	Definir resultado Como Real;
	// Solicitar información.
	Escribir "Promedie 3 notas";
	// leer el teclado para capturar el numero1.
	Escribir "Ingrese la primera nota";
	Leer numero1;
	// leer el teclado para capturar el numero2.
	Escribir "Ingrese la segunda nota";
	Leer numero2 ;
	// leer el teclado para capturar el numero3.
	Escribir "Ingrese la tercera nota";
	Leer numero3 ;
	// promediar las 3 notas y almacenarlas en resultado.
	resultado <- (numero1 + numero2 + numero3) / 3 ;
	Escribir "El promedio de las 3 notas es: ", resultado;
	
FinProceso
