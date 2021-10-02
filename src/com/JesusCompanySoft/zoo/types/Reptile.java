package com.JesusCompanySoft.zoo.types;

import com.JesusCompanySoft.zoo.Animals.Animals;

public class Reptile extends Animals {
    double temperaturaCorporal;
    String colorEscama;
    double velocidadDesplazamiento;

    String[] arrColors = {"azul", "verde", "rojo", "amarillo", "naranja"};

    public Reptile(String nombre, int edad, String genero, int espacio, double temperaturaCorporal, String colorEscama, double velocidadDesplazamiento) {
        super(nombre, edad, genero, espacio);
        this.temperaturaCorporal = temperaturaCorporal;
        this.colorEscama = colorEscama;
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }

    public Reptile() {

    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public String getColorEscama() {
        return colorEscama;
    }

    public void setColorEscama(String colorEscama) {
        this.colorEscama = colorEscama;
    }

    public double getVelocidadDesplazamiento() {
        return velocidadDesplazamiento;
    }

    public void setVelocidadDesplazamiento(double velocidadDesplazamiento) {
        this.velocidadDesplazamiento = velocidadDesplazamiento;
    }

    public String generarColorEscamas(){
        Animals a= new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(0,4);
        return arrColors[numRandom];
    }
}
