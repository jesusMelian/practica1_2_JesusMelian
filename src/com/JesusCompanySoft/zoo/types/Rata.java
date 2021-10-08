package com.JesusCompanySoft.zoo.types;

public class Rata extends Mamals{
    public Rata(String nombre, int edad, String genero, int espacio, double peso, String habitos, double velocidadDesplazamiento, String dieta) {
        super(nombre, edad, genero, espacio, peso, habitos, velocidadDesplazamiento, dieta);
    }

    public void morder(){
        System.out.println("Jesus: AAAAHHHH! que cola me esta saliendo :)");
    }
}
