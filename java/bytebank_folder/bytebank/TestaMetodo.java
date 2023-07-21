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
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(1000);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(1250, contaDoPaulo)) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Faltou dinheiro!");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}
