package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista02Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("montante final de um investimento com base no capital inicial, taxa de juros anual e número de anos");
		
		System.out.println("Digite o capital inicial: ");
		double capitalInicial = sc.nextDouble();
		
		System.out.println("Digite a taxa de juros anual: ");
		double taxaAnual = sc.nextDouble();
		
		System.out.println("Digite o número de anos investidos: ");
		double anosInvestimento = sc.nextDouble();
		
		double taxa = taxaAnual / 100;
		double montanteFinal = capitalInicial * Math.pow(1 + taxa, anosInvestimento);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println(df.format(montanteFinal));
		
		
		
		sc.close();
	}

}
