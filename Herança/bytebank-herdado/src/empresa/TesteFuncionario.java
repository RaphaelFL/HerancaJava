package empresa;

public class TesteFuncionario {

	public static void main(String[] args) {
	
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Step");
		nico.setCpf("222.222.222-69");
		nico.setSalario(2590.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonifica());
	}
}
