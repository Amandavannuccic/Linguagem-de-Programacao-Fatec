package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_9 {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário mensal atual, de seu funcionário: ");
		double salarioAtual = scanner.nextInt();
		
		System.out.println("Informe o percentual do reajuste que deseja aplicar: ");
		double reajuste = scanner.nextInt();
		
		scanner.close();
		
		double novoSalario = (reajuste/100)*salarioAtual + salarioAtual;
		System.out.println("O valor do Novo Salário é de: R$ " + novoSalario);
		
	}
	
	
	

}
