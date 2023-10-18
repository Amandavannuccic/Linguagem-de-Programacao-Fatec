package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_14_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor desejado: ");
		double valorInf = scanner.nextDouble();
		
		scanner.close();
		
		if (valorInf > 10) {
		System.out.println("É maior que 10!");
		}
		else { 
		System.out.println("Não é maior que 10!");
		}
		
	}

}
