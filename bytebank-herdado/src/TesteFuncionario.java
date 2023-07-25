
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Editor nico = new Editor();
		nico.setNome("Nico Steppat");
		nico.setCpf("32132132131");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
