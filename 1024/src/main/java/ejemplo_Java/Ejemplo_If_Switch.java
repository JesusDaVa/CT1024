package ejemplo_Java;

public class Ejemplo_If_Switch {

	public static void main(String[] args) {
		int i = 3;
		
		switch(i) {
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es UNO");
			break;
		case 2:
			System.out.println("i es DOS");
			break;
		default:
			System.out.println("i no es equivalente a ninguno de los anteriores");
			break;
	}
	}
}
