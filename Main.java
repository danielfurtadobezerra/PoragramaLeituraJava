package programa_leitura;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.println("Olá mundo!");
			System.out.println("Seja bem vindo ao Programa de Leitura de Dados");
			
			System.out.println("Escreva seu nome:");
			String nome = in.nextLine();
			System.out.println("Escreva sua idade:");
			String idade = in.nextLine();
			System.out.println("Escreva sua cidade:");
			String cidade = in.nextLine();
			System.out.println("Escreva seu pais:");
			String pais = in.nextLine();
			System.out.println("Escreva sua profissão:");
			String prof = in.nextLine();
			System.out.println("--------------");
			System.out.println("Seu nome é "+ nome);
			System.out.println("Você tem "+idade+" anos");
			System.out.println("Você mora na cidade "+ cidade);
			System.out.println("No pais "+ pais);
			System.out.println("E sua profissão é "+ prof);
			System.out.println("Foi um grande prazer te conhecer!");
			System.out.println("Até a próxima!");
		}
	}
	
}
