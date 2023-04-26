package PooHeranca;

public class PessoaFisica  extends Cliente{
	
	private String cpf;

	public PessoaFisica(String nome, String endereco, String telefone, String email, int idade, String cpf) {
		super(nome, endereco, telefone, email, idade);
		this.cpf = cpf;
			
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
	
	public void visualizar() {
		
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço:" +getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + cpf);
	}
	
}
