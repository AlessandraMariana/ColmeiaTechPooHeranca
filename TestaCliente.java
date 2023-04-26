package PooHeranca;

public class TestaCliente {

public static void main(String[] args) {
		
		PessoaFisica pessoafisica1 = new PessoaFisica("Alberto Carlos Silva", "R. das Flores, 154","(81) 99999-9999", "albertocs@gmail.com", 32, "123.456.789-10");
		PessoaFisica pessoafisica2 = new PessoaFisica("Agnes Vitorino", "Av. Brasil, 396", "(21) 88888-8888","agnesvito@outlook.com", 27,"987.654.321-00");
		PessoaJuridica pessoajuridica1= new PessoaJuridica("Empresa Vitorius", "R. do Mareco, 99","(11) 99999-9999", "vitorius@gmail.com", 3, "98.765.432/0001-10");
		PessoaJuridica pessoajuridica2=	new PessoaJuridica("Empresa Dos Cosmesticos", "R. da Praia, 139","(11) 33333-3333", "cosmeticossa@gmail.com", 6, "12.345.678/0001-90");
				
		
		pessoafisica1.visualizar();
		pessoafisica2.visualizar();
		pessoajuridica1.visualizar();
		pessoajuridica2.visualizar();
	}
}
