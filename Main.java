package programa_leitura;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.println("Ol� mundo!");
			System.out.println("Seja bem vindo ao Programa de Leitura de Dados");
			
			System.out.println("Escreva seu nome:");
			String nome = in.nextLine();
			System.out.println("Escreva sua idade:");
			String idade = in.nextLine();
			System.out.println("Escreva sua cidade:");
			String cidade = in.nextLine();
			System.out.println("Escreva seu pais:");
			String pais = in.nextLine();
			System.out.println("Escreva sua profiss�o:");
			String prof = in.nextLine();
			System.out.println("--------------");
			System.out.println("Seu nome � "+ nome);
			System.out.println("Voc� tem "+idade+" anos");
			System.out.println("Voc� mora na cidade "+ cidade);
			System.out.println("No pais "+ pais);
			System.out.println("E sua profiss�o � "+ prof);
			System.out.println("Foi um grande prazer te conhecer!");
			System.out.println("At� a pr�xima!");
		}
	}
	
}
