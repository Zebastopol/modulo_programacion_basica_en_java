
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Vehiculo vehiculo1 = new Vehiculo();
			vehiculo1.setCapacidadPasajeros(3);
			vehiculo1.setNumeroChasis("asdasdasd1234");
			vehiculo1.setPatente("asd123");
			vehiculo1.setRuedas(4);
			vehiculo1.setTipoCombustible("petroleo");

			System.out.println(" La patente del vehiculo1 es: "+vehiculo1.getPatente());
			Automovil automovil1 = new Automovil ("af3015","bencina", "a12312", 4,5,false, 5);
			System.out.println(automovil1.getPatente());
			System.out.println(automovil1.mostrarDatos());
			Motocicleta moto = new Motocicleta("car12313","bencina","r11234",2,2,50,"chopera");
			System.out.println(moto.mostrarDatos());
			Tren tren1 = new Tren("tren44435","electrico", "o22332",20,100,8,"pasajeros");
			System.out.println(tren1.mostrarDatos());

			Vehiculo automovil2 = new Automovil("d1234","petroleo","j4444",4,4,true,5);

			System.out.println(automovil2.mostrarDatos());
			System.out.println(automovil1.mostrarDatos());
			System.out.println(vehiculo1.mostrarDatos());
			System.out.println(automovil1.encender()  );
			System.out.println(automovil1.encender(1) );
			System.out.println(automovil1.encender(false, false));

		
	}

}
