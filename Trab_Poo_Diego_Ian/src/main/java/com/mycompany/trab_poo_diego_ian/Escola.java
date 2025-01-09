package com.mycompany.trab_poo_diego_ian;

import java.util.HashSet;

public class Escola {
    private String nome, endereco;
    private HashSet <Sala> salas = new HashSet<>();

    public void adicionarSala(Sala s){
        this.salas.add(s);
    }
    
    public Escola(String nome, String endereco, int numero, int capacidadeDaSala, int numeroDeTurmas) {
        this.nome = nome;
        this.endereco = endereco;
        this.adicionarSala(new Sala(numero, capacidadeDaSala,numeroDeTurmas,this));
    }
    
    public Escola(String nome, String endereco, Sala sala) {
        this.nome = nome;
        this.endereco = endereco;
        this.salas.add(sala);
    }
    
    // criar metodos

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
