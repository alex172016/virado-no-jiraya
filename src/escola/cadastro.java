package escola;

public class cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
estudante aluno01 = new estudante();
estudante aluno02 = new estudante();
impressora imprime = new impressora();

aluno01.nome ="alex";
aluno01.idade = 39;
aluno01.sexo = "maculino";

aluno02.nome ="vanessa";
aluno02.idade = 38;
aluno02.sexo = "feminino";

imprime.imprimir(aluno01);
imprime.imprimir(aluno02);



	}

}
