package empresa;

public class Diretor extends Gerente {
	
	//variaveis exclusivas do diretor
	String departamento;
	Double vptl;
	
	//getters e setters do diretos
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	public Double getVptl() {
		return vptl;
	}
	public void setVptl(Double vptl) {
		this.vptl = vptl;
	}
	
	//bonificação anual 
	public void bonificar() {
		double salario = this.getSalario();
		this.setSalario(salario+salario*0.8);
	}
	

}
