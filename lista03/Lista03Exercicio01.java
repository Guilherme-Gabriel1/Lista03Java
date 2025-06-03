package lista03;
import java.util.Scanner;

public class Lista03Exercicio01 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		int antecessor = numero - 1;
		
		System.out.println("O numero antecessor de " +numero+ " é " +antecessor);
		
		
		
		
		sc.close();
	}
	
	
}
