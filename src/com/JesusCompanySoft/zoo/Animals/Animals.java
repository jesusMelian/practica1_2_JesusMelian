package com.JesusCompanySoft.zoo.Animals;

import com.JesusCompanySoft.zoo.types.Reptile;

public class Animals {
    String nombre;
    int edad;
    String genero;

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    int espacio;

    String[] arrName={"Tifón",
            "El bicho",
            "Mango",
            "Piña",
            "Juan",
            "Yasuo",
            "Misifú",
            "Bobon",
            "Rantanplán",
            "Harambe",
            "Chimuelo",
            "Yogu",
            "Petisuí",
            "Brego"
    };

    //ALMACENO EL ESPACIO AL QUE PERTENECE CADA ANIMAL
    public Animals(String nombre, int edad, String genero, int espacio) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.espacio = espacio;
    }

    public Animals() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String generarNombreAleatorio(){
        Animals a=new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(0, arrName.length-1);
        return arrName[numRandom];
    }

    public double generarNumeroAleatorio(double numMin, double numMax){
        //double randomNum = Math.random() * numMax + 1;
        double random=Math.random();
        double rango=(numMax+1) - numMin;
        double randomNum = (random * rango)+numMin;

        return  randomNum;
    }

    public String generarGeneroAleatorio(){
        Animals a=new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(1, 2);
        if(numRandom==1){
            return "MACHO";
        }else{
            return "HEMBRA";
        }
    }



}
