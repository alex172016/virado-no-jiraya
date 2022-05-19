package virado;
import java.util.Scanner;;

public class virado_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia ;
		Scanner sc = new Scanner(System.in);
	System.out.println("digite um numero");
	dia = sc.nextInt();
	
	
	
		switch (dia) {
		case 1:System.out.println("segunda feira");
		break;
		case 2: System.out.println("terca feira");	
		break;
		case 3:System.out.println("quarta feira");
		break;
		case 4:System.out.println("quinta feira");
		break;
		case 5:System.out.println("sexta feira");
		break;
		case 6:System.out.println("sabado");
		break;
		case 7:System.out.println("domingo");
		break;
		default:
			System.out.println("opcao invalida:");
			
		}
		
		

	}

}
