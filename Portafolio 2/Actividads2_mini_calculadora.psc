Proceso Actividad2s2
	//Actividad 2:
	//Solicitar 2 n�meros y operaci�n aritm�tica que quiere 
	//realizar el usuario (+ , - , * , /). Calculadora
	
	//Definir variables
	//Pedir Datos
	//Procesar y mostrar resultados
	
	Definir n1 Como Real;
	Definir n2 Como Real;
	definir operacion como caracter;
	
	Escribir "***MiniCalculadora***";
	Escribir "Ingrese dos n�meros";
	Escribir "Ingrese el primer n�mero";
	Leer n1;
	Escribir "Ingrese el segundo numero";
	Leer n2;
	
	Escribir "Escoja la operaci�n a realizar";
	Escribir "+";
	Escribir "-";
	Escribir "*";
	Escribir "/";
	Leer operacion;
	si operacion = "+" Entonces
		Escribir "El resultado es ", n1 + n2;
	FinSi
	si operacion = "-" Entonces
		Escribir "El resultado es ", n1 - n2;
	FinSi
	si operacion = "*" Entonces
		Escribir "El resultado es ", n1 * n2;
	FinSi
	si operacion = "/" Entonces
		Escribir "El resultado es ", n1 / n2;
		si n2 = 0 Entonces
			Escribir "La Divisi�n no puede realizarse por 0";
			
		FinSi
	FinSi	
	
FinProceso
