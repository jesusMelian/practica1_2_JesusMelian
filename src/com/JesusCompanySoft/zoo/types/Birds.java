package com.JesusCompanySoft.zoo.types;

import com.JesusCompanySoft.zoo.Animals.Animals;

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

    @Override
    public String toString() {
        return "Birds{" +
                "altitudMaximaVuelo=" + altitudMaximaVuelo +
                ", colorPlumaje='" + colorPlumaje + '\'' +
                ", tipoGarra='" + tipoGarra + '\'' +
                '}';
    }

    public String generarColorPlumaje(){
        Animals a= new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(0,5);
        return arrColors[numRandom];
    }

    public String generarTipoGarra(){
        Animals a= new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(0,2);
        return arrGarras[numRandom];
    }

}
