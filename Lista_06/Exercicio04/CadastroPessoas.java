package lista06;
import java.util.Scanner;

//4. Elabore um programa que leia o sexo de um número indeterminado
//de pessoas. Ao final escreva a quantidade de pessoas
//cadastradas e o total de pessoas de cada sexo.

public class Qtdpessoas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	     int totalHomens = 0;
         int totalMulheres = 0;
         int totalPessoas = 0;
                        
      
		System.out.print("Quantidade de pessoas: ");
		int qtdPessoas = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=qtdPessoas;i++){
			System.out.print("Sexo pessoa " + i+": ");
			 String sexo = sc.nextLine().toUpperCase();
				if(sexo.equals("M")) {
						totalHomens++;
						totalPessoas++;
				}else if(sexo.equals("F")) {
					totalMulheres++;
					totalPessoas++;
				}else {
					System.out.print("Outros");
					totalPessoas++;
					
				}
		}
		System.out.println("Quantidade de pessoas:" + totalPessoas);
		System.out.println("Quantidade de mulheres:" + totalMulheres);
		System.out.println("Quantidade de Homens:" + totalHomens);
		sc.close()
	}
}
