package empresa;

public class Funcionario {
	
	//informações padroes que servem para o funcionario comum e como herança(Gerente e Diretor)
	private String nome;
	private String dNascimento;
	private String dIngresso;
	private String banco;
	private int contaCorrente;
	private double dHoras;
	private double salario;
	
	//getters e setters padrões que servem como herança para os demais(gerente e diretor)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getdNascimento() {
		return dNascimento;
	}
	public void setdNascimento(String dNascimento) {
		this.dNascimento = dNascimento;
	}
	
	
	public String getdIngresso() {
		return dIngresso;
	}
	public void setdIngresso(String dIngresso) {
		this.dIngresso = dIngresso;
	}
	
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	
	public int getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(int contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	
	
	public double getdHoras() {
		return dHoras;
	}
	public void setdHoras(double dHoras) {
		this.dHoras = dHoras;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	//bonificação anual
	public void bonificar() {
		this.salario = salario + salario*0.25;
	}
	
}
