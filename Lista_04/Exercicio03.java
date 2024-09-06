package controle;
import java.util.Scanner;
import java.text.DecimalFormat;

// 3. Faça um programa para solicitar o código, a quantidade de alunos do sexo
// masculino, a quantidade de alunos do sexo feminino e a quantidade de alunos
// aprovados de uma determinada turma.
// Calcular e informar: a porcentagem de alunos do sexo masculino; a porcentagem
// de alunos do sexo feminino; a porcentagem de alunos reprovados; o total de
// alunos da turma.

public class Lista04_Exe03 {

	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Codigo: ");
		int codigo = scanner.nextInt();
		
		System.out.print("Qtd alunos masculinos: ");
		double alunosMasc=scanner.nextInt();
		
		System.out.print("Qtd alunos femininos: ");
		double alunosFem=scanner.nextInt();
		
		System.out.print("Qtd alunos aprovados: ");
		double alunosAprov=scanner.nextInt();
		
		
		double totalAlunos = alunosFem+alunosMasc;
		double porcentagemMasc=(totalAlunos*100)/alunosMasc;
		double porcentagemFem=totalAlunos/alunosFem*100.0;
		double porcentagemReprovado=(alunosAprov/totalAlunos)*100;
		
		System.out.println("Porcentagem Masculino: " + df.format(porcentagemMasc));
		System.out.println("Porcentagem Feminino: " + df.format(porcentagemFem));
		System.out.println("Porcentagem Alunos reprovados: " + df.format(porcentagemReprovado));
		System.out.println("Total de alunos: " + df.format(totalAlunos));

        scanner.close();
	}
}
