package linguagemDeProgramação;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class exercicio_7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
						
		System.out.println("Informe a data de seu nascimento, dia/mês/ano: ");
		String dataNasc = scanner.next();		
		
		scanner.close();
		
		LocalDate dataNasci = LocalDate.parse(dataNasc, formatter);

		LocalDate dataAtual = LocalDate.now();

		Period periodo = Period.between(dataNasci, dataAtual);

		int idade = periodo.getDays();
		
		System.out.println("Sua idade em dias é: "+ idade);
	
	}
	
	}


