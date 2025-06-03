package lista03;

import java.util.Scanner;

public class Lista03Exercicio05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de um lado e veja o valor da area do Quadrado do numero digitado: ");
		double lado = sc.nextDouble();
		
		double areaQuadrado = (double) Math.pow(lado, 2);
		
		System.out.println("A area do quadroado é igual a " +areaQuadrado+ " m².");
		
		sc.close();
	}

}
