package model;

import java.util.Scanner;

public class mago extends personagem{

    Scanner sc = new Scanner(System.in);

    public mago(String nome, int vida, int dano) {
        super(nome, vida, dano);
    }

    @Override
    public void atacar() {
        System.out.println("O mago solta uma magia de ataque com seu cajado!!!");
    }

    @Override
    public void atacarAlvo() {
        System.out.println("Informe o alvo:");
        String alvo = sc.next();
        if (encontrarPersonagem(alvo).getNome() == null){
            System.out.println("Alvo nao encontrado");
        } else {
            System.out.println("O " + encontrarPersonagem(alvo).getClass() + " " + alvo + " levou um ataque magico e tomou " + getDano() + " de dano");
            encontrarPersonagem(alvo).setVida(getDano()-encontrarPersonagem(alvo).getVida());
            if (encontrarPersonagem(alvo).getVida() > 0){
                System.out.println("e morreu");
                personagens.remove(encontrarPersonagem(alvo));
            }
        }
    }
}
