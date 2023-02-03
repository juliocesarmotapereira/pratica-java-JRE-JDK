
public class TesteConversao {
	
	public static void main(String[] args) {
		double salario = 1500.75;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrande = 123456789123456789L;
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
		System.out.println(.1 + .2);
	}

}
