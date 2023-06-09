

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta" + this.numero);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	//encapsulamento afim de reduzir o risco para acessar o saldo.
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
		if(numero <= 0) {
			System.out.println("Valor menor ou igual a zero não pode");
			return;
		}
	}

	public int getAgencia() {
		return this.numero;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a zero");
			return;
		}
		this.numero = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
	//public int getTotal() {
	//	return Conta.total;
	//}
}
	