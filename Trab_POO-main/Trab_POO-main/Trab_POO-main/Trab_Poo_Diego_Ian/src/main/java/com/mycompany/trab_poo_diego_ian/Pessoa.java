package com.mycompany.trab_poo_diego_ian;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    
    Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    //get e set
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
