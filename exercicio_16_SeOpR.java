package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_16_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de maçãs compradas: ");
		double qntmaca = scanner.nextInt();
		double valor = qntmaca;
		
		scanner.close();
		
		if(qntmaca >= 12) {
			valor = qntmaca*1;
			System.out.println("O valor da compra é: R$" + valor);
		}
		    else {
		    	valor = qntmaca*1.3;
		    	System.out.println("O valor da compra é: R$" + valor);
		    }
	}

}
