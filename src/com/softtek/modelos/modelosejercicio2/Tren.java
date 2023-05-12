package com.softtek.modelos.modelosejercicio2;

public class Tren extends Vehiculo {
    private int numeroVagones;
    private int capacidadPasajeros;

    public Tren(String marca, String modelo, int anio, String color, int kilometraje, int numeroVagones, int capacidadPasajeros) {
        super(marca, modelo, anio, color, kilometraje);
        this.numeroVagones = numeroVagones;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }

    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar() {
        System.out.println("El tren está aumentando su velocidad.");
    }

    @Override
    public void frenar() {
        System.out.println("El tren está frenando.");
    }

    public void subirPasajeros(int cantidad) {
        System.out.println("Han subido " + cantidad + " pasajeros al tren.");
    }

    public void bajarPasajeros(int cantidad) {
        System.out.println("Han bajado " + cantidad + " pasajeros del tren.");
    }

}
