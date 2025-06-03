package lista03;

import java.util.Scanner;

public class Lista03Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Porcentagem da votação");
		System.out.println("Digite a quantidade total de eleitores da cidade: ");
		int votosTotais = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos em branco: ");
		int votosBrancos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos nulos: ");
		int votosNulos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos válidos: ");
		int votosValidos = sc.nextInt();
		
		float porcentagemVotosBrancos = votosBrancos * 100 / votosTotais;
		float porcentagemVotosNulos = votosNulos * 100 / votosTotais;
		float porcentagemVotosValidos = votosValidos * 100 / votosTotais;
		
		System.out.println("A porcentagem de votos brancoos é: "+porcentagemVotosBrancos+" %");
		System.out.println("A porcentagem de votos nulos é: "+porcentagemVotosNulos+" %");
		System.out.println("A porcentagem de votos Validos é: "+porcentagemVotosValidos+" %");
		
		
		sc.close();
	}

}
