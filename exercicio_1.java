package linguagemDeProgramação;

public class exercicio_1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
	
		System.out.println("antes a = " + a + " e b = " + b);
		
		int c = a;
		
		a = b;
		
		b = c;
		
		System.out.print("valor de a e b: " + a +", " + b);
		}

}
