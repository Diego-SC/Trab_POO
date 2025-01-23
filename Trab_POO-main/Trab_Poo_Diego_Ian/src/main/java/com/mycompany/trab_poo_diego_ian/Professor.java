package com.mycompany.trab_poo_diego_ian;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private String siape;
    private int numeroAulasMinistradas;
    private ArrayList <Escola> escolas = new ArrayList<>();
    private ArrayList <Turma> turmas = new ArrayList<>();

    public Professor(String siape, String cpf, String nome) {
        super(cpf, nome);
        this.siape = siape;
    }
    
    public Professor(String siape, String cpf, String nome, Escola e) {
        super(cpf, nome);
        this.siape = siape;
        this.escolas.add(e);
    }
    
    @Override
    public String toString(){
        return "SIAPE: " + this.siape + "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nEscolas: " + this.escolas.size() + "\n";
    }
    
    public void trocaTurmasProfessores(Turma t){
        t.trocarProfessor(this);
    }
    
    public void aumentarAulas(int n){
        this.numeroAulasMinistradas += n;
    }
    public void diminuirAulas(int n){
        this.numeroAulasMinistradas -= n;
    }
  
    public void adicionarEscola(Escola e){
        e.adicionarProfessor(this);
    }  
    public void removerEscola(Escola e){
        this.escolas.remove(e);
    }
    
    //get e set
    public String getSiape() {
        return siape;
    }
    public void setSiape(String siape) {
        this.siape = siape;
    }
    public int getNumeroAulasMinistradas() {
        return numeroAulasMinistradas;
    }
    public void setNumeroAulasMinistradas(int numeroAulasMinistradas) {
        this.numeroAulasMinistradas = numeroAulasMinistradas;
    }
    public ArrayList<Escola> getEscolas() {
        return escolas;
    }
    public void setEscolas(ArrayList<Escola> escolas) {
        this.escolas = escolas;
    }    
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
     
}
