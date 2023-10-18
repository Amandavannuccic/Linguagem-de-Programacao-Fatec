package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Informe a quantidade total de eleitores: ");
		int totalE = scanner.nextInt();
		
		System.out.println("Informe a quantidade de votos brancos: ");
		int votoB = scanner.nextInt();

		System.out.println("Informe a quantidade de votos nulos: ");
		int votoN = scanner.nextInt();

		System.out.println("Informe a quantidade de votos validos: ");
		int votoV = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("São: " + "\n" + ( votoB *100 ) / totalE + "% de votos em Branco; " + "\n" + ( votoN *100 ) / totalE + "% de votos Nulos; " + "\n" + ( votoV *100) / totalE + "% de votos Válidos; ");  
		
	}

}
