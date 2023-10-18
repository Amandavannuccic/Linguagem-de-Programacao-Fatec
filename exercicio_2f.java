package linguagemDeProgramação;

public class exercicio_2f {

	public static void main (String [] args) {
		
		int x = 1;
		int y = 2;
		int z = y + x;
		
		System.out.println("Valor de z: " + z);
		
		x = 5;
		y = x + z;
		
		System.out.println("Valor de x, y, z: " + x + ", " + y + ", " + z);
		
	}
}
