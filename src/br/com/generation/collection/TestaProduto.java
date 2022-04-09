package br.com.generation.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaProduto {

	public static void main(String[] args) {
		
		Scanner pd = new Scanner(System.in);
		
		ArrayList<Produto> item = new ArrayList<>();
		
		System.out.println("Adicione a quantidade de produto que deseja: ");
		int pacotes = pd.nextInt();
		
		//item.remove
		
		for(int i = 0; i < pacotes; i++) {
			System.out.println("Expecifique o produto: ");
			String produto = pd.nextLine();
			pd.nextLine();
			
			System.out.println("Informe o nome do produto: ");
			String marca = pd.nextLine();
			
			System.out.println("Informe o número de série: ");
			int serie = pd.nextInt();
			
			item.add(new Produto(produto, serie, marca));
		}
		
		for(Produto i: item) {
			System.out.println(i);
		}
		pd.close();
	}

}
