package automovel.carro;

import java.util.Scanner;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public double motor = 1;
    public double velocidade = 0;
    double gasolina = 5;

    public Carro(double capacidadeTanque) {
        Scanner ler = new Scanner(System.in);

        double vlTanqueCheio = capacidadeTanque * gasolina;
        System.out.println("O valor para encher o tanque é " + vlTanqueCheio);
    }

    public Carro(String marca, String modelo, int ano, double motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public void girarChave() {
        System.out.println("Ligou ou desligou");
    }

    public void ligar() {
        if (motor > 0 && velocidade == 0) {
            System.out.println("Carro ligado.");
        } else {
            System.out.println("Não é possível ligar o carro.");
        }
    }

    public void desligar() {
        if (motor == 0) {
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Não é possível desligar o carro com o motor ligado.");
        }
    }

    public void acelerar() {
        if (velocidade >= 1 && velocidade < 180) {
            System.out.println("Acelerando...");
            velocidade += 10; // Aumenta a velocidade em 10 unidades
        } else if (velocidade == 180) {
            System.out.println("Você atingiu a velocidade máxima");
        }
    }

    public void frear() {
        if (velocidade >= 1) {
            System.out.println("Freando...");
            velocidade -= 10; // Diminui a velocidade em 10 unidades
        } else if (velocidade == 0) {
            System.out.println("Parado");
        }
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double vel) {
        this.velocidade = vel;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }
}
