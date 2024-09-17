package controle;
import dominio.Clube;
import java.util.Scanner;
import java.text.DecimalFormat;


public class ControlaClube {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DecimalFormat df = new DecimalFormat("0.00");

	        System.out.print("Digite o nome do clube: ");
	        String nome = scanner.nextLine();
	        
	        System.out.print("Digite o número de vitórias: ");
	        int vitorias = scanner.nextInt();
	        
	        System.out.print("Digite o número de derrotas: ");
	        int derrotas = scanner.nextInt();
	        
	        System.out.print("Digite o número de empates: ");
	        int empates = scanner.nextInt();

	      
	        Clube clube = new Clube(nome, vitorias, derrotas, empates);

	        int totalJogos = clube.calcularTotalJogos();
	        int totalPontos = clube.calcularTotalPontos();
	        double aproveitamento = totalPontos/(totalJogos*3.0)*100.0;

	        
	        
	        System.out.println("\nClube: " + clube.getNome());
	        System.out.println("Total de jogos: " + totalJogos);
	        System.out.println("Total de pontos: " + totalPontos);
	        System.out.println("Aproveitamento: " + df.format(aproveitamento)+ "%");

	        scanner.close();
	 }
}
