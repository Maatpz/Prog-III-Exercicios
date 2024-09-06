package controle;
import java.util.Scanner;

/*
5. Elabore um programa para solicitar o nome de uma equipe de futebol, a
quantidade de derrotas, empates e vitórias obtidas por ela no campeonato.
Calcular e informar: a quantidade de pontos ganhos e a quantidade de pontos
perdidos.
*/

public class Lista04_Exe05 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
       System.out.print("Digite o nome da equipe de futebol: ");
       String nomeEquipe = scanner.nextLine();

       System.out.print("Digite a quantidade de derrotas: ");
       int derrotas = scanner.nextInt();

       System.out.print("Digite a quantidade de empates: ");
       int empates = scanner.nextInt();

       System.out.print("Digite a quantidade de vitórias: ");
       int vitorias = scanner.nextInt();


       int pontosGanhos = (vitorias * 3) + empates;
       int pontosPerdidos = derrotas * 3 + empates*2;
       
       System.out.println("Equipe: " + nomeEquipe);
       System.out.println("Quantidade de pontos ganhos: " + pontosGanhos);
       System.out.println("Quantidade de pontos perdidos: " + pontosPerdidos);
       scanner.close();
	}
}
