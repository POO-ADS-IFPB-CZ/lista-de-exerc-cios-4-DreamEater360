package view;

import model.*;

public class Main {

    public static void main(String[] args) {

        guerreiro matias = new guerreiro("Matias", 10, 3);
        mago irineu = new mago("Irineu", 6, 4);
        arqueiro hoob = new arqueiro("Hoob", 8, 5);


        matias.atacar();
        matias.atacar();


    }
}