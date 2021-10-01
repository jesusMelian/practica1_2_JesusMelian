package com.JesusCompanySoft.zoo;

import com.JesusCompanySoft.zoo.Animals.Animals;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int espacios = Integer.parseInt(JOptionPane.showInputDialog("INSERTE EL NÚMERO DE ESPACIOS"));
        int animales = Integer.parseInt(JOptionPane.showInputDialog("INSERTE EL NÚMERO DE ANIMALES"));

        if(comprobarSiCaben(espacios, animales)){
            //si los animales caben hay que generar animales aleatoriamente

        }else{
            System.out.println("LOS ANIMALES NO CABEN BIEN");

        }
    }

    public static boolean comprobarSiCaben(int numEspacios, int numAnimales){
        if((numAnimales/numEspacios)>=2){
            return false;
        }else{
            return true;
        }
    }

    public static double generarNumeroAleatorio(double numMin, double numMax){
        double randomNum = Math.random() * ((numMax+1) - numMin);
        return  randomNum;
    }

    public static ArrayList<Animals> generarAnimales(int espacios, int animales){
        ArrayList<Animals> animal = new ArrayList<>();
        return animal;
    }

}
