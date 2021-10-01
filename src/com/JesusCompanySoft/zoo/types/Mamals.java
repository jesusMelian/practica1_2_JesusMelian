package com.JesusCompanySoft.zoo.types;

import com.JesusCompanySoft.zoo.Animals.Animals;

public class Mamals extends Animals {
    double peso;
    String habitos;                         //diurnos, nocturnos
    double velocidadDesplazamiento;
    String dieta;                           //carnívora, herbívora, omnívora

    public Mamals(String nombre, int edad, String genero, double peso, String habitos, double velocidadDesplazamiento, String dieta) {
        super(nombre, edad, genero);
        this.peso = peso;
        this.habitos = habitos;
        this.velocidadDesplazamiento = velocidadDesplazamiento;
        this.dieta = dieta;
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

    @Override
    public String toString() {
        return "Mamals{" +
                "peso=" + peso +
                ", habitos='" + habitos + '\'' +
                ", velocidadDesplazamiento=" + velocidadDesplazamiento +
                ", dieta='" + dieta + '\'' +
                '}';
    }
}
