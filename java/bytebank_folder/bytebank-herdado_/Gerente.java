//Gerente é um funcionárioAutenticavel, Gerente herda da class FuncionarioAutenticavel
public class Gerente extends Funcionario{
	private int senha;

	
	
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
		
	public double getBonificacao() {
		System.out.println("Bonificação Gerente");
		return 300;
		}
}
	
