
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Joaquim");
		g1.setSalario(1000);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Pedrinho");
		f1.setSalario(1000);
		
		Editor e1 = new Editor();
		e1.setNome("Gilmar");
		e1.setSalario(1000);
		
		ControleBonificacao control = new ControleBonificacao();
		
		control.registra(g1);
		control.registra(f1);
		control.registra(e1);
		
		System.out.println(control.getSoma());
		
	}
}
