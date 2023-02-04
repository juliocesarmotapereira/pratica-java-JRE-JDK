
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoa = 3;

		if (idade >= 18) {
			System.out.println("você tem mais 18 anos");
			System.out.println("seja bem-vindo");
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("você não tem 18 anos, mais pode entrar, pois está acompanhado.");
			} else {
				System.out.println("infelizemnte você não pode entrar");
			}
		}
	}
}
