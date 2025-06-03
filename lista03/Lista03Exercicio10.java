package lista03;

import java.util.Scanner;

public class Lista03Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do veiculo: ");
		double valorFabrica = sc.nextDouble();
		
		double somaImpostos = (0.28 + 0.45) * valorFabrica + valorFabrica;
		
		System.out.println("O valor final do veiculo é R$" +somaImpostos);
		
		sc.close();
	}

}
