package calculo;
import java.util.Scanner;



public class calculadora {
	Scanner sc = new Scanner(System.in);
	float num01;
	int num02;
	float result;
	
	public void soma() {
	System.out.println("digite um numero");	
	num01 = sc.nextInt();
	System.out.println("digite segundo numero");	
	num02 = sc.nextInt();
	System.out.println(num01 + num02);
	
	}
	public void dividir() {
		System.out.println("digite um numero");
		num01 = sc.nextFloat();
		result = (num01 % 2);
		if (result  == 0   ) {
			System.out.println("o resultado eh par:" );
			
		}else {
			System.out.println("resultado e inpar")
			;
		}
		}	
		public void somaVarArgs(int...numero) {
			int soma = 0;
			for(int i: numero) {
				soma += i;
			}
			System.out.println(soma);
		}
	}


