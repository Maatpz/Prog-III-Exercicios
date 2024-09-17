package lista05;
import java.util.Scanner;
import java.text.DecimalFormat;

/*8. Faça um programa que leia o código, a quantidade, o preço
unitário e a forma de pagamento (1 - Dinheiro, 2 - Pix, 3 -
Cartão débito, 4 - Cartão crédito) de um produto. Pagamentos
em dinheiro recebem um desconto de 10%, em cartão de débito 5%
em cartão de crédito 3% e em pix 12%. O programa deve informar
o valor do desconto e o valor final a pagar.*/

public class Pagamentos {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print("Codigo: ");
		int codigo = l.nextInt();
		
		System.out.print("Quantidade: ");
		int qtd = l.nextInt();
		System.out.print("Preço Unitário: ");
		double preco = l.nextDouble();
		
		System.out.println("Escolha a forma de pagamento:");
       System.out.println("1 - Dinheiro");
       System.out.println("2 - Pix");
       System.out.println("3 - Cartão débito");
       System.out.println("4 - Cartão crédito");
       int formaPagamento = l.nextInt();
	
       double valorTotal = qtd * preco;
     
       double desconto = 0;
       switch (formaPagamento) {
           case 1:
               desconto = 0.10; // 10%
               break;
           case 2:
               desconto = 0.12; // 12%
               break;
           case 3:
               desconto = 0.05; // 5%
               break;
           case 4:
               desconto = 0.03; // 3%
               break;                           
       }
      
       double valorDesconto = valorTotal * desconto;
       double valorFinal = valorTotal - valorDesconto;
      
       System.out.println("Valor do desconto: " + df.format(valorDesconto));
       System.out.println("Valor final:" + df.format(valorFinal));
       l.close();
	}
}


