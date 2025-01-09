package com.mycompany.trab_poo_diego_ian;
import java.util.HashMap;

public class Horario {
    private int horaInicio, horaFim, diaDaSemana;
    private static HashMap <Integer, String> diaSemana = new HashMap<>();;
    
    static public void preencheMapDiaSemana(){
        diaSemana.put(1, "Segunda");
        diaSemana.put(2, "Terça");
        diaSemana.put(3, "Quarta");
        diaSemana.put(4, "Quinta");
        diaSemana.put(5, "Sexta");
        diaSemana.put(6, "Sábado");
        diaSemana.put(7, "Domingo");
    }

    public Horario(int horaInicio, int horaFim, int diaDaSemana) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        // ajustar horário de fim sempre ser maior que inicio
        this.diaDaSemana = diaDaSemana;
        preencheMapDiaSemana();
    }
    
    @Override
    public String toString(){
        return diaSemana.get(diaDaSemana) + ", de " + horaInicio + "h até " + horaFim +"h";
    }
    
    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }

    public int getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(int diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public static HashMap<Integer, String> getDiaSemana() {
        return diaSemana;
    }

    public int tempoDeAulaMinutos(){
        return (horaFim - horaInicio)*60; //
    }
    
}
