package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_13_horizontalizacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe a primeira nota: ");
		int nota1 = scanner.nextInt();
		
		System.out.println("Informe a segunda nota: ");
		int nota2 = scanner.nextInt();
		
		System.out.println("Informe a terceira nota: ");
		int nota3 = scanner.nextInt();
		
		scanner.close();
		
		int media = (nota1*2 + nota2*3 + nota3*5)/10;
		System.out.println("A média final é: " + media);
				
	}

}
