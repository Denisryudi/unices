package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contatest = new Conta();
		contatest.saldo = 100;
		contatest.deposita(800);
		
		System.out.println(contatest.saldo);
		boolean conseguiuRetirar = contatest.saca(800);
		System.out.println(conseguiuRetirar);
		System.out.println(contatest.saldo);
	}

}
