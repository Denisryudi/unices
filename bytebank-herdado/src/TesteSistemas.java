
public class TesteSistemas {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSenha(2222); 
		
		Autenticavel a1 = new Administrador();
		a1.setSenha(21321);
		
		Autenticavel c1 = new Cliente();
		c1.setSenha(2222);
		 
		SistemaInterno validacao = new SistemaInterno();
		 
		validacao.autentica(a1);
		validacao.autentica(g1);
		validacao.autentica(c1);
		 
		System.out.println(a1);
		 

	}
}
