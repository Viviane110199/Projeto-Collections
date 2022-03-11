package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsEstoque {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite um produto de limpeza em falta: ");
			String prodLimpeza = entrada.next();
			
			System.out.println("Digite um alimento em falta: ");
			String alimentos = entrada.next();
			
			System.out.println("Digite uma fruta em falta: ");
			String frutas = entrada.next();
			
			ArrayList<String> estoque = new ArrayList<>();
			
			estoque.add(prodLimpeza); 
			estoque.add(alimentos); 
			estoque.add(frutas); 
			
			System.out.println();
			
			estoque.remove(1);
			System.out.println("Alimento " + alimentos + " abastecido! Falta abastecer: ");
			System.out.println(estoque);
			
			System.out.println("");
			
			System.out.println("Atualize o estoque de alimento!");
			System.out.println("Digite um alimento em falta: ");
			String alimento = entrada.next();
			estoque.add(new String(alimento));
			
			System.out.println(estoque);
			
			Collections.sort(estoque);
		}
	}

