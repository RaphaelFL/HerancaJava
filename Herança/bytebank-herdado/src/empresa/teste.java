package empresa;

public class teste {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.setSalario(2000.0);
		
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonifica());
		
		Funcionario f2  = new Funcionario();
		
		f2.setTipo(1);
		f2.setSalario(5000.0);
		
		System.out.println(f2.getTipo());
		System.out.println(f2.getBonifica());
		
	}
}
