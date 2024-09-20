package lista06;
import java.util.Scanner;

/*5. Crie um programa que leia a altura de um número indeterminado
de pessoas. Ao final o programa deve informar o total de pessoas
cadastradas, a quantidade de pessoas com altura inferior a 1,60
metros; a quantidade de pessoas com altura entre 1,60 metros e
1,80 metros e a quantidade de pessoas com altura superior a
1,80 metros.*/

public class Altura {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int totalPessoas=0;
		int totalInferior160=0;
		int totalEntre=0;
		int totalSuperior180=0;
		
		System.out.print("Numero de pessoas");
		int numeroPessoas = sc.nextInt();
		
		for(int i=1; i<=numeroPessoas;i++) {
			System.out.print("Altura "  +  i + ":");
			double altura = sc.nextInt();
			
			if(altura < 1.60) {
				totalInferior160++;
				totalPessoas++;
			}else if(altura > 1.80) {
				totalSuperior180++;
				totalPessoas++;
			}else {
				totalEntre++;
				totalPessoas++;
			}
		}
	
		System.out.println("Total de pessoas cadastradas : " + totalPessoas);
		System.out.println("Total de pessoas abaixo de 160 metros : " + totalInferior160);
		System.out.println("Total de pessoas entre 160 e 180 metros : " + totalEntre);
		System.out.println("Total de pessoas acima de 180 metros : " + totalSuperior180);]
        
        sc.close()
	}
}

