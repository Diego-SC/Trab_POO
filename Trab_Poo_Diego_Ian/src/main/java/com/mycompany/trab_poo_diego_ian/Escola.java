package com.mycompany.trab_poo_diego_ian;

import java.util.HashSet;

public class Escola {
    private String nome, endereco;
    private HashSet <Sala> salas = new HashSet<>();
    private HashSet <Aluno> alunos = new HashSet<>();
    private HashSet <Professor> professores = new HashSet<>();
    
    public Escola(String nome, String endereco, int numero, int capacidadeDaSala, Professor prof) {
        this.nome = nome;
        this.endereco = endereco;
        this.adicionarSala(new Sala(numero, capacidadeDaSala,this));
        this.adicionarProfessor(prof);
    }
    
    public void adicionarProfessor(Professor p){
        p.getEscolas().add(this);
        this.professores.add(p);
    }
    
    public void listarProfessores(){
        System.out.println("Professores: \n");
        for (Professor p : professores){
            System.out.println(p.toString() + "\n");
        }
    }
    
    public void adicionarAluno(Aluno a){
        this.alunos.add(a);
    }
    
    public void listarAlunos(){
        System.out.println("Alunos: \n");
        for (Aluno a : alunos){
            System.out.println(a.toString() + "\n");
        }
    }
    
    public void adicionarSala(Sala s){
        this.salas.add(s);
    }
    
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
