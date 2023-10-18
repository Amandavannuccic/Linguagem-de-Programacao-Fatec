package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_10 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double distribuidor = 28;
		double imposto = 45;
		
		System.out.println("Informe o valor do custo de fabrica: ");
		double custoFab = scanner.nextDouble();
		
		scanner.close();
		
		double custoF = (distribuidor/ 100)* custoFab + (imposto/ 100)* custoFab + custoFab;
		System.out.println("O custo finals é de: R$ " + custoF);
	
	
	}
	
	
	

}
