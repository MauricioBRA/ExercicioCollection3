package br.com.generation.collection;

public class Produto {
	
	//Atributos --> variaveis
	private String produto;
	private int serie;
	private String marca;
	
	
	
	//Construtores de classes
	public Produto(String produto, int serie, String marca) {
		super();
		this.produto = produto;
		this.serie = serie;
		this.marca = marca;
	}

	//Métodos de acesso --> Getters and Setters
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNome() {
		return marca;
	}

	public void setNome(String marca) {
		this.marca = marca;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {
		return "| O produto adicionado: " + produto + 
			   " Nome: " + marca + " | " + serie + "|";
	}
}
