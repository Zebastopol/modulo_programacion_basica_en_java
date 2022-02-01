// Ejercicio: promediar 3 notas. 
Proceso Promediar_tres_notas
// Definir las variables.
	Definir nota1 Como Real;
	Definir nota2 Como Real;
	Definir nota3 Como Real;
	Definir suma Como Real;
	Definir promedio Como Real;
	// Solicitar información.
	Escribir "*******Promediar 3 notas*******";
	// leer el teclado para capturar el nota1.
	Escribir "Ingrese la primera nota";
	Leer nota1;
si nota1 <= 7 Entonces
		Escribir "Ingrese la segunda nota" ;
		Leer nota2;
		
si nota2 <= 7 Entonces
	Escribir "Ingrese la tercera nota" ;
	Leer nota3;
si  nota3 <= 7 Entonces
	suma<- nota1 + nota2 + nota3; 
	promedio <- suma / 3 ;
	Escribir "La sumatoria de sus notas es ", suma;
	Escribir "El promedio de sus notas es ", promedio ;
		
SiNo 
	Escribir "Su tercera nota no es válida";
	FinSi
SiNo
	Escribir "Su segunda nota no es válida" ;
	FinSi
SiNo
	Escribir "Su primera nota no es válida" ;
	FinSi

FinProceso
