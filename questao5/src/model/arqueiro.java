package model;

import java.util.Scanner;

public class arqueiro extends personagem{

    Scanner sc = new Scanner(System.in);

    public arqueiro(String nome, int vida, int dano) {
        super(nome, vida, dano);
    }

    @Override
    public void atacar() {
        System.out.println("Informe o alvo:");
        String alvo = sc.next();
        if (encontrarPersonagem(alvo).getNome() == null){
            System.out.println("Alvo nao encontrado");
        } else {
            System.out.println("O " + encontrarPersonagem(alvo).getClass() + " " + alvo + " levou uma flechada e tomou " + getDano() + " de dano");
            encontrarPersonagem(alvo).setVida(getDano()-encontrarPersonagem(alvo).getVida());
            if (encontrarPersonagem(alvo).getVida() <= 0){
                System.out.println("e morreu");
                personagens.remove(encontrarPersonagem(alvo));
            }
        }
    }
}
