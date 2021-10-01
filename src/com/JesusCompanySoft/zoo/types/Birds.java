package com.JesusCompanySoft.zoo.types;

import com.JesusCompanySoft.zoo.Animals.Animals;

public class Birds extends Animals {
    double altitudMaximaVuelo;
    String colorPlumaje;
    String tipoGarra;

    public Birds(String nombre, int edad, String genero, double altitudMaximaVuelo, String colorPlumaje, String tipoGarra) {
        super(nombre, edad, genero);
        this.altitudMaximaVuelo = altitudMaximaVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoGarra = tipoGarra;
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
}
