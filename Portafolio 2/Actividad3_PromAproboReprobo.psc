Proceso Promediador_aprueba_reprueba
	Definir nota1,nota2,nota3 Como Real;
	Definir promedio Como Real;
	Definir resultado Como Caracter;
	definir porcentaje como real;
	definir total Como Entero;
	Escribir 'promedio de notas';
	Escribir 'ingrese nota 1';
	Leer nota1;
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
	
	
	Si (nota3 =1.0 o nota3 <=7.0) Entonces
		
		//promedio <- (nota1+nota2+nota3)/3;
		promedio<-(nota1 *0.3 + nota2 *0.3 + nota3 *0.4);
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