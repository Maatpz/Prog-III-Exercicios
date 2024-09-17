package lista05;
import java.util.Scanner;

/*7. Elabore um programa que leia três números diferentes e informe
o maior deles.*/

public class Maior {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		System.out.print("Primeiro numero");
		int num1 = l.nextInt();
		
		System.out.print("Segundo numero");
		int num2 = l.nextInt();
		System.out.print("Terceiro numero");
		int num3 = l.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Numero maior:" + num1);
		}else if (num2>num1 && num2>num3) {
			System.out.println("Numero maior:" + num2);
		}else {
			System.out.println("Numero maior:" + num3);
		}
		l.close();
	}
}
