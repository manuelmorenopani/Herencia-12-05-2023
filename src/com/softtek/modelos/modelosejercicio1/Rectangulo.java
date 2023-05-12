package com.Herencia.modelo.presentacion.modelo;

public class Rectangulo extends Ejercicio1{
    private double ancho;
    private double alto;

    public Rectangulo(int coordenadaX, int coordenadaY, double ancho, double alto) {
        super(coordenadaX, coordenadaY);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double area() {
        return ancho * alto;
    }

    public String posicion() {
        return "El rectángulo está en la posición (" + super.getCoordenadaX() + ", " + super.getCoordenadaY() + ")";
    }

}
