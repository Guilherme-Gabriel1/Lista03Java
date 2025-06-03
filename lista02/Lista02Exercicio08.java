package lista02;
import java.util.Scanner;

public class Lista02Exercicio08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Média dos números desejados.");
		
		System.out.println("Digite a quantidade de números desejados para calcular a média: ");
		double qntNumeros = sc.nextDouble();
		
		double soma = 0;
		
		for(int contador = 1; contador <= qntNumeros; contador++) {
			System.out.println("Digite o número desejado para calcular a média: ");
			double numero = sc.nextDouble();
			
			soma += numero;
		}
		
		double media = soma / qntNumeros;
		
		System.out.println("A Média dos numeros digitados é: "+media);

		sc.close();
	}

}
