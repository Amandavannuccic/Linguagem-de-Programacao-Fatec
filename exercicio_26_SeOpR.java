package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_26_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantidade atual em estoque: ");
		double qntAt = scanner.nextDouble();
		
		System.out.println("Quantidade maxima: ");
		double qntMax = scanner.nextDouble();
		
		System.out.println("Quantidade mínima: ");
		double qntMin = scanner.nextDouble();
		
		scanner.close();
		
		double qntMedia = (qntMax + qntMin)/2;
		
		if (qntAt >= qntMedia) {
			System.out.println("Não efetuar compra: ");
		}
		else {
			System.out.println("Efetuar compra!");
			}
	}

}
