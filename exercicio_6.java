package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		double base, altura, area;
		
		do {
		System.out.println("Digite a base do retângulo: ");
		base = scanner.nextDouble();  
		
		System.out.println("Digite a altura do retângulo: ");
		altura = scanner.nextDouble();
				
		if (base <= altura) {
			System.out.println("Em um retângulo a base é maior que a altura, digite novamente a base: ");
		}
				
		}
		while (base <= altura);
		
		area = base* altura;
		System.out.println("A área do retângulo é: " + area);
		
		scanner.close();
	}
	
}		
		