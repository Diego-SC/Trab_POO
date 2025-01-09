package com.mycompany.trab_poo_diego_ian;

public class Aluno extends Pessoa{
    private String matricula;
    private int idade;
    
    Aluno(String m, int i, String cpf, String nome){
        super(cpf, nome);
        this.matricula = m;
        this.idade = i;
    }
    
    @Override
    public String toString(){
        return "Matrícula: " + this.matricula + "\nIdade: " + this.idade + "\nNome: " + getNome() + "\nCPF: " + getCpf();
    }

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
}
