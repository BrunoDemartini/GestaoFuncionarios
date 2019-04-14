package empresa;

public class Geral {

	public static void main(String[] args) {
		
		double vAnual;
		double vBoni;
	
		//Colocando funcionarios comuns
		Funcionario f1 = new Funcionario();
		f1.setNome("Plinio");
		f1.setdNascimento("02/06/1995");
		f1.setdIngresso("14/04/2018");
		f1.setBanco("Santander");
		f1.setContaCorrente(1401);
		f1.setdHoras(4);
		f1.setSalario(1500);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("João");
		f2.setdNascimento("21/11/2000");
		f2.setdIngresso("13/06/2018");
		f2.setBanco("Santander");
		f2.setContaCorrente(1537);
		f2.setdHoras(4);
		f2.setSalario(1500);
		
		Funcionario f3 = new Funcionario();
		f3.setNome("Claudio");
		f3.setdNascimento("03/05/1998");
		f3.setdIngresso("25/06/2017");
		f3.setBanco("Santander");
		f3.setContaCorrente(1426);
		f3.setdHoras(4);
		f3.setSalario(1500);
		
		//Colocando Gerentes
		Gerente g1 = new Gerente();
		g1.setNome("Roberto");
		g1.setdNascimento("12/02/1986");
		g1.setdIngresso("22/11/2017");
		g1.setBanco("Santander");
		g1.setContaCorrente(1412);
		g1.setdHoras(2);
		g1.setSalario(3000);
		g1.setSetor("Administrativo");
		g1.setNivel(2);
		
		Gerente g2 = new Gerente();
		g2.setNome("Maria");
		g2.setdNascimento("31/03/1982");
		g2.setdIngresso("02/10/2016");
		g2.setBanco("Santander");
		g2.setContaCorrente(1437);
		g2.setdHoras(2);
		g2.setSalario(3000);
		g2.setSetor("Vendas");
		g2.setNivel(1);
		
		//Colocando Diretores
		Diretor d1 = new Diretor();
		d1.setNome("Bruno");
		d1.setdNascimento("14/10/1985");
		d1.setdIngresso("25/08/2015");
		d1.setBanco("Santander");
		d1.setContaCorrente(1456);
		d1.setdHoras(1);
		d1.setSalario(5000);
		d1.setSetor("Administrativo");
		d1.setNivel(2);
		d1.setDepartamento("Administrativo");
		d1.setVptl(2.5);
		
		//calculando os gastos com salario e bonificação
		vAnual = f1.getSalario()+f2.getSalario()+f3.getSalario()+g1.getSalario()+g2.getSalario()+d1.getSalario();
		vBoni = (f1.getSalario()*0.25)+(f2.getSalario()*0.25)+(f3.getSalario()*0.25)+
				(g1.getSalario()*0.5)+(g2.getSalario()*0.5)+(d1.getSalario()*0.8);
		
		//printando os resultados 
		System.out.println("valor Anual do Salario: "+vAnual+"R$\n"+"Valor anual das Bonificações: "+vBoni+"R$\n\n");
		
		//ordem dos funcionarios
		System.out.println(d1.getNome()+" - Salario: "+d1.getSalario()+" - Bonificação: "+d1.getSalario()+d1.getSalario()*0.8);	
		System.out.println(g1.getNome()+" - Salario: "+g1.getSalario()+" - Bonificação: "+g1.getSalario()+g1.getSalario()*0.5);
		System.out.println(g2.getNome()+" - Salario: "+g2.getSalario()+" - Bonificação: "+g2.getSalario()+g2.getSalario()*0.5);
		System.out.println(f1.getNome()+" - Salario: "+f1.getSalario()+" - Bonificação: "+f1.getSalario()+f1.getSalario()*0.25);
		System.out.println(f2.getNome()+" - Salario: "+f2.getSalario()+" - Bonificação: "+f2.getSalario()+f2.getSalario()*0.25);
		System.out.println(f3.getNome()+" - Salario: "+f3.getSalario()+" - Bonificação: "+f3.getSalario()+f3.getSalario()*0.25);
		
	}
	
}
