package lista05;
import java.util.Scanner;

/*
5. Faça um programa que leia dois números e mostre qual o maior
dos dois. O programa deve informar caso sejam iguais.
*/

public class exer05 {

	public static void main(String[] args) {
		
		       Scanner scanner = new Scanner(System.in);
		       
		       System.out.print("Primeiro numero: ");
		       int num1 = scanner.nextInt();
		       
		       System.out.print("Segundo numero: ");
		       int num2 = scanner.nextInt();
		       		       		    		      
		       if (num1>num2) {
		    	  System.out.print("Primeiro numero e maior :"+ num1);		   	          
		        } else if(num1==num2) {
		        	System.out.print("Numeros iguais:"+ num1);
		        }
		        else {
		            System.out.println("Segundo numero e maior:"+ num2);		      
		        }		    		   		        
		        scanner.close();
			}
	}
