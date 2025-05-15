package model;

import java.util.ArrayList;
import java.util.Objects;

public abstract class personagem {

    private String nome;
    private int vida;
    private int dano;

    protected static ArrayList<personagem> personagens = new ArrayList<>();

    public personagem(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        adicionarInstancia(this);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void atacar();

    protected void adicionarInstancia(personagem instancia) {
        personagens.add(instancia);
    }

    protected personagem encontrarPersonagem(String nome) {
        for (personagem Personagem : personagens) {
            if (Objects.equals(nome, Personagem.getNome())){
                return Personagem;
            }
        }
        return null;
    }
}
