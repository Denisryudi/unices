
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Joaquim");
		g1.setSalario(1000);
		
		Designer d1 = new Designer();
		d1.setNome("Oswald");
		d1.setSalario(1500);
		
		Editor e1 = new Editor();
		e1.setNome("Gilmar");
		e1.setSalario(1000);
		
		ControleBonificacao control = new ControleBonificacao();
		
		control.registra(g1);
		control.registra(d1);
		control.registra(e1);
		
		System.out.println(control.getSoma());
		System.out.println();
	}
}
