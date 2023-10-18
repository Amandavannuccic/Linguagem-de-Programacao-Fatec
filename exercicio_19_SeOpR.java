package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_19_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe valor de x: ");
		double x = scanner.nextDouble();
		
		System.out.println("Informe valor de y: ");
		double y = scanner.nextDouble();
		
		scanner.close();
		
		if (x > y) {
			System.out.println("O maior valor é: " + x);
		}
			else {
			System.out.println("O maior valor é: " + y);
		}
	}
		
}