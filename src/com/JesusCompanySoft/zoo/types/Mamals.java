package com.JesusCompanySoft.zoo.types;

import com.JesusCompanySoft.zoo.Animals.Animals;

public class Mamals extends Animals {
    double peso;
    String habitos;                         //diurnos, nocturnos
    double velocidadDesplazamiento;
    String dieta;                           //carnívora, herbívora, omnívora

    public Mamals(String nombre, int edad, String genero, int espacio, double peso, String habitos, double velocidadDesplazamiento, String dieta) {
        super(nombre, edad, genero, espacio);
        this.peso = peso;
        this.habitos = habitos;
        this.velocidadDesplazamiento = velocidadDesplazamiento;
        this.dieta = dieta;
    }

    public Mamals() {

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public double getVelocidadDesplazamiento() {
        return velocidadDesplazamiento;
    }

    public void setVelocidadDesplazamiento(double velocidadDesplazamiento) {
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String generarHabitoAleatorio(){
        Animals a=new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(1, 2);
        if(numRandom==1){
            return "DIURNO";
        }else{
            return "NOCTURNO";
        }
    }

    public String generarDietaAleatorio(){
        Animals a=new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(1, 3);
        switch (numRandom){
            case 1:
                return "HERBÍBORO";
            case 2:
                return "OMNÍVORO";
            case 3:
                return "CARNÍVORO";
            default:
                return "FALLO";
        }
    }

    public Mamals generarMamalsAleatorio(int i){
        Animals a = new Animals();
        Mamals mama = new Mamals();
        double numAle=a.generarNumeroAleatorio(1,2);
        switch ((int) numAle){
            case 1:
                Rata rata = new Rata(a.generarNombreAleatorio().toString(),
                        (int) a.generarNumeroAleatorio(1, 100),
                        a.generarGeneroAleatorio(),
                        i + 1,
                        a.generarNumeroAleatorio(1, 1200),
                        mama.generarHabitoAleatorio(),
                        a.generarNumeroAleatorio(1, 120),
                        mama.generarDietaAleatorio()

                );
                return rata;
            case 2:
                Vaca vaca= new Vaca(a.generarNombreAleatorio().toString(),
                        (int) a.generarNumeroAleatorio(1, 100),
                        a.generarGeneroAleatorio(),
                        i + 1,
                        a.generarNumeroAleatorio(1, 1200),
                        mama.generarHabitoAleatorio(),
                        a.generarNumeroAleatorio(1, 120),
                        mama.generarDietaAleatorio()

                );
                return vaca;
            default:
                return mama;
        }

    }
    @Override
    public String toString() {
        return
                " PESO= " + peso +
                ", HABITOS = '" + habitos + '\'' +
                ", velocidadDesplazamiento= " + velocidadDesplazamiento +
                ", dieta= '" + dieta + '\'' +
                "ES UN MAMAL" +
                '}';
    }
}
