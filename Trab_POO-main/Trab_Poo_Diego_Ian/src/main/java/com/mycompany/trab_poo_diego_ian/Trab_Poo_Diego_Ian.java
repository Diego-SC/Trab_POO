package com.mycompany.trab_poo_diego_ian;

public class Trab_Poo_Diego_Ian {
    public static void main(String[] args) {
        Horario h = Horario.criarHorario(9, 6, 4);;
        h.toString();
        System.out.println(h.tempoDeAulaMinutos());
        
        Escola e = new Escola("CEFET", "Leopoldina", 1, 40, new Professor("bla", 60, "2226262", "Douglas"));
        
        
        
        e.adicionarProfessor(new Professor("dash", 321, "321543", "Ian"));
        
//      e.listarAlunos();
        e.listarProfessores();
        
        
    }
}
