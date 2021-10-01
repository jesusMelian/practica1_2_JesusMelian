package com.JesusCompanySoft.zoo;

import com.JesusCompanySoft.zoo.Animals.Animals;
import com.JesusCompanySoft.zoo.types.Birds;
import com.JesusCompanySoft.zoo.types.Mamals;

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
        if((numAnimales/numEspacios)>2){
            return false;
        }else{
            return true;
        }
    }



    public static ArrayList<Animals> generarAnimales(int espacios, int animales){
        final int NUMTIPOS=3;
        Animals a=new Animals();
        Mamals mama=new Mamals();
        Birds bird= new Birds();
        ArrayList<Animals> animal = new ArrayList<>();

        int animalesRestantes=animales;


            for (int i = 0; i < espacios; i++) {
                //mientras haya mas animales que espacios, mete dos animales por espacio
                if(animalesRestantes>espacios){
                    for (int j = 0; j < 2; j++) {
                        int numRandom = (int) a.generarNumeroAleatorio(1, NUMTIPOS);

                        switch (numRandom) {
                            case 1:
                                Mamals mamal = new Mamals(a.generarNombreAleatorio().toString(),
                                        (int) a.generarNumeroAleatorio(1, 100),
                                        "MACHO",
                                        i,
                                        a.generarNumeroAleatorio(1, 1200),
                                        mama.generarHabitoAleatorio(),
                                        a.generarNumeroAleatorio(1, 120),
                                        mama.generarDietaAleatorio()
                                );
                                Mamals mamal1 = new Mamals(a.generarNombreAleatorio().toString(),
                                        (int) a.generarNumeroAleatorio(1, 100),
                                        "HEMBRA",
                                        i,
                                        a.generarNumeroAleatorio(1, 1200),
                                        mama.generarHabitoAleatorio(),
                                        a.generarNumeroAleatorio(1, 120),
                                        mama.generarDietaAleatorio()
                                );
                            case 2:
                                Birds birds = new Birds(a.generarNombreAleatorio(),
                                        (int) a.generarNumeroAleatorio(1,20),
                                        "MACHO",
                                        i,
                                        a.generarNumeroAleatorio(10, 3000),
                                        bird.generarColorPlumaje(),
                                        bird.generarTipoGarra()
                                );
                                Birds birds1 = new Birds(a.generarNombreAleatorio(),
                                        (int) a.generarNumeroAleatorio(1,20),
                                        "HEMBRA",
                                        i,
                                        a.generarNumeroAleatorio(10, 3000),
                                        bird.generarColorPlumaje(),
                                        bird.generarTipoGarra()
                                );
                        }
                    }
                }else{
                    int numRandom = (int) a.generarNumeroAleatorio(1, NUMTIPOS);

                }

            }

        return animal;
    }



}
