package com.softtek.modelos.modelosejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private int kilometraje;

    public Vehiculo(String marca, String modelo, int anio, String color, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }
}
