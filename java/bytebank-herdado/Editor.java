
public class Editor extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Bonificação Editor");
		return super.getSalario() * 30;
		
	}
}
