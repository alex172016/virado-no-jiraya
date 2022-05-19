package carros;

public class carro_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
carrao carro_01 = new carrao();
carrao carro_02 = new carrao();
carrao carro_03 = new carrao();

carro_01.nome = "fusca bala";
carro_01.ano = 1985;
carro_01.modelo = "esportivo";

carro_02.nome = "ferrari";
carro_02.ano = 1900;
carro_02.modelo = "esportivo";

carro_03.nome = "mustang";
carro_03.ano = 2020;
carro_03.modelo = "esportivo";

System.out.println("carro_01");
System.out.println(carro_01.nome);
System.out.println(carro_01.ano);
System.out.println(carro_01.modelo);

System.out.println("\ncarro_02");
System.out.println(carro_02.nome);
System.out.println(carro_02.ano);
System.out.println(carro_02.modelo);

System.out.println("\ncarro_03");
System.out.println(carro_03.nome);
System.out.println(carro_03.ano);
System.out.println(carro_03.modelo);



	}
}
