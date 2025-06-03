package lista02;

import java.util.Scanner;

public class Lista02Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Três notas e seus respectivos pesos, e calcule a média ponderada dessas notas");
		
		System.out.println("Digite a nota de maior peso: ");
		double notaMaior = sc.nextDouble();
		System.out.println("Digite o peso dessa nota de 1 à 3: ");
		double pesoMaior = sc.nextDouble();
		
		
		System.out.println("Digite a nota de médio peso: ");
		double notaMedio = sc.nextDouble();
		System.out.println("Digite o peso dessa nota de 1 à 3: ");
		double pesoMedio = sc.nextDouble();
		
		
		System.out.println("Digite a nota de menor peso: ");
		double notaMenor = sc.nextDouble();
		System.out.println("Digite o peso dessa nota de 1 à 3: ");
		double pesoMenor = sc.nextDouble();
		
		
		
		double mediaPonderada = (notaMaior * pesoMaior) + (notaMedio * pesoMedio) + (notaMenor * pesoMenor);
		
		double resultado = mediaPonderada / (pesoMaior + pesoMedio + pesoMenor);
		
		System.out.println("A média Ponderada das notas é " + resultado);

		
		sc.close();
	}

}
