package com.mycompany.trab_poo_diego_ian;

import java.util.*;

public class Aluno extends Pessoa{
    private String matricula;
    private int idade;
    private Escola escola;
    private ArrayList<Turma> turmas =  new ArrayList<>();
    
    public Aluno(String matricula, int idade, String cpf, String nome, Escola escola, Turma t){
        super(cpf, nome);
        this.matricula = matricula;
        this.idade = idade;
        
        this.escola = escola;
        this.escola.getAlunos().add(this);
        
        t.adicionarAluno(this);
    }
    
    @Override
    public String toString(){
        return "Matrícula: " + this.matricula + "\nIdade: " + this.idade + "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\n";
    }
    
    public void adicionarTurma(Turma t){
        this.turmas.add(t);
        t.aumentarNumAlunos();
        t.getAlunos().add(this);   
    }
    
    public void removeTurma(Turma t){
        if(turmas.size() > 1){
            t.diminuirNumAlunos();
            this.turmas.remove(t); 
            t.getAlunos().remove(this);
        }
       else
            System.out.println("O aluno precisa estar em pelo menos uma turma.");
    }
    
    // get e set
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Escola getEscola() {
        return escola;
    }
    public void setEscola(Escola escola) {
        this.escola = escola;
    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
