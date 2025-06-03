package lista03;

import java.util.Scanner;

public class Lista03Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de veiculos vendidos no mês: ");
		double qntVeiculos = sc.nextDouble();
		
		System.out.println("Digite o valor total dos veiculos vendidos: ");
		double valorTotalVeiculos = sc.nextDouble();
		
		System.out.println("Digite o salario fixo no mês: ");
		double salarioFixo = sc.nextDouble();
		
		System.out.println("Digite o valor recebido por veiculo: ");
		double valorPorVeiculo = sc.nextDouble();
		
		double calculo = (valorTotalVeiculos * 0.05) + (qntVeiculos * valorPorVeiculo) + salarioFixo;
		
		System.out.println("O salário total do vendedor é R$" +calculo);
		
		sc.close();
	}

}