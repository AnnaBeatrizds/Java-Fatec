package aplicacao.Principal;
import automovel.carro.Carro;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

		 /* defina 1 método para calcular o valor total para encher o tanque.
		 Este deve receber como parâmetro o valor da gasolina, faça a lógica para ligar
		 (se tiver motor e estiver desligado) e desligar o carro, faça a lógica para
		 acelerar e frear o Carro até a capacidade do Carro (0 à 180); */

        System.out.print("Digite a capacidade do tanque: ");
        double capacidadeTanque = ler.nextDouble();

        Carro ford = new Carro(capacidadeTanque);
        ford.ligar(); // Ligue o carro
        ford.setVelocidade(5.0);
        ford.acelerar(); // Acelere o carro
        ford.acelerar(); // Acelere novamente
        //ford.acelerar();
        System.out.println("Velocidade: " + ford.getVelocidade());




    }

}