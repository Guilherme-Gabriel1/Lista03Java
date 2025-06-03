package lista02;

import java.util.Scanner;

public class Lista02Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Converta um valor em reais para dólares, euros e libras, com base em taxas de câmbio fornecidas pelo usuário");
		
		System.out.println("Digite o valor em reais: ");
		double valorReal = sc.nextDouble();
		
		System.out.println("Digite a taxa de câmbio do Dolar: ");
		double taxaDolar = sc.nextDouble();
		System.out.println("Digite a taxa de câmbio do Euro: ");
		double taxaEuro = sc.nextDouble();
		System.out.println("Digite a taxa de câmbio da Libra: ");
		double taxaLibra = sc.nextDouble();
		
		taxaDolar = valorReal * taxaDolar;
		taxaEuro = valorReal * taxaEuro;
		taxaLibra = valorReal * taxaLibra;
		
		System.out.println("R$" +valorReal+ " reais convertido em dolar é $" +taxaDolar);
		System.out.println("R$" +valorReal+ " reais convertido em dolar é €" +taxaEuro);
		System.out.println("R$" +valorReal+ " reais convertido em dolar é £" +taxaLibra);	
		
		sc.close();
	}

}
