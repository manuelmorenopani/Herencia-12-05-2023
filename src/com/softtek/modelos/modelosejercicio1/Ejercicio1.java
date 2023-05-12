package com.Herencia.modelo.presentacion.modelo;

public class Ejercicio1 {
    private int coordenadaX;
    private int coordenadaY;

    public Ejercicio1(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String posicion() {
        return "La figura está en la posición (" + this.coordenadaX + ", " + this.coordenadaY + ")";
    }

}
