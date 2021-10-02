package com.JesusCompanySoft.zoo;

import com.JesusCompanySoft.zoo.Animals.Animals;
import com.JesusCompanySoft.zoo.types.Birds;
import com.JesusCompanySoft.zoo.types.Mamals;
import com.JesusCompanySoft.zoo.types.Reptile;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int espacios = Integer.parseInt(JOptionPane.showInputDialog("INSERTE EL NÚMERO DE ESPACIOS"));
        int animales = Integer.parseInt(JOptionPane.showInputDialog("INSERTE EL NÚMERO DE ANIMALES"));

        ArrayList<Animals> animals = new ArrayList<>();
        //System.out.println((int) a.generarNumeroAleatorio(1,3));
        if(comprobarSiCaben(espacios, animales)){
            //si los animales caben hay que generar animales aleatoriamente
            animals=generarAnimales(espacios, animales);
            System.out.println("LOS ANIMALES QUE SE HAN GENERADO SON:");
            for (int i = 0; i < animals.size(); i++) {
                System.out.println(animals.get(i).getEspacio()+ ": ");
                System.out.println(animals.get(i).toString());
            }
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
        Reptile reptile = new Reptile();
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
                                //LOS AÑADIMOS
                                animal.add(mamal);
                                animal.add(mamal1);
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

                                //AGREGAMOS LOS PAJAROS
                                animal.add(birds);
                                animal.add(birds1);
                            case 3:
                                Reptile reptil = new Reptile(a.generarNombreAleatorio(),
                                        (int) a.generarNumeroAleatorio(1,50),
                                        "MACHO",
                                        i,
                                        a.generarNumeroAleatorio(2,20),
                                        reptile.generarColorEscamas(),
                                        a.generarNumeroAleatorio(1, 70));
                                Reptile reptil1 = new Reptile(a.generarNombreAleatorio(),
                                        (int) a.generarNumeroAleatorio(1,50),
                                        "MACHO",
                                        i,
                                        a.generarNumeroAleatorio(2,20),
                                        reptile.generarColorEscamas(),
                                        a.generarNumeroAleatorio(1, 70));

                                //AGREGAMOS LOS REPTILES
                                animal.add(reptil);
                                animal.add(reptil1);
                        }
                    }
                }else{
                    int numRandom = (int) a.generarNumeroAleatorio(1, NUMTIPOS);
                    switch (numRandom){
                        case 1:
                            Mamals mamal = new Mamals(a.generarNombreAleatorio().toString(),
                                    (int) a.generarNumeroAleatorio(1, 100),
                                    a.generarGeneroAleatorio(),
                                    i,
                                    a.generarNumeroAleatorio(1, 1200),
                                    mama.generarHabitoAleatorio(),
                                    a.generarNumeroAleatorio(1, 120),
                                    mama.generarDietaAleatorio()
                            );

                            animal.add(mamal);
                        case 2:
                            Birds birds = new Birds(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1,20),
                                    a.generarGeneroAleatorio(),
                                    i,
                                    a.generarNumeroAleatorio(10, 3000),
                                    bird.generarColorPlumaje(),
                                    bird.generarTipoGarra()
                            );

                            animal.add(birds);
                        case 3:
                            Reptile reptil1 = new Reptile(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1,50),
                                    a.generarGeneroAleatorio(),
                                    i,
                                    a.generarNumeroAleatorio(2,20),
                                    reptile.generarColorEscamas(),
                                    a.generarNumeroAleatorio(1, 70)
                            );

                            animal.add(reptil1);
                    }
                }

            }

        return animal;
    }



}
