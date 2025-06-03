package lista02;
import java.util.Scanner;

public class Lista02Exercicio07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da 'A' da equação quadrática: ");
		float numero01 = sc.nextFloat();
		
		System.out.println("Digite o valor da 'B' da equação quadrática: ");
		double numero02 = sc.nextDouble();
		
		System.out.println("Digite o valor da 'C' da equação quadrática: ");
		float numero03 = sc.nextFloat();
		
		double delta = Math.pow(numero02, 2.0) - 4*numero01*numero03;
		
		System.out.println("A Equação Quadrática dos valores informados é igual a: " +delta);
		
		if (delta>0) {
			System.out.println("Possui duas raizes");
			
		}else if (delta == 0) { 
			System.out.println("Possui uma raiz");
		}else {
			System.out.println("Não possui raizes");
		}
		sc.close();
	}

}
