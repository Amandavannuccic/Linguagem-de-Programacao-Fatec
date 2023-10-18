package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();
		
		scanner.close();
		
		int antecessor = valor -1;
		
		System.out.println("O antecessor de " + valor + " é " + antecessor);
			
	}

}
