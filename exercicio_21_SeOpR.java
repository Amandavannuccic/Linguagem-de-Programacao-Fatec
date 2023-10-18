package linguagemDeProgramação;

import java.util.Scanner;

public class exercicio_21_SeOpR {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora de início do jogo (0 a 23): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Informe a hora de término do jogo (0 a 23): ");
        int horaTermino = scanner.nextInt();

        scanner.close();
        
        int duracao;
        if (horaInicio <= horaTermino) {
            duracao = horaTermino - horaInicio;
        } else {
     
        duracao = 24 - horaInicio + horaTermino;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");

       
    }
	}

