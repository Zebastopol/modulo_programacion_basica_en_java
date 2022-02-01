import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Automovil auto1 = new Automovil(200,"Gasolina",false,4,"Mediano","hqdl",2010,"Sedan");
		Motocicleta moto1 = new Motocicleta(150,"Ciudad",50,"Gasolina",false,2,"Pequeño","yvt63");
		Tren tren1 = new Tren("Litoral",98,0,"-",true,980,"Grande","234564");

		Vehiculo vehiculo = new Tren("Litoral",100,0,"Electrico",true,1000,"Grande","HQHQHQHQ");		
		Tren trenNos = (Tren)vehiculo;
		System.out.println(trenNos.viajar());
		System.out.println(auto1.mostraDatos());
		System.out.println( moto1.mostraDatos());
		System.out.println(tren1.mostraDatos());
	
		System.out.println(moto1.mover() +"-"+ moto1.frenar()+"-"+ moto1.cargando());
		
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculos.add(trenNos);
		vehiculos.add(auto1);
		vehiculos.add(moto1);
		vehiculos.add(tren1);
		
		
		for(Vehiculo v: vehiculos)
		{	System.out.println(v.getPatente());
			if(v instanceof Tren )
			{	System.out.println( ((Tren)v).viajar());
			}
			else if(v instanceof Automovil)
			{	System.out.println(((Automovil)v).mostraDatos());
				
			}
		}
		
	}

}
