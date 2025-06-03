package lista02;
import java.util.Scanner;

public class Lista02Exercicio04 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o 1º lado do triangulo: ");
		float lado01 = sc.nextFloat();
		System.out.println("Digite o 2º numero do triangulo: ");
		float lado02 = sc.nextFloat();
		System.out.println("Digite o 3º numero do trinagulo: ");
		float lado03 = sc.nextFloat();
		float perimetro = lado01 + lado02 + lado03;
		System.out.println("Digite a base do triangulo: " +perimetro);
		
		sc.close();
	}
}
