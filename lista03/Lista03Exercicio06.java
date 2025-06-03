package lista03;

import java.util.Scanner;

public class Lista03Exercicio06 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = sc.nextDouble();
		
		double areaCirculo = Math.pow(raio, 2)*Math.PI; 
		
		System.out.printf("A area do Circulo é igual a: %.2f cm²",areaCirculo);

		sc.close();
	}

}
