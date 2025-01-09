package com.mycompany.trab_poo_diego_ian;

public class Sala {
    private int numero,  capacidadeDaSala, numeroDeTurmas;

    public Sala(int numero, int capacidadeDaSala, int numeroDeTurmas) {
        this.numero = numero;
        this.capacidadeDaSala = capacidadeDaSala;
        this.numeroDeTurmas = numeroDeTurmas;
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
