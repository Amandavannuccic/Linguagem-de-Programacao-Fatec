package linguagemDeProgramação;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class exercicio_30_AC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Double> valores = new ArrayList<Double>();
		
		System.out.println("Escreva o primeiro valor: ");
		double valor1 = scanner.nextDouble();
		
		System.out.println("Escreva o segundo valor: ");
		double valor2 = scanner.nextDouble();
		
		System.out.println("Escreva o terceiro valor: ");
		double valor3 = scanner.nextDouble();
		
		scanner.close();
		
		valores = {valor1, valor2, valor3};
		
		Arrays.sort(valores);
		
		
		System.out.println("Os valores organizados em ordem crescente: " + valores);
		
	}

}
