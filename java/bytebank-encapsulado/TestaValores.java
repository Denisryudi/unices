
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		Conta conta1 = new Conta(233, 23233);
		Conta conta3 = new Conta(233, 23234);
		
		System.out.println(Conta.getTotal());
	}
}
