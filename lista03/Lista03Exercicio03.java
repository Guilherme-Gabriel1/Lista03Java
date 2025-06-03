package lista03;
import java.util.Scanner;

public class Lista03Exercicio03 {

public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a base do retangulo: ");
	float base = sc.nextFloat();
	
	System.out.println("Digite a altura do retangulo: ");
	float altura = sc.nextFloat();
	
	float resultado = altura * base;
	
	System.out.println("A Area do retangulo é " +resultado);
	sc.close();
}
}
