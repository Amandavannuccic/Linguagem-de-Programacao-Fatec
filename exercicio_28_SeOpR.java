package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_28_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escreva o primeiro valor: ");
		double valor1 = scanner.nextDouble();
		
		System.out.println("Escreva o segundo valor: ");
		double valor2 = scanner.nextDouble();
		
		System.out.println("Escreva o terceiro valor: ");
		double valor3 = scanner.nextDouble();
		
		scanner.close();
		
		if (valor1 > valor2  && valor1 > valor3) {
			System.out.println("O maior valor é: " + valor1 );
		}
		else if (valor2 > valor1 && valor2 > valor3){
			System.out.println("O maior valor é:" + valor2);
		}
		else if (valor3 > valor1 && valor3 > valor2){
			System.out.print("O maior valor é:" + valor3);
		}
	}
	

}