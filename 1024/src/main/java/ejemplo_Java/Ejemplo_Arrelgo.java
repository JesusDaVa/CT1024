package ejemplo_Java;

public class Ejemplo_Arrelgo {

	public static void main(String[] args) {
		int intArray[];
		int[]intArray2;
		
		String[] arr;
		
		arr = new String[5];
		
		arr[0] = "cero";
		arr[1] = "UNO";
		arr[2] = "DOS";
		arr[3] = "TRES";
		arr[4] = "CUATRO";
		
		//System.out.println("Elemento ten el indice:" + arr[1]);
		
		//System.out.println("Elemento ten el indice:" + arr[2]);
			
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice" + i + " : " + arr[i]);
		}
	}

}
