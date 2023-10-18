package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_27_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escreva um valor: ");
		double valor = scanner.nextDouble();
		
		scanner.close();
		
		if (valor < 0) {
			System.out.println("Valor negativo!");
		}
		else {
			System.out.println("Valor positivo!");
		}
	}

}
