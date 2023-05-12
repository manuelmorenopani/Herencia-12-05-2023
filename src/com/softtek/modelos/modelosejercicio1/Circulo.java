package com.Herencia.modelo.presentacion.modelo;

public class Circulo extends Ejercicio1{
    private double radio;

    public Circulo(int coordenadaX, int coordenadaY, double radio) {
        super(coordenadaX, coordenadaY);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }
    public String posicion() {
        return "El círculo está en la posición (" + super.getCoordenadaX() + ", " + super.getCoordenadaY() + ")";
    }
}
