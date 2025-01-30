package com.mycompany.trab_poo_diego_ian;

import java.util.ArrayList;

public class Sala {
    private int numero,  capacidadeDaSala, numeroDeTurmas;
    private Escola escola;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Sala(int numero, int capacidadeDaSala, Escola escola) {
        this.numero = numero;
        this.capacidadeDaSala = capacidadeDaSala;
        this.escola = escola;
    }
    
    @Override
    public String toString(){
        return "Sala: " + numero + "\nEscola: " + escola.getNome() + "\nCapacidade: " + capacidadeDaSala + "\nTurmas: " + numeroDeTurmas + "\n";
    }
    
    public void adicionarTurma(Turma t){
        this.turmas.add(t);
        this.numeroDeTurmas++;
        t.setSala(this);
    }
    
    public void trocarSala(Turma t, Sala s){
        this.turmas.remove(t);
        this.numeroDeTurmas--;
        t.setSala(s);
    }

    // get e set
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCapacidadeDaSala() {
        return capacidadeDaSala;
    }
    public void setCapacidadeDaSala(int capacidadeDaSala) {
        this.capacidadeDaSala = capacidadeDaSala;
    }
    public int getNumeroDeTurmas() {
        return numeroDeTurmas;
    }
    public void setNumeroDeTurmas(int numeroDeTurmas) {
        this.numeroDeTurmas = numeroDeTurmas;
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
