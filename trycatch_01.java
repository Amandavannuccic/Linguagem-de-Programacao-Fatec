package linguagemDeProgramação;

import java.util.Scanner;

public class trycatch_01 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        double valor1, valor2, valor3;

		        try {
		            System.out.print("Digite o primeiro valor: ");
		            valor1 = scanner.nextDouble();

		            System.out.print("Digite o segundo valor: ");
		            valor2 = scanner.nextDouble();

		            System.out.print("Digite o terceiro valor: ");
		            valor3 = scanner.nextDouble();

		           
		            double maior = Math.max(valor1, Math.max(valor2, valor3));

		            System.out.println("O maior valor é: " + maior);
		        } catch (java.util.InputMismatchException e) {
		            System.out.println("Você digitou um valor inválido. Certifique-se de inserir números.");
		        }
		    
	}

}
