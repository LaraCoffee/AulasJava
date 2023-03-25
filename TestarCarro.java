package aula3;

import aula3.Carro;
public class TestarCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "goleta";
        carro.marca = "volkswagen das auto";
        carro.ano = 1997;
        carro.vel = 30;
        carro.acelerar(20);

        System.out.println(carro.nome);
        System.out.println(carro.marca);
        System.out.println(carro.ano);
        System.out.println("velocidade do carro "+carro.vel+"km/h");
        carro.freiar(50);
        System.out.println("a velocidade foi reduzida a "+carro.vel+"km/h");
        
    }
}