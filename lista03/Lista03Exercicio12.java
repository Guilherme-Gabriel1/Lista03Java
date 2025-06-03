package lista03;

import java.util.Scanner;

public class Lista03Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		float Fahrenheit = sc.nextFloat();
		
		float celsius = (Fahrenheit - 32) * 5 / 9;
		
		System.out.println(celsius);
		
		sc.close();
	}

}