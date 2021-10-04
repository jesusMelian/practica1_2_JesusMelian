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
                System.out.println("NOMBRE: "+animals.get(i).getNombre() +
                " GÉNERO: "+animals.get(i).getGenero() +
                " EDAD: "+animals.get(i).getEdad() +
                " " +
                animals.get(i).toString()
                );
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

        //SI HAY MAS ANIMALES QQUE ESPACIOS
        if(animales>espacios){
            //ME RESTAS LOS ANIMALES A LOS ESPACIOS PARA VER LAS VUELTAS QUE TENGO QUE DAR PARA METER DOS ANIMALES
            int vueltas=animales-espacios;

            //RECORRO LOS ESPACIOS
            for (int i = 0; i < espacios; i++) {
                //GENERO NUMRANDOM
                int numRandom = (int) a.generarNumeroAleatorio(1, NUMTIPOS);
                //RECORRO LAS VUELTAS QUE ES EL RESULTADO DE RESTAR ANIMALES - ESPACIOS Y ASI PONGO LOS QUE SON DOBLES
                if (i < vueltas) {
                    numRandom = (int) a.generarNumeroAleatorio(1, NUMTIPOS);

                    switch (numRandom) {
                        case 1:
                            Mamals mamal = new Mamals(a.generarNombreAleatorio().toString(),
                                    (int) a.generarNumeroAleatorio(1, 100),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(1, 1200),
                                    mama.generarHabitoAleatorio(),
                                    a.generarNumeroAleatorio(1, 120),
                                    mama.generarDietaAleatorio()

                            );
                            Mamals mamal1 = new Mamals(a.generarNombreAleatorio().toString(),
                                    (int) a.generarNumeroAleatorio(1, 100),
                                    "HEMBRA",
                                    i + 1,
                                    a.generarNumeroAleatorio(1, 1200),
                                    mama.generarHabitoAleatorio(),
                                    a.generarNumeroAleatorio(1, 120),
                                    mama.generarDietaAleatorio()
                            );
                            //LOS AÑADIMOS
                            animal.add(mamal);
                            animal.add(mamal1);
                            break;

                        case 2:
                            Birds birds = new Birds(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 20),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(10, 3000),
                                    bird.generarColorPlumaje(),
                                    bird.generarTipoGarra()
                            );
                            Birds birds1 = new Birds(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 20),
                                    "HEMBRA",
                                    i + 1,
                                    a.generarNumeroAleatorio(10, 3000),
                                    bird.generarColorPlumaje(),
                                    bird.generarTipoGarra()
                            );

                            //AGREGAMOS LOS PAJAROS
                            animal.add(birds);
                            animal.add(birds1);

                            break;

                        case 3:
                            Reptile reptil = new Reptile(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 50),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(2, 20),
                                    reptile.generarColorEscamas(),
                                    a.generarNumeroAleatorio(1, 70));
                            Reptile reptil1 = new Reptile(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 50),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(2, 20),
                                    reptile.generarColorEscamas(),
                                    a.generarNumeroAleatorio(1, 70));

                            //AGREGAMOS LOS REPTILES
                            animal.add(reptil);
                            animal.add(reptil1);

                            break;
                    }
                } else {

                    switch (numRandom) {
                        case 1:
                            Mamals mamal = mama.generarMamalsAleatorio(i);
                            animal.add(mamal);

                            break;
                        case 2:
                            Birds birds = bird.generarBirdAleatorio(i);
                            animal.add(birds);
                            break;
                        case 3:
                            Reptile reptil1 = reptile.generarReptileAleatorio(i);
                            animal.add(reptil1);
                            break;
                    }
                }
            }

        }else{
            for (int i = 0; i < animales; i++) {
                int numRandom = (int) a.generarNumeroAleatorio(1, NUMTIPOS);
                switch (numRandom){
                    case 1:
                        Mamals mamal = mama.generarMamalsAleatorio(i);
                        animal.add(mamal);

                        break;
                    case 2:
                        Birds birds = bird.generarBirdAleatorio(i);
                        animal.add(birds);
                        break;
                    case 3:
                        Reptile reptil1 = reptile.generarReptileAleatorio(i);
                        animal.add(reptil1);
                        break;
                }
            }
        }

        return animal;
    }




}
