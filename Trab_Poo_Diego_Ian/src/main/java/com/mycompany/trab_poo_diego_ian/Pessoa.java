package com.mycompany.trab_poo_diego_ian;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    
    Pessoa(String c, String n){
        this.cpf = c;
        this.nome = n;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
}
