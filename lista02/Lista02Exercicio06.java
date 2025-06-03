package lista02;

import java.util.Scanner;

public class Lista02Exercicio06 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º numero: ");
		double numero01 = sc.nextDouble();
		
		System.out.println("Digite o 2º numero: ");
		double numero02 = sc.nextDouble();
		
		System.out.println("Digite o 3º numero: ");
		double numero03 = sc.nextDouble();
		
		
		//Para fazer a RAIZ CUBICA "RAIZ ³"
		//Para fazer a RAIZ QUADRADA "RAIZ ²"
		double mediaGeometrica = Math.cbrt(numero01*numero02*numero03);
		
		System.out.println("A média Geométrica dos números digitado é: " +mediaGeometrica);
		sc.close();
	}
	
	
}
