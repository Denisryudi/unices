
public class TesteGerente {

	public static void main(String[] args) {
		Gerente oswald = new Gerente();
		oswald.setNome("Oswald");
		oswald.setCpf("2321321321");
		oswald.setSalario(5000.00);
		
		System.out.println(oswald.getNome());
		System.out.println(oswald.getCpf());
		System.out.println(oswald.getSalario());

		
		oswald.setSenha(222222);
		boolean autenticou = oswald.autentica(55454);
		
		System.out.println(autenticou);
		
		System.out.println(oswald.getBonificacao());
	}

}
