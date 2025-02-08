package com.mycompany.trab_poo_diego_ian;

import java.util.ArrayList;

public class Turma {
    private String curso;
    private int anoTurma;
    private int numeroAlunos;
    private Sala sala;
    private Professor prof;

    private ArrayList<Horario> horas =  new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    
    public Turma(String curso, int ano, Sala sala, Horario hora, Professor p){
        this.curso = curso;
        this.anoTurma = ano;
        
        this.sala = sala;
        this.sala.adicionarTurma(this);
        
        this.horas.add(hora);
        
        this.prof = p;
        p.getTurmas().add(this);
        p.aumentarAulas(1);
    }
    
    @Override
    public String toString(){
        String professor;
        int numSala;
        if (sala == null){
            numSala = 0;
            professor = null;
        }
        else{
            numSala = sala.getNumero();
            professor = prof.getNome();
        }
            
        return "Curso: " + curso + "\nAno: " + anoTurma +
               "\nAlunos: " + numeroAlunos + "\nProfessor: " + professor +
               "\nSala: " + numSala +
               "\nTempo de Aula Semanal: " + this.tempoAulaSemanalMinutos() + "\n";
    }
    
    //Pontapear = chutar
    public void pontapearTurma(){
        
        //Remover de Salas
        sala.getTurmas().remove(this);
        sala = null;
        
        //Remover de Professores
        prof.getTurmas().remove(this);
        prof = null;
        
        horas.clear();
        this.numeroAlunos = 0;
        
        //Remover de Alunos
        for(Aluno a : alunos){
            a.getTurmas().remove(this);
        }
        alunos.clear();
    }
    
    public void aumentarNumAlunos(){
        this.numeroAlunos++;
    }
    public void diminuirNumAlunos(){
        this.numeroAlunos--;
    }
    
    public void adicionarAluno(Aluno a){
        if (alunos.size() < sala.getCapacidadeDaSala()){
            this.alunos.add(a);
            aumentarNumAlunos();
            a.getTurmas().add(this);
        }
        else
            System.out.println("A sala está cheia.\n");
    }
    public void removeAluno(Aluno a){
        this.alunos.remove(a);
        diminuirNumAlunos();
        a.getTurmas().remove(this);
    }
    
    public void adicionarHora(Horario h){
        if (h == null){
            System.out.println("Impossível inserir o horário pois é inválido.");
            return;
        }
        
        this.horas.add(h);
        this.prof.aumentarAulas(1);
    }
    public void removeHora(Horario h){
        if(this.horas.size() > 1){
            this.horas.remove(h);
            this.prof.diminuirAulas(1);
        }
        else
            System.out.println("A turma apresenta apenas um horário!");
    }
    
    public int tempoAulaSemanalMinutos(){
        int total = 0;
        for (Horario h : this.horas){
            total += h.tempoDeAulaMinutos();
        }
        
        return total;
    }
    
    // get e set
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
        sala.getTurmas().add(this);
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
    public ArrayList<Horario> getHoras() {
        return horas;
    }
    public void setHoras(ArrayList<Horario> horas) {
        this.horas = horas;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> aluno) {
        this.alunos = aluno;
    }
    public Professor getProf() {
        return prof;
    }
    public void trocarProfessor(Professor prof) { // setProfessor
        this.prof.getTurmas().remove(this);
        this.prof.diminuirAulas(this.horas.size());
        this.prof = prof;
        prof.aumentarAulas(this.horas.size());
        prof.getTurmas().add(this);
    }
    
}
