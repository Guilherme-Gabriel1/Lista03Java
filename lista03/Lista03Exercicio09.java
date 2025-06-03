package lista03;

import java.util.Scanner;

public class Lista03Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário mensal atual: ");
		double salario = sc.nextDouble();
		
		System.out.println("Digite o percentual de reajuste do salário: ");
		double percentual = sc.nextDouble();
		
		percentual /= 100;
		
		double resultado = percentual * salario + salario;
		
		System.out.println("O seu salário ajustado é R$" +resultado+ " Reais.");
		
		sc.close();
	}

}
