package virado;

public class virado_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario_atual = 70.000;
		double segunda_faixa = 9.70/100;
		double terceira_faixa = 37.35/100;
		double salario_inicial = 3100;
		
		if (salario_atual <=30.100) {
			salario_atual = salario_atual + salario_inicial;
			System.out.println("salario inicial:" + salario_atual);
		}else if
		(salario_atual >= 30.100 && salario_atual <= 80.800){
			salario_atual = salario_atual * segunda_faixa;
			System.out.println("segunda faixa salarial: " + salario_atual);
		
		}else if (salario_atual >= 80.900 && salario_atual <= 100.0600)
			{salario_atual = salario_atual * terceira_faixa;
			System.out.println("terceira faixa salarial: " + salario_atual);
			}
			else{
				System.out.println("salario acima da media:");
			}
				
		   
		}
	}

