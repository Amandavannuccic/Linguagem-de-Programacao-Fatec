package linguagemDeProgramação;

import java.util.Scanner;
import java.time.Year;

public class exercicio_18_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu ano de nascimento: ");
		int anoNasc = scanner.nextInt();
		
		scanner.close();
		
		int anoAtual = Year.now().getValue();
				
		int idade = anoAtual - anoNasc;
		
		if (idade >= 18) {
			System.out.println("Você pode votar!");
	    }
		    else {
		    	System.out.println("Você ainda não pode votar!");
		    }
	}

}
