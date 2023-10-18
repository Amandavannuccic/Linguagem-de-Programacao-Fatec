package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_24_SeOpR {

	public static void main(String[] args) {
	   
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Valor do salário fixo em reais: ");
		double salarioF = scanner.nextDouble();
		
		System.out.println("Valor total das vendas em reais: ");	
		double valorV = scanner.nextDouble();
		
		scanner.close();
		
		double diferencaV = valorV - salarioF;
				
		double comissao3 = 0.03;
		
		double limiteC = 1500;
		
		double comissao5 = 0.05;
		
		if (valorV > limiteC ) {
			double calculoS = salarioF + (diferencaV *comissao5);
	        System.out.println("O valor do salário é de: R$" + calculoS);	
		}
		else {
			double calculoS1 = salarioF + (diferencaV *comissao3);
			System.out.println("Valor do salario é de: R$" + calculoS1);
		}
		
		System.out.println("Valor do salario é de: R$" + diferencaV);
		
	
	}

}
