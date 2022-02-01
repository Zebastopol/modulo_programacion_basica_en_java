import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner leerTeclado = new Scanner(System.in)) {
			int opcion = 0; //para escoger las opciones del menú
			ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
			Paciente paciente = new Paciente();
			paciente.fichaConsulta();
			int rut = 0;
			
			while(opcion !=4)
			{
					System.out.println("| ===== M e n ú ====== |");
					System.out.println("1.- Registro de datos del paciente. ");
					System.out.println("2.- Registro de Consulta. ");
					System.out.println("3.- Mostrar datos. ");
					System.out.println("4.- Salir. ");
					
				if(opcion < 1 || opcion > 4)
				{
					System.out.println("Opción no válida, vuelva a ingresar. ");
					System.out.println("Precione una tecla para continuar y enter. ");
					leerTeclado.next();
					continue;
				}
				if(opcion == 1)
				{
					System.out.println("/n");
					System.out.println("|*** Ingreso de nuevo Paciente***|");
					System.out.println("Nombre: ");
					paciente.setNombre(leerTeclado.next());
					System.out.println("Apellido: ");
					paciente.setApellido(leerTeclado.next());
					System.out.println("Rut: ");
					paciente.setRut(leerTeclado.nextInt());
					System.out.println("Dv: ");
					paciente.setDv(leerTeclado.next().charAt(0));
					
					System.out.println("Escoja sistema de salud");
					System.out.println("1.- Isapre1");
					System.out.println("2.- Isapre2");
					System.out.println("3.- MasIsapre");
					System.out.println("4.- SuperIsapre");
					System.out.println("5.- Fonasa");
					int opcionSalud = leerTeclado.nextInt();
					
					if(opcionSalud < 1 || opcionSalud > 5)
					{
						System.out.println("Sistema de salud incorrecto");
						System.out.println("Precione una tecla para continuar y enter. ");
						leerTeclado.next();
						continue;
					}
					if(opcionSalud == 1)
					{
						System.out.println("Isapre1");
					}
					else if(opcionSalud == 2)
					{
						System.out.println("Isapre2");
					}
					else if(opcionSalud == 3)
					{
						System.out.println("MasIsapre");
					}
					else if(opcionSalud == 4)
					{
						System.out.println("SuperIsapre");
					}
					else if(opcionSalud == 5)
					{
						System.out.println("Fonasa");
					}
					System.out.println("Sistema de salud incorrecto");
					System.out.println("Precione una tecla para continuar y enter. ");
					leerTeclado.next();
				}
				if(opcion == 2)
				{
					System.out.println("Ingrese Motivo Consulta: ");
					paciente.setMotivoConsulta(leerTeclado.next());
					System.out.println("Ingrese diagnóstico: ");
					paciente.setDiagnostico(leerTeclado.next());
					System.out.println("Remedios recetados: ");
					paciente.setRemedio(leerTeclado.next());
					System.out.println("Exámenes y/o Remedios solicitados: ");
					paciente.setExamen(leerTeclado.next());
					System.out.println("Datos ingresados correctamente");
					System.out.print("Presione c para continuar y enter: ");
					leerTeclado.next();			
				}
				else if(opcion == 3)
				{
					System.out.println(paciente.fichaConsulta());
				}
				if(opcion == 4)
				{
					
				}
			}
		}
		
	}
}

/* 
 * import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		Scanner leerTeclado = new Scanner(System.in);
		
		int rut = 0;
		rut = leerTeclado.nextInt();
		
		boolean existe = false;
		for(Paciente aux: pacientes)
		{
			if(aux.getRut() == rut)
			{
				existe = true;
				aux.mostrarDatos();
				break;
			}
		}
		if(!existe) // si no existe, pedir los datos
		{
			// pedir datos
		}
		
	}

}
*/
