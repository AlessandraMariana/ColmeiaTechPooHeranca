package PooHeranca;

public class Jogo  extends Produto{
	
	private String plataforma;

	public Jogo(String nome, String descricao, double preco, int estoque, String plataforma) {
		super(nome, descricao, preco, estoque);
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public void visualizar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Estoque: " + getEstoque());
        System.out.println("Plataforma: " + plataforma);
	}

}
