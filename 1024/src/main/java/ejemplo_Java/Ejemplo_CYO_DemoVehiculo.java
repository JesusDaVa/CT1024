package ejemplo_Java;

public class Ejemplo_CYO_DemoVehiculo {

	public static void main(String[] args) {
		Ejemplo_CYO_Vehiculo minivan = new Ejemplo_CYO_Vehiculo();
		
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		int rango;
		
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + "pasajeros con un rango de " + rango + " Kilometros ");
		
		Ejemplo_CYO_Vehiculo carro = new Ejemplo_CYO_Vehiculo();
		
		carro.pasajeros = 4;
		System.out.println("Numero de pasajeros en carro es:" + carro.pasajeros);

	}

}
