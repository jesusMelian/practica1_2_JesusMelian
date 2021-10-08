package com.JesusCompanySoft.zoo.types;

import com.JesusCompanySoft.zoo.Animals.Animals;

import java.util.Arrays;

public class Birds extends Animals {
    double altitudMaximaVuelo;
    String colorPlumaje;
    String tipoGarra;

    String[] arrColors = {"azul", "verde", "rojo", "amarillo", "naranja"};
    String[] arrGarras = {"palmipeda", "garra"};
    public Birds(String nombre, int edad, String genero, int espacio, double altitudMaximaVuelo, String colorPlumaje, String tipoGarra) {
        super(nombre, edad, genero, espacio);
        this.altitudMaximaVuelo = altitudMaximaVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoGarra = tipoGarra;
    }

    public Birds() {

    }

    public double getAltitudMaximaVuelo() {
        return altitudMaximaVuelo;
    }

    public void setAltitudMaximaVuelo(double altitudMaximaVuelo) {
        this.altitudMaximaVuelo = altitudMaximaVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoGarra() {
        return tipoGarra;
    }

    public void setTipoGarra(String tipoGarra) {
        this.tipoGarra = tipoGarra;
    }

    public String generarColorPlumaje(){
        Animals a= new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(0,4);
        return arrColors[numRandom];
    }

    public String generarTipoGarra(){
        Animals a= new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(0,1);
        return arrGarras[numRandom];
    }

    public Birds generarBirdAleatorio( int i){
        Animals a=new Animals();
        double numAle=a.generarNumeroAleatorio(1,2);
        Birds bird = new Birds();
        switch ((int) numAle){
            case 1:
                Gorrion gorrion = new Gorrion(a.generarNombreAleatorio(),
                        (int) a.generarNumeroAleatorio(1, 20),
                        a.generarGeneroAleatorio(),
                        i + 1,
                        a.generarNumeroAleatorio(10, 3000),
                        bird.generarColorPlumaje(),
                        bird.generarTipoGarra()
                );
                return gorrion;
            case 2:
                Cernicalo cerni= new Cernicalo(a.generarNombreAleatorio(),
                        (int) a.generarNumeroAleatorio(1, 20),
                        a.generarGeneroAleatorio(),
                        i + 1,
                        a.generarNumeroAleatorio(10, 3000),
                        bird.generarColorPlumaje(),
                        bird.generarTipoGarra()
                );
                return cerni;
            default:
                return bird;
        }

    }
    @Override
    public String toString() {
        return
                " altitudMaximaVuelo= " + altitudMaximaVuelo +
                ", colorPlumaje ='" + colorPlumaje + '\'' +
                ", tipoGarra ='" + tipoGarra + '\'' +
                "ES UN BIRD" +
                '}';
    }
}
