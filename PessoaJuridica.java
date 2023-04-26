package PooHeranca;

public class PessoaJuridica extends Cliente{

	private String cnpj;

	public PessoaJuridica(String nome, String endereco, String telefone, String email, int idade, String cnpj) {
		super(nome, endereco, telefone, email, idade);
		this.cnpj = cnpj;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço:" +getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade:" + getIdade());
        System.out.println("CNPJ: " + cnpj);
	
	}		
}
