package com.mycompany.trab_poo_diego_ian;

public class Turma {
    private String curso;
    private int anoTurma;
    private int numeroAlunos;
    
    Turma(String c, int a, int n){
        this.curso = c;
        this.anoTurma = a;
        this.numeroAlunos = n;
    }
    
    public int TempoAulaSemanalMinutos(){
        
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
}
