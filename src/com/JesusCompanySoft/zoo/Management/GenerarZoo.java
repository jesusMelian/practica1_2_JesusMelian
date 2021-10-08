package com.JesusCompanySoft.zoo.Management;

import com.JesusCompanySoft.zoo.Animals.Animals;
import com.JesusCompanySoft.zoo.types.*;

import java.util.ArrayList;

public class GenerarZoo {

    public GenerarZoo(int espacios, int animales) {
        ArrayList<Animals> animals = new ArrayList<>();

        if(comprobarSiCaben(espacios, animales)){
            //si los animales caben hay que generar animales aleatoriamente
            animals=generarAnimales(espacios, animales);
            System.out.println("LOS ANIMALES QUE SE HAN GENERADO SON:");
            String tipo="";
            for (int i = 0; i < animals.size(); i++) {
                if(animals.get(i) instanceof Rata){
                    tipo="rata";
                }else if (animals.get(i) instanceof Vaca){
                    tipo="vaca";
                }else if (animals.get(i) instanceof Gorrion){
                    tipo="gorrion";
                }else if (animals.get(i) instanceof Cernicalo){
                    tipo="cernicalo";
                }else if(animals.get(i) instanceof Boa){
                    tipo="boa";
                }else if(animals.get(i) instanceof Cobra){
                    tipo="cobra";
                }
                System.out.println("espacio"+animals.get(i).getEspacio()+ ": ");
                System.out.println(tipo + "=> "+"NOMBRE: "+animals.get(i).getNombre() +
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

        if(numAnimales>(numEspacios*2)){
            return false;
        }else{
            return true;
        }
    }



    public static ArrayList<Animals> generarAnimales(int espacios, int animales){
        final int NUMTIPOS=6;
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
                int numRandom2 = (int) a.generarNumeroAleatorio(1, 3);
                //RECORRO LAS VUELTAS QUE ES EL RESULTADO DE RESTAR ANIMALES - ESPACIOS Y ASI PONGO LOS QUE SON DOBLES
                if (i < vueltas) {
                    numRandom = (int) a.generarNumeroAleatorio(1, NUMTIPOS);

                    switch (numRandom) {
                        case 1:
                            Rata rata = new Rata(a.generarNombreAleatorio().toString(),
                                    (int) a.generarNumeroAleatorio(1, 100),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(1, 1200),
                                    mama.generarHabitoAleatorio(),
                                    a.generarNumeroAleatorio(1, 120),
                                    mama.generarDietaAleatorio()

                            );
                            Rata rata1 = new Rata(a.generarNombreAleatorio().toString(),
                                    (int) a.generarNumeroAleatorio(1, 100),
                                    "HEMBRA",
                                    i + 1,
                                    a.generarNumeroAleatorio(1, 1200),
                                    mama.generarHabitoAleatorio(),
                                    a.generarNumeroAleatorio(1, 120),
                                    mama.generarDietaAleatorio()
                            );
                            //LOS AÑADIMOS
                            animal.add(rata);
                            animal.add(rata1);
                            break;

                        case 2:
                            Cernicalo cerni= new Cernicalo(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 20),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(10, 3000),
                                    bird.generarColorPlumaje(),
                                    bird.generarTipoGarra()
                            );
                            Cernicalo cerni1= new Cernicalo(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 20),
                                    "HEMBRA",
                                    i + 1,
                                    a.generarNumeroAleatorio(10, 3000),
                                    bird.generarColorPlumaje(),
                                    bird.generarTipoGarra()
                            );

                            //AGREGAMOS LOS PAJAROS
                            animal.add(cerni);
                            animal.add(cerni1);

                            break;

                        case 3:
                            Boa boa = new Boa(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 50),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(2, 20),
                                    reptile.generarColorEscamas(),
                                    a.generarNumeroAleatorio(1, 70));
                            Boa boa1 = new Boa(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 50),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(2, 20),
                                    reptile.generarColorEscamas(),
                                    a.generarNumeroAleatorio(1, 70));

                            //AGREGAMOS LOS REPTILES
                            animal.add(boa);
                            animal.add(boa1);

                            break;


                        case 4:
                            Vaca vaca= new Vaca(a.generarNombreAleatorio().toString(),
                                    (int) a.generarNumeroAleatorio(1, 100),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(1, 1200),
                                    mama.generarHabitoAleatorio(),
                                    a.generarNumeroAleatorio(1, 120),
                                    mama.generarDietaAleatorio()

                            );
                            Vaca vaca1= new Vaca(a.generarNombreAleatorio().toString(),
                                    (int) a.generarNumeroAleatorio(1, 100),
                                    "HEMBRA",
                                    i + 1,
                                    a.generarNumeroAleatorio(1, 1200),
                                    mama.generarHabitoAleatorio(),
                                    a.generarNumeroAleatorio(1, 120),
                                    mama.generarDietaAleatorio()
                            );
                            //LOS AÑADIMOS
                            animal.add(vaca);
                            animal.add(vaca1);
                            break;

                        case 5:
                            Gorrion gorrion = new Gorrion(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 20),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(10, 3000),
                                    bird.generarColorPlumaje(),
                                    bird.generarTipoGarra()
                            );
                            Gorrion gorrion1 = new Gorrion(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 20),
                                    "HEMBRA",
                                    i + 1,
                                    a.generarNumeroAleatorio(10, 3000),
                                    bird.generarColorPlumaje(),
                                    bird.generarTipoGarra()
                            );

                            //AGREGAMOS LOS PAJAROS
                            animal.add(gorrion);
                            animal.add(gorrion1);

                            break;
                        case 6:
                            Cobra cobra = new Cobra(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 50),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(2, 20),
                                    reptile.generarColorEscamas(),
                                    a.generarNumeroAleatorio(1, 70));
                            Cobra cobra1 = new Cobra(a.generarNombreAleatorio(),
                                    (int) a.generarNumeroAleatorio(1, 50),
                                    "MACHO",
                                    i + 1,
                                    a.generarNumeroAleatorio(2, 20),
                                    reptile.generarColorEscamas(),
                                    a.generarNumeroAleatorio(1, 70));

                            //AGREGAMOS LOS REPTILES
                            animal.add(cobra);
                            animal.add(cobra1);

                            break;
                    }
                } else {

                    switch (numRandom2) {
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
                int numRandom2 = (int) a.generarNumeroAleatorio(1, 3);
                switch (numRandom2){
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
