package view;

import model.*;

public class Main {

    public static void main(String[] args) {

        personagem matias = new guerreiro("Matias", 10, 3);
        personagem irineu = new mago("Irineu", 6, 4);
        personagem hoob = new arqueiro("Hoob", 8, 5);

        matias.atacar();
        irineu.atacar();
        hoob.atacar();

        matias.atacarAlvo();
        irineu.atacarAlvo();
        hoob.atacarAlvo();


    }
}