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
    
    @Override
    public String toString(){
        return "Escola: " + nome + "\nEndereço: " + endereco + "\n";
    }
    
    public void DemolirEscola(){
        for(Aluno a : alunos){
            a.setEscola(null);
            alunos.remove(a);
        }
        //this.alunos = null;
        
        for(Sala s : salas){
            for (Turma t : s.getTurmas()){
                t.setSala(null);
                s.getTurmas().remove(t);
            }
            
            s.setEscola(null);
            salas.remove(s);         
        }
        //this.salas = null;
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
        System.out.println("Professores: \n");
        for (Professor p : professores){
            System.out.println(p.toString() + "\n");
        }
    }
    
    public void adicionarAluno(Aluno a){
        this.alunos.add(a);
    }
    public void removerAluno(Aluno a){
        this.alunos.remove(a);
        a.setEscola(null);
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
    public HashSet<Sala> getSalas() {
        return salas;
    }
    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }
    public HashSet<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(HashSet<Aluno> alunos) {
        this.alunos = alunos;
    }
    public HashSet<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(HashSet<Professor> professores) {
        this.professores = professores;
    }
}
