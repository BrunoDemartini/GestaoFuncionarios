package empresa;

public class Gerente extends Funcionario { 
	
	//variaveis exclusivas do gerente
	private String setor;
	private int nivel;
	
	//getters e setters do diretor
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
		
	}
	
	//bonificação anual
	public void bonificar() {
		double salario = this.getSalario();
		this.setSalario(salario+salario*0.5);
	}
	
	
}
