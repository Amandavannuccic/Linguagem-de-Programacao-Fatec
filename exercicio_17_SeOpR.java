package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_17_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a nota 1a: ");
		double nota1a = scanner.nextDouble();
		
		System.out.println("Informe a nota 2a: ");
		double nota2a = scanner.nextDouble();
		
		scanner.close();
		
		double media = (nota1a + nota2a)/2;
		
		if (media >=6) {
			System.out.println("Aprovado! ");
		}
	      	else {
			System.out.println("Reprovado!");
			}

	}

}
