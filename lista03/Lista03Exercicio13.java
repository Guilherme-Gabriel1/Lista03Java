package lista03;

import java.util.Scanner;

public class Lista03Exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		System.out.println(media);
		
		sc.close();
	}

}