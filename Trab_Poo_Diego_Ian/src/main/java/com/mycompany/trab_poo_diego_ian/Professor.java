package com.mycompany.trab_poo_diego_ian;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private String siape;
    private int numeroAulasMinistradas;
    private ArrayList <Escola> escolas = new ArrayList<>();

    public Professor(String siape, int numeroAulasMinistradas, String c, String n) {
        super(c, n);
        this.siape = siape;
        this.numeroAulasMinistradas = numeroAulasMinistradas;
    }
    
    public Professor(String siape, int numeroAulasMinistradas, String c, String n, Escola e) {
        super(c, n);
        this.siape = siape;
        this.numeroAulasMinistradas = numeroAulasMinistradas;
        this.escolas.add(e);
    }
    @Override
    public String toString(){
        return "SIAPE: " + this.siape + "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nEscolas: " + this.escolas.size();
    }
  
    public void adicionarEscola(Escola e){
        e.adicionarProfessor(this);
    }
    
    public void removerEscola(Escola e){
        this.escolas.remove(e);
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

    public ArrayList<Escola> getEscolas() {
        return escolas;
    }
    
    
}
