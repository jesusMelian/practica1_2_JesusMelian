package com.JesusCompanySoft.zoo;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int espacios = Integer.parseInt(JOptionPane.showInputDialog("INSERTE EL NÚMERO DE ESPACIOS"));
        int animales = Integer.parseInt(JOptionPane.showInputDialog("INSERTE EL NÚMERO DE ANIMALES"));



        if(comprobarSiCaben(espacios, animales)){

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
}
