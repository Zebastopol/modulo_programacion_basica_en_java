Proceso Actividad3Semana2PromedioApruebo
	//Actividad: 3 Solicitar 3 Notas, promediar y 
	//mostrar si aprueba o no a aprueba
	//Validar que las notas no superen el 7 (70) ni sean menores
	//que el 1(10)
	//ademas la ponderación de las nota 
	//son 30%, 30% y 40%
	
	Definir Nota1 Como Real;
	Definir Nota2 Como Real;
	Definir Nota3 Como Real;
	Definir Promedio Como Real;
	// Solicitar Notas
	Escribir "Ingrese Primera Nota: ";
	Leer Nota1;
	Si (nota1 =1.0 o nota1 <=7.0) Entonces
		Escribir 'ingrese nota 2';
	SiNo
		Escribir 'la nota no es valida';
	FinSi
	Leer nota2;
	Si (nota2 =1.0 o nota2 <=7.0) Entonces
		Escribir 'ingrese nota 3';
	SiNo
		Escribir 'la nota no es valida';
	FinSi
	Leer nota3;
	
	//Calcular Promedio
	Si (nota3 =1.0 o nota3 <=7.0) Entonces
		
		
		Promedio<-(nota1 *0.3 + nota2 *0.3 + nota3 *0.4) / 3;
		escribir "su nota final es: ", promedio;
		
		si promedio <4.0 entonces
			escribir "usted a reprobado el curso";
		sino
			escribir" usted aprobo el curso ";
			
			
		FinSi
		
	SiNo
		Escribir 'la nota no es valida';
	FinSi
	
	
FinProceso