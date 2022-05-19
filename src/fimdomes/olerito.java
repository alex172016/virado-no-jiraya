package fimdomes;

public class olerito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salario funcionario01 = new salario();
		salario funcionario02 = new salario();
		salario funcionario03 = new salario();

		funcionario01.setNome("alex"); 
		funcionario01.setIdade(39);
		funcionario01.setSal(2010);

		funcionario02.setNome("arthur");
		funcionario02.setIdade(6);
		funcionario02.setSal(1900);

		funcionario03.setNome("vanessa");
		funcionario03.setIdade(38);
		funcionario03.setSal(2010);
		
		System.out.println(funcionario01.getNome());
		System.out.println(funcionario01.getIdade());
		System.out.println(funcionario01.getSal());
		
		System.out.println(funcionario02.getNome());
		System.out.println(funcionario02.getIdade());
		System.out.println(funcionario02.getSal());
		
		System.out.println(funcionario03.getNome());
		System.out.println(funcionario03.getIdade());
		System.out.println(funcionario03.getSal());
		

	}
	
}
