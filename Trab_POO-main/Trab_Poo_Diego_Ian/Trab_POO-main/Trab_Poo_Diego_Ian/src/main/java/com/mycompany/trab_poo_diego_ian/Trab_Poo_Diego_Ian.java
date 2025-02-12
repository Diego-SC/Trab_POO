package com.mycompany.trab_poo_diego_ian;
import java.util.*;

public class Trab_Poo_Diego_Ian {
    public static void main(String[] args) {
        Professor p1 = new Professor("123", "123", "Matheus");
        Escola e1 = new Escola("CEFET", "Leopoldina", 101, 5, p1);
        
        Horario h1 = Horario.criarHorario(7, 12, 2);
        
        Turma t1 = new Turma("POO", 2025, e1.getSalas().get(0), h1, p1);
                
        Aluno a1 = new Aluno("123", 12, "999", "Ian", e1, t1);
        Aluno a2 = new Aluno("222", 32, "321", "Aluno 2", e1, t1);
        Aluno a3 = new Aluno("333", 13, "213", "Aluno 3", e1, t1);
        Aluno a4 = new Aluno("444", 54, "867", "Aluno 4", e1, t1);
        Aluno a5 = new Aluno("555", 76, "456", "Aluno 5", e1, t1);
        
        // MOSTRAR PARA O MATHEUS
        System.out.println(e1);
        System.out.println("-----------------------------------------");
        e1.listarAlunos();
        System.out.println("-----------------------------------------");

        e1.listarProfessores();
        System.out.println("-----------------------------------------");
        
        // COMENTAR COM MATHEUS SOBRE DUPLICATAS DE SALAS
        Sala s2 = new Sala(102, 10, e1);
        Sala s1 = new Sala(100, 5, e1);
        
        System.out.println("Salas:");
        for (Sala s : e1.getSalas()){
            System.out.println(s);
        }
        System.out.println("-----------------------------------------");
        
        System.out.println("Turma t1:");
        System.out.println(t1);
        
        System.out.println("-- Apagamos a Escola e a Turma --");

        // DELETAMOS TUDO A PARTIR DAQUI
        e1.DemolirEscola();
        t1.pontapearTurma();
        
        System.out.println(e1);
        System.out.println("-----------------------------------------");
        e1.listarAlunos();
        System.out.println("-----------------------------------------");

        e1.listarProfessores();
        System.out.println("-----------------------------------------");
        
        System.out.println("Salas:");
        for (Sala s : e1.getSalas()){
            System.out.println(s);
        }
        System.out.println("-----------------------------------------");
        
        System.out.println("Turma t1:");
        System.out.println(t1);
    }
}
