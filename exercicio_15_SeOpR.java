package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_15_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um valor, positivo ou negativo: ");
		double valor = scanner.nextDouble();
		
		scanner.close();
		
		if (valor >= 0) {
			System.out.println("O valor é positivo!");
		}
			else {
				System.out.println("O valor é negativo!");
		}
		
	}

}
