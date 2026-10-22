package model;

public class ProdutoInformatica {
	
	private String codigo;
	private String nome;
	private String categoria;
	private double preco;
	private int quantidade;
	private String marca;
	
	public ProdutoInformatica(String codigo, String nome, double preco, int quantidade, String categoria, String marca) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.marca = marca;
		this.preco = preco;
	
		if(quantidade >=0) {
			this.quantidade = quantidade;
		}
		else {
			this.quantidade = 0;
			System.out.println("Quantidade invalida! Estoque iniciado em 0.");
		}
	}

	public String getMarca() {
		return marca;
	}

	public String getCodigo() {
		return codigo;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public String getCategoria() {
		return categoria;
	}
		
	
	
	public void adicionarEstoque (int quantidade) {
		if(quantidade > 0) {
				this.quantidade += quantidade;
		}
		else {
			System.out.println("Quantidade invalida!");
		}
		// this.quantidade serve pra diferenciar o atribute q é this.quantidade do parametro q é o 
		//(int quantidade) quando ambos possuem o msm nome.
		
		// em azul bb é o atributo e azul o parametro.
	}
	
	public void removerEstoque(int quantidade) {
		if(this.quantidade >= quantidade && quantidade > 0) {
			this.quantidade -= quantidade;
		}
		else {
			System.out.println("Estoque insuficiente ou quantidade invalida!");
		}
	}

	@Override
	public String toString() {
	    return "Codigo:\t\t" + codigo
	        + "\nNome:\t\t" + nome
	        + "\nCategoria:\t" + categoria
	        + "\nMarca:\t\t" + marca
	        + "\nPreco:\t\t" + String.format("%.2f", preco)
	        + "\nUnidades:\t" + quantidade;
	}
	
	}

