package lista03;

import java.util.Scanner;

public class Lista03Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida da base do Triângulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite a medida da altura do Triângulo: ");
		double altura = sc.nextDouble();
		
		double areaTriangulo = (base * altura) / 2;
		
		System.out.println("A Area do Triângulo é igual a: " +areaTriangulo+ " m².");
		
		sc.close();
	}

}
