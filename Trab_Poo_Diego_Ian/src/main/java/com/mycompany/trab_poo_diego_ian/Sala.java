package com.mycompany.trab_poo_diego_ian;

import java.util.ArrayList;

public class Sala {
    private int numero,  capacidadeDaSala, numeroDeTurmas;
    private Escola escola;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Sala(int numero, int capacidadeDaSala, Escola escola) {
        this.numero = numero;
        this.capacidadeDaSala = capacidadeDaSala;
        this.numeroDeTurmas = 0;
        this.escola = escola;
    }
    
    public void adicionarTurma(Turma t){
        this.turmas.add(t);
        this.numeroDeTurmas++;
        t.setSala(this);
    }
    
    public void trocarTurma(Turma t, Sala s){
        this.turmas.remove(t);
        this.numeroDeTurmas--;
        t.setSala(s);
    }

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
}
