	Proceso Descuento_Compra
		
		//4.- Crear en PseInt que permita ingresar el valor de una compra y realizar descuentos de acuerdo a las siguientes indicaciones:
		//Si el valor es mayor o igual a $50000, se hace un descuento del 30%.
		//Si el valor es menor de $50000 y mayor o igual a $20000, se descuenta el 20%.
		//Si el monto es menor a $20000 y mayor o igual a $10000, el descuento es del 10%.
		
		Definir valorcompra Como Real;
		Definir descuento Como Real;
		
		definir porcentaje como real;
		definir total Como Entero;
		
		Escribir "Temporada de Descuentos";
		Escribir "Ingresa el valor de tu compra y revisa el descuento asignado";
		
		Escribir "Ingrese el valor total de su compra";
		Leer valorcompra;
		
		Si ( valorcompra >= 50.000 ) Entonces
			descuento<- (valorcompra *0.3);   
			total <- valorcompra -(valorcompra*0.3);
			
			Escribir "El Subtotal de su compra es: ", valorcompra; 
			Escribir "Su descuento es: " ,descuento;
			Escribir "El total de su compra es: ", total;
		FinSi
		
		si ( valorcompra < 50.000 y valorcompra >= 20.000 ) entonces
			descuento <- (compra *0.2);
			Escribir "El Subtotal de su compra es: ", valorcompra;
			Escribir "Su descuento es: " ,descuento;
			Escribir "El total de su compra es: ", total;
			
		FinSi
		
		si ( valorcompra < 20.000 y valorcompra >= 10.000 ) entonces
			descuento <- (compra *0.1);
			Escribir "El Subtotal de su compra es: ", valorcompra;
			Escribir "Su descuento es" ,descuento;
			Escribir "El total de su compra es: ", total;
		FinSi
		
		
FinProceso

