
public class Editor extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Editor() {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação Editor");
		return super.getSalario();

		
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
