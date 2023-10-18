package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_25_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Numero da conta: ");
		double numConta = scanner.nextDouble();
		
		System.out.println("Saldo: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Débito: ");
		double debito = scanner.nextDouble();
		
		System.out.println("Crédito: ");
		double credito = scanner.nextDouble();
		
		scanner.close();
		
		double saldoAt = saldo - debito + credito;
		
		if(saldoAt >= 0) {
			System.out.println("Na conta" + numConta + " o saldo é Positivo e o valor do saldo é de: " + saldoAt );
			}
		else {
			System.out.println("Na conta" + numConta + " o saldo é Negativo e o valor do saldo é de: " + saldoAt);
			}
		
		
		
	}

}
