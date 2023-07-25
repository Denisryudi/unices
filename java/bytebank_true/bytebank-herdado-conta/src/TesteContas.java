
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.deposita(100.0);
		
		ContaPoupanca pc = new ContaPoupanca(222, 222);
		pc.deposita(200.0);
		
		cc.transfere(10.0, pc);

		System.out.println(cc.getSaldo());
		System.out.println(pc.getSaldo());
		
		
		
		
	}
}
