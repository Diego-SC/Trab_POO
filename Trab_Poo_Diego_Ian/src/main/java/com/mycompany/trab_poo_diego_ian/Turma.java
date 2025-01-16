package com.mycompany.trab_poo_diego_ian;

import java.util.ArrayList;

public class Turma {
    private String curso;
    private int anoTurma;
    private int numeroAlunos;
    private Sala sala;
    private ArrayList<Horario> hora =  new ArrayList<>();
    
    public Turma(String curso, int ano, int numAlunos, Sala sala, Horario hora){
        this.curso = curso;
        this.anoTurma = ano;
        this.numeroAlunos = numAlunos;
        this.sala = sala;
        sala.adicionarTurma(this);
        this.hora.add(hora);
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
    public int tempoAulaSemanalMinutos(){
        int total = 0;
        for (Horario h : this.hora){
            total += h.tempoDeAulaMinutos();
        }
        
        return total;
    }
    
}
