Proceso CICLOS_Portafolio
	//Actividad Portafolio 5:
	//Crear una calculadora con las operaciones 
	//basicas (/*-+)
	//que mediante un men� se pueda seleccionar,
	//debe haber una opcion de salida.
	//solicitar 2 n�meros
	//Men�: +, -, *, /, Salir (5)
	//opcional validar solo ingrese las opciones del men�
	
	definir num1 Como Real;
	definir num2 Como Real;
	definir resultado Como Real;
	definir opcion como real;
	opcion<-0; 
	
	Mientras opcion <> 5 Hacer 
		Limpiar Pantalla;
		Escribir "**** Men� de Calculadora ****";
		Escribir "Escoja una operaci�n";
		Escribir "1. Sumar *";
		Escribir "2. Restar -";
		Escribir "3. Multiplicar *";
		Escribir "4. Dividir /";
		Escribir "Salir de la aplicaci�n";
		Leer opcion;
	
	escribir "***** MiniCalculadora *****";
	//menu opciones a usuarios
	escribir " Escoja la opcion que desee: ";
	Escribir "1- Sumar";
	escribir "2- Restar";
	escribir "3- Multiplicar";
	Escribir "4- Dividir";
	leer opcion;
	si opcion >=5 Entonces
		repetir
			escribir "OPCION INCORRECTA";
			escribir " Escoja la opcion que desee: ";
			Escribir "1- Sumar";
			escribir "2- Restar";
			escribir "3- Multiplicar";
			Escribir "4- Dividir";
			leer opcion;
			//obtencion de datos
		Hasta Que opcion <= 4
	FinSi
	Escribir "Ingrese primer N�mero: ";
	leer dato1;
	
	Escribir "Ingrese segundo N�mero: ";
	leer dato2;
	//Operaciones Aritmeticas
	Si opcion = 1 Entonces
		resultado <- dato1 + dato2;
		escribir " El resultado es; ", resultado;
	SiNo
		si opcion = 2 Entonces
			resultado <- dato1 - dato2;
			escribir " El resultado es; ", resultado;
		SiNo
			si opcion = 3 Entonces
				resultado <- dato1 * dato2;
				escribir " El resultado es; ", resultado;
			SiNo
				si opcion = 4 Entonces
					si dato2 = 0 Entonces
						Escribir "Esta operacion no se puede realizar." ;
						escribir "***Segundo dato no puede ser 0***";
					sino resultado <- dato1 / dato2;
						escribir " El resultado es; ", resultado;
						
					FinSi
					
				FinSi
			FinSi
		FinSi
	FinSi
	
		
FinProceso
