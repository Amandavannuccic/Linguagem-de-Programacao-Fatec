package linguagemDeProgramação;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio_29_AC {

	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
		
		System.out.println("Escreva o primeiro valor: ");
		double valor1 = scanner.nextDouble();
		
		System.out.println("Escreva o segundo valor: ");
		double valor2 = scanner.nextDouble();
		
		System.out.println("Escreva o terceiro valor: ");
		double valor3 = scanner.nextDouble();
		
		scanner.close();
		
		double[] valores = {valor1, valor2, valor3};
		
		Arrays.sort(valores);
		
		double somaValores = valores[1] + valores [2];
		
		System.out.println("A soma dos dois maiores valores é: " + somaValores);
		
	}
	

}