package com.JesusCompanySoft.zoo.Animals;

public class Animals {
    String nombre;
    int edad;
    String genero;
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

    @Override
    public String toString() {
        return "Animals{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String generarNombreAleatorio(){
        Animals a=new Animals();
        int numRandom = (int) a.generarNumeroAleatorio(0, arrName.length);
        return arrName[numRandom];
    }

    public double generarNumeroAleatorio(double numMin, double numMax){
        double randomNum = Math.random() * ((numMax+1) - numMin);
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
