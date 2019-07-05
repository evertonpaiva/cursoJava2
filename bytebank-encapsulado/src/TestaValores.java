
public class TestaValores {

	public static void main(String[] args) {		
		Conta conta = new Conta(3441, 3030);		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16589);
		Conta conta3 = new Conta(3658, 65852);
		
		System.out.println("Total de contas: " + Conta.getTotal() );
	}
}
