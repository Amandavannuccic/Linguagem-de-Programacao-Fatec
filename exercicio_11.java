package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
            System.out.println("Quantos carros vendidos?");
			double qCarro = scanner.nextDouble();
			
			System.out.println("Qual o total das vendas?");
			double vendas = scanner.nextDouble();
			
			System.out.println("Qual o valor do salário fixo?");
			double salarioFx = scanner.nextDouble();
			
			System.out.println("Qual o valor da comissão por cada carro?");
			double comissaoF = scanner.nextDouble();
			
			scanner.close();
			
			double onVendas = 5;
			
			double salarioFn = salarioFx + (comissaoF* qCarro) + (onVendas/ 100)* vendas;
			
			System.out.println("O valor do salário final é de: R$ " + salarioFn);
						
	}

}
