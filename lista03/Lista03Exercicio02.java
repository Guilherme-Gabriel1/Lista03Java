package lista03;
import java.util.Scanner;

public class Lista03Exercicio02 {

public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um numero: ");
	int numero = sc.nextInt();
	
	int sucessor = numero + 1;
	
	System.out.println("O numero sucessor de " +numero+ " é " +sucessor+ ".");
	
	sc.close();
	
}

	
}
