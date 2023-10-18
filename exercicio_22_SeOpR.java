package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_22_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double jornada = 40;
		
		System.out.println("Infome a quantidade de horas trabalhadas no mês: ");
		double horasT = scanner.nextDouble();
		
		System.out.println("Informe o salário por hora: ");
		double salarioH = scanner.nextDouble();
		
		scanner.close();
		
		double horasEx = 50;
		
		double salarioT;
		
		if (jornada <= horasT) {
			salarioT = (horasT - jornada)* ((horasEx /100)* salarioH + salarioH) + (salarioH * jornada);
			System.out.println("O valor do salário a receber é de: R$" + salarioT);
			
		}
		else {
			salarioT = jornada* salarioH;
		    System.out.println("O valor do salário a receber é de: R$" + salarioT);
		}
		
	}

}
