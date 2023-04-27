package PooHeranca;

public class Console extends Produto {
	
	private String fabricante;

	public Console(String nome, String descricao, double preco, int estoque, String fabricante) {
		super(nome, descricao, preco, estoque);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void visualizar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: " + getPreco());
        System.out.println("Estoque: " + getEstoque()); 
        System.out.println("Fabricante: " + fabricante);
    }

}
