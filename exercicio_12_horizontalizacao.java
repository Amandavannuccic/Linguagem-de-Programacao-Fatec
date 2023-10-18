package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_12_horizontalizacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus fahrenheit: ");
		double tempFahre = scanner.nextDouble();
		
		scanner.close();
		
		double tempCels = ((tempFahre - 32)*5)/9;
		System.out.println("O equivalete de " + tempFahre + " graus Fahrenheit, em  graus Celsius é igual a: " + tempCels + " C");
		}
		
	}


