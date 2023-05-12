package com.softtek.modelos.modelosejercicio2;

public class Barco extends Vehiculo {
    private int eslora;
    private boolean tieneMotor;

    public Barco(String marca, String modelo, int anio, String color, int kilometraje, int eslora, boolean tieneMotor) {
        super(marca, modelo, anio, color, kilometraje);
        this.eslora = eslora;
        this.tieneMotor = tieneMotor;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }

    @Override
    public void acelerar() {
        System.out.println("El barco está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El barco está frenando.");
    }
}
