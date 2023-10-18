package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_101_TryCatch {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
              
        System.out.println("Insira o nome: ");
        String nome = scanner.next();

        System.out.println("Insira 'M' para Masculino e 'F' para Feminino: ");
        String sexo = scanner.next();

        while (!sexo.equals("M") && !sexo.equals("F")) {
            System.out.println("Insira 'M' para sexo Masculino e 'F' para sexo Feminino:");
            sexo = scanner.next();
        }

        System.out.println("Insira a altura: ");
        double altura = scanner.nextDouble();

        if (sexo.equals("M")) {
            double pesoM = (72.7 * altura) - 58;
            System.out.println("O peso ideal de " + nome + " é de: " + pesoM);
        } else {
            double pesoF = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal de " + nome + " é de: " + pesoF);
        }

        scanner.close();
    }
}

