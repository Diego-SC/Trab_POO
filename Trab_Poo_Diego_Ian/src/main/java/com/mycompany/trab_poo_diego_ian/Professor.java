package com.mycompany.trab_poo_diego_ian;

public class Professor extends Pessoa{
    private String siape;
    private int numeroAulasMinistradas;

    public Professor(String siape, int numeroAulasMinistradas, String c, String n) {
        super(c, n);
        this.siape = siape;
        this.numeroAulasMinistradas = numeroAulasMinistradas;
    }

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
}
