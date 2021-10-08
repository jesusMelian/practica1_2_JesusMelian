package com.JesusCompanySoft.zoo;

import com.JesusCompanySoft.zoo.Animals.Animals;
import com.JesusCompanySoft.zoo.Management.GenerarZoo;
import com.JesusCompanySoft.zoo.types.*;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int espacios = Integer.parseInt(JOptionPane.showInputDialog("INSERTE EL NÚMERO DE ESPACIOS"));
        int animales = Integer.parseInt(JOptionPane.showInputDialog("INSERTE EL NÚMERO DE ANIMALES"));

        GenerarZoo generar = new GenerarZoo(espacios, animales);
    }


}
