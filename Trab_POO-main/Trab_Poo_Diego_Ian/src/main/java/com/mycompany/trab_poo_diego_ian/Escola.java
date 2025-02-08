package com.mycompany.trab_poo_diego_ian;

import java.util.*;

public class Escola {
    private String nome, endereco;
    private ArrayList <Sala> salas = new ArrayList<>();
    private ArrayList <Aluno> alunos = new ArrayList<>();
    private ArrayList <Professor> professores = new ArrayList<>();
    
    public Escola(String nome, String endereco, int numero, int capacidadeDaSala, Professor prof) {
        this.nome = nome;
        this.endereco = endereco;
        this.salas.add(new Sala(numero, capacidadeDaSala, this));
        this.adicionarProfessor(prof);
    }
    
    @Override
    public String toString(){
        return "Escola: " + nome + "\nEndereço: " + endereco + "\n";
    }
    
    public void DemolirEscola(){
        for(Aluno a : alunos){
            a.setEscola(null);
        }
        alunos.clear();

        for(Sala s : salas){
            s.setEscola(null);
        }
        salas.clear();
        
        for(Professor p : professores){
            p.getEscolas().remove(this);
        }
        professores.clear();
    }
    
    public void adicionarProfessor(Professor p){
        p.getEscolas().add(this);
        this.professores.add(p);
    }
    public void removerProfessor(Professor p){
        if (professores.size() > 1){
            this.professores.remove(p);
            p.getEscolas().remove(this);
        }
        else
            System.out.println("A escola apresenta apenas um professor!");                
    }    
    public void listarProfessores(){
        System.out.println("Professores: ");
        for (Professor p : professores){
            System.out.println(p.toString() + "\n");
        }
    }
    public void removerAluno(Aluno a){
        this.alunos.remove(a);
        a.setEscola(null);
    }
    public void listarAlunos(){
        System.out.println("Alunos: ");
        for (Aluno a : alunos){
            System.out.println(a.toString());
        }
    }
    public void removerSala(Sala s){
        if (salas.size() > 1){
            this.salas.remove(s);
            s.setEscola(null);
        }
        else
            System.out.println("A escola apresenta apenas uma sala!");        
    }
    
    // get e set    
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
    public ArrayList<Sala> getSalas() {
        return salas;
    }
    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
}
