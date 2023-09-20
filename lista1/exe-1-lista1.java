import java.util.Scanner;

 

public class Principal {

 

	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);


	System.out.println("Digite a sua idade:");

	int idade = ler.nextInt();
	if (idade >=60){
		System.out.println("Idosa");
	}
	else if (idade >=18){
		System.out.println("Adulto");
	}
	else {
		System.out.println("Criança");
	}

 

	}

 

}