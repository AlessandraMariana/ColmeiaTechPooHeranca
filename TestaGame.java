package PooHeranca;

public class TestaGame {

	public static void main(String[] args) {
		 
		Jogo jogo1 = new Jogo("GTA V","É um jogo eletrônico de ação-aventura desenvolvido pela Rockstar North e publicado pela Rockstar Games", 100.89, 100, "Steam");
        Jogo jogo2 = new Jogo("Resident Evil 7","Medo e isolamento se infiltram nas paredes de uma casa de campo abandonada",14.90, 30,  "Xbox Series X|S");

        Console console1 = new Console("PlayStation 5","É a evolução lógica para qualquer gamer que tenha um PlayStation 4 ou PlayStation 4 Pro.", 4999.99, 150, "Sony");
        Console console2 = new Console("Xbox Series X","Oferece taxas de quadro extraordinariamente estáveis de até 120 FPS com o pop visual de HDR.", 4799.99, 100, "Microsoft");

        jogo1.visualizar();
        System.out.println();
        jogo2.visualizar();
        System.out.println();
        console1.visualizar();
        System.out.println();
        console2.visualizar();
	}
}
