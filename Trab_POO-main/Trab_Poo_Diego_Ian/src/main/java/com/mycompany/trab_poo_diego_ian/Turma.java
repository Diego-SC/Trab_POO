package com.mycompany.trab_poo_diego_ian;

import java.util.ArrayList;

public class Turma {
    private String curso;
    private int anoTurma;
    private int numeroAlunos;
    private Sala sala;
    private Professor prof;

    private ArrayList<Horario> hora =  new ArrayList<>();
    private ArrayList<Aluno> aluno = new ArrayList<>();
    
    public Turma(String curso, int ano, Sala sala, Horario hora, Professor p){
        this.curso = curso;
        this.anoTurma = ano;
        this.sala = sala;
        sala.adicionarTurma(this);
        this.hora.add(hora);
        this.prof = p;
    }
    
    public void aumentar(){
        this.numeroAlunos++;
    }
    public void diminuir(){
        this.numeroAlunos--;
    }
    
    public void adicionarAluno(Aluno a){
        this.aluno.add(a);
        aumentar();
        a.getTurmas().add(this);
    }
    
    public void removeAluno(Aluno a){
        this.aluno.remove(a);
        diminuir();
        a.getTurmas().remove(this);
    }
    
    public void adicionarHora(Horario h){
        this.hora.add(h);
    }
    
    public void removeHora(Horario h){
        if(this.hora.size() > 1)
            this.hora.remove(h);
        else
            System.out.println("A turma apresenta apenas um horário!");
    }
    
    public int tempoAulaSemanalMinutos(){
        int total = 0;
        for (Horario h : this.hora){
            total += h.tempoDeAulaMinutos();
        }
        
        return total;
    }
    
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
        sala.adicionarTurma(this);
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getAnoTurma() {
        return anoTurma;
    }
    public void setAnoTurma(int anoTurma) {
        this.anoTurma = anoTurma;
    }
    public int getNumeroAlunos() {
        return numeroAlunos;
    }
    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }
    public ArrayList<Horario> getHora() {
        return hora;
    }
    public ArrayList<Aluno> getAluno() {
        return aluno;
    }
    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }
    public Professor getProf() {
        return prof;
    }
    public void trocarProfessor(Professor prof) {
        this.prof.getTurmas().remove(this);
        this.prof = prof;
        prof.getTurmas().add(this);
    }
    
}
