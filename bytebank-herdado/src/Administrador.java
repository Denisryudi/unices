
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	
	public Administrador() {
		AutenticacaoUtil autenticador = new AutenticacaoUtil();
	}
	
	
	@Override
	public double getBonificacao() {
		return 100;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	
	
	
}
