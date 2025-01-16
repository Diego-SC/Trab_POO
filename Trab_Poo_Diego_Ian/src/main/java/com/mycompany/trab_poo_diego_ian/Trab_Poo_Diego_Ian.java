package com.mycompany.trab_poo_diego_ian;

public class Trab_Poo_Diego_Ian {
    public static void main(String[] args) {
        Horario h = Horario.criarHorario(9, 6, 4);;
        h.toString();
        System.out.println(h.tempoDeAulaMinutos());
        
        Escola e = new Escola("CEFET", "Leopoldina", 1, 40, new Professor("bla", 60, "2226262", "Douglas"));
        
        e.adicionarAluno(new Aluno("123", 18, "123456789", "Ian", e));
        e.adicionarAluno(new Aluno("312", 18, "392173891", "Diego", e));
        
        e.adicionarProfessor(new Professor("dash", 321, "321543", "Ian"));
        
//      e.listarAlunos();
        e.listarProfessores();
        
        
    }
}
