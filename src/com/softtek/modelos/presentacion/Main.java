package com.softtek.modelos.presentacion;

import com.softtek.modelos.modelosejercicio2.Barco;
import com.softtek.modelos.modelosejercicio2.Coche;
import com.softtek.modelos.modelosejercicio2.Avion;
import com.softtek.modelos.modelosejercicio2.Tren;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Coche coche = new Coche("Ford", "Mustang", 2021, "Rojo", 5000, 2, true);
            Barco barco = new Barco("SeaRay", "Sundancer", 2020, "Blanco", 1000, 35, true);
            Avion avion = new Avion("Boeing", "747", 2015, "Blanco", 50000, 400, "true");
            Tren tren = new Tren("Renfe", "AVE", 2010, "Gris", 100000, 10, 500);

            coche.acelerar();
            coche.frenar();

            barco.acelerar();
            barco.frenar();

            avion.acelerar();
            avion.frenar();


            tren.acelerar();
            tren.frenar();
            tren.subirPasajeros(20);
            tren.bajarPasajeros(5);
        }
    }
