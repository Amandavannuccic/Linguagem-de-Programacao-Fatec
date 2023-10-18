package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_20_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Insira valor de x: ");
		double x = scanner.nextDouble();
		
		System.out.println("Insira valor de y: ");
		double y = scanner.nextDouble();
		
		scanner.close();
		
		if (x < y) {
			System.out.println(x + ", " + y);
			}
		    else {
			    System.out.println(y + ", " + x);
		}
		
	}
}
