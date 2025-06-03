package lista02;

import java.util.Scanner;

public class Lista02Exercicio05 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1 numero: ");
		float numero01 = sc.nextFloat();
		System.out.println("Digite o 2 numero: ");
		float numero02 = sc.nextFloat();
		System.out.println("Digite o 3 numero: ");
		float numero03 = sc.nextFloat();
		//Calcular o MMC
		float mediaHarmonica = 3 / ((1/numero01) + (1/numero02) + (1/numero03));
		System.out.println(mediaHarmonica);
		
		
		
		sc.close();
	}
}
