package Tela.Cliente;

import java.util.ArrayList;

public class CalculadoraNumeros {
	public static double calcularMedia(ArrayList<Integer> numeros) {
		
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("Insira todo os números!");
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.size();
    }

}
