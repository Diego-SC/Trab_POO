package com.mycompany.trab_poo_diego_ian;

public class Aluno extends Pessoa{
    private String matricula;
    private int idade;
    private Escola escola;
    
    Aluno(String m, int i, String cpf, String nome, Escola escola){
        super(cpf, nome);
        this.matricula = m;
        this.idade = i;
        this.escola = escola;
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
