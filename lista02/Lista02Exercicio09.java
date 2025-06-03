package lista02;
import java.util.Scanner;

public class Lista02Exercicio09 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cálculo de Potência");
		
		System.out.println("Digite o valor da base: ");
		float base = sc.nextFloat();
		
		System.out.println("Digite o valor do expoente: ");
		float expoente = sc.nextFloat();
		
		double operacao = Math.pow(base, expoente);
		
		System.out.println("O calculo da potencia digitada é: " +operacao);
		sc.close();
	}

}
