import java.util.ArrayList;
import java.util.Scanner;
public class Principal {

        public static void main(String[] args) {
                
                //Variables 
                int opcion=0;
                Scanner leerTeclado = new Scanner(System.in);
                
                ArrayList<Paciente> paciente;
                paciente = new ArrayList<Paciente>();
                
                
                        
                while(opcion != 5) { //mientras la variable "opcion" sea distinta de 4,el ciclo se seguira ejecutando. 
                        
                        System.out.println("\n" // intrucciones para el usuario 
                                        +"************************  M E N Ú  *************************"+"\n"
                                        +"                 Ficha consulta médica"+"\n"
                                        +"       Opción (1): Ingreso de datos del paciente."+"\n"
                                        +"       Opción (2): Modificar datos de un paciente"+"\n"
                                        +"       Opción (3): Ingreso de consulta del paciente "+"\n"
                                        +"                   (síntomas, diagnostico, remedios y/o examen."+"\n"
                                        +"       Opcion (4): Mostrar la ficha del paciente."+"\n"
                                        +"       Opcion (5): Salir"+"\n"
                                        +"************************************************************");
                        
                        System.out.print("\n"+"Digite alguna de las opciones del menú: ");
                        opcion = leerTeclado.nextInt();
                        
                        if(opcion < 1 || opcion >5) {      //Si la opcion es menor a 1 y mayor a 4, (fuera de rango del menú). se ejecuta 
                                System.out.print("\n"+"Opcion no válida, Vuelva a intentarlo,"+"\n" // este mensaje de advertencia al usuario
                                               + "presione (c) y enter para continuar: ");
                                leerTeclado.next();
                                continue;                      //------> Con esto me devuelvo al comienzo del ciclo WHILE, o sea el menú.
                        }
                        
                        else { //Si no ocurrió lo del "IF", ocurrira lo del ELSE 
                                
                                
                //-------------------------------------------------------------------------------------------------------                
                                if(opcion==1) {
                                        Paciente agregarPaciente = new Paciente(); // agregue la vaiable 
                                        System.out.println("|*** Ingreso de datos del paciente***|\n");
                                        System.out.print("Ingrese el RUT sin digito verificador :");
                                        agregarPaciente.setRut(leerTeclado.nextInt());

                                        //Con esto se revisa si el RUT del paciente  esta repetido en el ArrayList.
                                        for (Paciente aux : paciente) { 
                                                if (agregarPaciente.getRut()== aux.getRut()) {//------> Si ingresa al "if" y esta repetido, se ejecuta el metodo para 
                                                        System.out.println("\n"+"Rut de paciente ya ingresado");        
                                                        System.out.println(aux.mostrarDatos());      // mostrar los datos.
                                                        System.out.print("Precione (c) para continuar y enter ");
                                                        leerTeclado.next();        
                                                        System.out.print("Ingrese el RUT sin digito verificador :");
                                                        agregarPaciente.setRut(leerTeclado.nextInt());
                                                        continue;
                                                }
                                        }
                                        System.out.print("Digito verificador                    :");
                                        agregarPaciente.setDv(leerTeclado.next().charAt(0));
                                        while(agregarPaciente.verificarRut()!=true) {//------> Se verifica que el RUT este correcto.
                                                System.out.println("RUT no es valido, vuelva a ingresarlo.");
                                                System.out.println("Ingrese el RUT sin digito verificador : ");
                                                agregarPaciente.setRut(leerTeclado.nextInt());
                                                System.out.println("Digito verificador                    :");
                                                agregarPaciente.setDv(leerTeclado.next().charAt(0));                        
                                        }        
                                        System.out.println("Primer nombre                         :");
                                        agregarPaciente.setNombre(leerTeclado.next());
                                        System.out.println("Primer apellido                      :");
                                        agregarPaciente.setApellido(leerTeclado.next());
                                        System.out.print("Escriba su previsión de salud"+"\n"
                                                               + "+(FONASA) "+"\n"
                                                               + "+(ISAPRE)"+"\n"
                                                               + "Respuesta                             :");
                                        agregarPaciente.setSeguroSalud(leerTeclado.next().toUpperCase());        
                                        
                                        while(agregarPaciente.getSeguroSalud().equals("FONASA") == false && 
                                                agregarPaciente.getSeguroSalud().equals("ISAPRE") == false) {
                                                System.out.print("Error, ingrese una de las 2 opciones :");
                                                agregarPaciente.setSeguroSalud(leerTeclado.next().toUpperCase());
                                        }                                        
                                        if((agregarPaciente.getSeguroSalud().equals("ISAPRE"))==true) {
                                                System.out.print("Digete su Isapre                    :"+"\n"
                                                                       + "+(ISAPRE1) "+"\n"
                                                                       + "+(ISAPRE2)"+"\n"
                                                                       + "+(MASISAPRE)"+"\n"
                                                                       + "+(SUPERISAPRE)"+"\n"
                                                                       + "Respuesta : ");
                                                agregarPaciente.setSeguroSalud(leerTeclado.next().toUpperCase());
                                                while(((agregarPaciente.getSeguroSalud().equals("ISAPRE1")== false) && 
                                                        (agregarPaciente.getSeguroSalud().equals("ISAPRE2")==false)) &&
                                                        ((agregarPaciente.getSeguroSalud().equals("MASISAPRE")==false) &&
                                                        (agregarPaciente.getSeguroSalud().equals("SUPERISAPRE")==false)) ) {
                                                        System.out.print("Error, ingrese su ISAPRE correcta :");
                                                        agregarPaciente.setSeguroSalud(leerTeclado.next().toUpperCase());
                                                }                                                                
                                        }
                                        paciente.add(agregarPaciente);//En esta linea guardo todos los datos del paciente en arrayList (colección) "paciente"
                                        System.out.println("Datos ingresados correctamente");
                                        System.out.print("Presione (c) para continuar y enter: ");
                                        leerTeclado.next();                                                        
                                }
        //------------------------------------------------------------------------------------------------        
                                
        //                        
                                else if(opcion==2) {
                                        System.out.print("**Modificar datos de un paciente**\n");
                                        System.out.print("Ingrese el rut para la busqueda :");
                                        int rutpaciente = leerTeclado.nextInt();
                                        for (Paciente aux : paciente) {         
                                                if (rutpaciente== aux.getRut()) {//------> Si ingresa al "if" y esta repetido, se ejecuta el metodo para 
                                                        System.out.println(aux.fichaConsulta()); 
                                                        while(opcion != 8) {
                                                                System.out.print("\n"+"¿Qué dato desea modificar:"+"\n"+
                                                                         "(1) Nombre\n"+
                                                                         "(2) Apellido\n"+
                                                                         "(3) Seguro de Salud\n"+
                                                                         "(4) Motivo de la consulta\n"+
                                                                         "(5) Diagnostico\n"+
                                                                         "(6) Remedio recetados\n"+
                                                                         "(7) Examen solicitado\n"+
                                                                         "(8) Volver al menú principal"+"\n"+
                                                                         "Respuesta :");
                                                                opcion = leerTeclado.nextInt();
                                                                if(opcion < 1 || opcion >8) {      //Si la opcion es menor a 1 y mayor a 8, (fuera de rango del menú). se ejecuta 
                                                                        System.out.print("\n"+"Opcion no válida, Vuelva a intentarlo,"+"\n" // este mensaje de advertencia al usuario
                                                                                       + "presione (c) y enter para continuar: ");
                                                                        leerTeclado.next();
                                                                        continue;  
                                                                }
                                                                else if(opcion == 1) {
                                                                        System.out.print("\n"+"Ingrese nombre del paciente :");
                                                                        aux.setNombre(leerTeclado.next());
                                                                        System.out.println("Nombre ingresado correctamente");
                                                                        System.out.print("Presione (c) para continuar y enter: ");
                                                                        leerTeclado.next();
                                                                }
                                                                else if(opcion == 2) {
                                                                        System.out.print("\n"+"Ingrese apellido del paciente :");
                                                                        aux.setApellido(leerTeclado.next());
                                                                        System.out.println("Apellido ingresado correctamente");
                                                                        System.out.print("Presione (c) para continuar y enter: ");
                                                                        leerTeclado.next();
                                                                }
                                                                else if(opcion == 3) {
                                                                        System.out.print("\n"+"Ingrese seguro de salud del paciente :");
                                                                        System.out.print("+ FONASA" + "\n" +
                                                                                         "+ ISAPRE" + "\n" +
                                                                                                 "Respuesta :");
                                                                        aux.setSeguroSalud(leerTeclado.next().toUpperCase());
                                                                        
                                                                        while(aux.getSeguroSalud().equals("FONASA") == false && 
                                                                                        aux.getSeguroSalud().equals("ISAPRE") == false) {
                                                                                        System.out.print("Error, ingrese una de las 2 opciones :");
                                                                                        aux.setSeguroSalud(leerTeclado.next().toUpperCase());
                                                                        }
                                                                        if((aux.getSeguroSalud().equals("ISAPRE"))==true) {
                                                                                System.out.print("\n"+"Digete su Isapre:"+"\n"
                                                                                                       + "+(ISAPRE1) "+"\n"
                                                                                                       + "+(ISAPRE2)"+"\n"
                                                                                                       + "+(MASISAPRE)"+"\n"
                                                                                                       + "+(SUPERISAPRE)"+"\n"
                                                                                                       + "Respuesta : ");
                                                                                aux.setSeguroSalud(leerTeclado.next().toUpperCase());
                                                                                while(((aux.getSeguroSalud().equals("ISAPRE1")== false) && 
                                                                                        (aux.getSeguroSalud().equals("ISAPRE2")==false)) &&
                                                                                        ((aux.getSeguroSalud().equals("MASISAPRE")==false) &&
                                                                                        (aux.getSeguroSalud().equals("SUPERISAPRE")==false)) ) {
                                                                                        System.out.print("Error, ingrese su ISAPRE correcta :");
                                                                                        aux.setSeguroSalud(leerTeclado.next().toUpperCase());
                                                                                }                                                                
                                                                        }
                                                                        System.out.println("Seguro de salud ingresado correctamente");
                                                                        System.out.print("Presione (c) para continuar y enter: ");
                                                                        leerTeclado.next();
                                                                }
                                                                else if(opcion == 4) {
                                                                        System.out.print("\n"+"Motivo de la consulta del paciente :");
                                                                        aux.setMotivoConsulta(leerTeclado.next());
                                                                        System.out.println("Motivo de la consulta, ingresado correctamente");
                                                                        System.out.print("Presione (c) para continuar y enter: ");
                                                                        leerTeclado.next();
                                                                }
                                                                else if(opcion == 5) {
                                                                        System.out.print("\n"+"Diagnostico del paciente :");
                                                                        aux.setDiagnostico(leerTeclado.next());
                                                                        System.out.println("Diagnostico del paciente, ingresado correctamente");
                                                                        System.out.print("Presione (c) para continuar y enter: ");
                                                                        leerTeclado.next();
                                                                }
                                                                else if(opcion == 6) {
                                                                        System.out.print("\n"+"Remedios recetados al paciente :");
                                                                        aux.setRemedio(leerTeclado.next());
                                                                        System.out.println("Remedios del paciente, ingresado correctamente");
                                                                        System.out.print("Presione (c) para continuar y enter: ");
                                                                        leerTeclado.next();
                                                                }
                                                                else if(opcion == 7) {
                                                                        System.out.print("\n"+"Examenes solicitados al paciente :");
                                                                        aux.setExamen(leerTeclado.next());
                                                                        System.out.println("Examen, ingresado correctamente");
                                                                        System.out.print("Presione (c) para continuar y enter: ");
                                                                        leerTeclado.next();
                                                                }
                                                        }//Cierre de While modificador
                                                }//Cierre del if de búsqueda
                                        }//Cierre del for para modificar
                                        
										//paciente.add(agregarPaciente);
                                }        
        //--------------------------------------------------------------------------------------------------                        
                                else if(opcion == 3)
                                {
                                	    System.out.print("**Motivo de la Consulta**\n");
                                		System.out.print("Ingrese el rut del paciente sin dígito verificador:");
                                        int rutpaciente = leerTeclado.nextInt();
                                        for (Paciente aux : paciente) {         
                                                if (rutpaciente== aux.getRut()) {
                                                        System.out.print("\n"+"Ingrese el motivo de la consulta del paciente :\n");
                                                        aux.setMotivoConsulta(leerTeclado.next());
                                                        System.out.print("\n"+"Ingrese diagnostico del paciente :\n");
                                                        aux.setDiagnostico(leerTeclado.next());
                                                        System.out.print("\n"+"Ingrese remedio(s) recetado(s) :\n");
                                                        aux.setRemedio(leerTeclado.next());
                                                        System.out.print("\n"+"Ingrese examen(es) solicitado(s) :\n");
                                                        aux.setExamen(leerTeclado.next());
                                                        System.out.print("\n"+"Datos ingresados correctamente");
                                                        System.out.print("Presione (c) para continuar y enter: ");
                                                        leerTeclado.next();        
                                                        continue;
                                                }
                                                else if(rutpaciente != aux.getRut()) {
                                                        System.out.print("No existe rut ingresado ");
                                                        continue;
                                                }
                                        }
                                        
                                }
                                
        //-------------------------------------------------------------------------------------------------------------------------------------                        
                
                                else if(opcion == 4) {
                                        System.out.print("\n"+"Ingrese el rut del paciente sin dígito verificador: \n");
                                        int rutpaciente = leerTeclado.nextInt();
                                        for (Paciente aux : paciente) { 
                                                if (rutpaciente== aux.getRut()) {
                                                        System.out.println(aux.fichaConsulta());
                                                }
                                                
                                        }                
                                }
                                                
                        }                
                }
        }
}

