package com.softtek.modelos.modelosejercicio2;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;

    public Coche(String marca, String modelo, int anio, String color, int kilometraje, int numeroPuertas, boolean tieneAireAcondicionado) {
        super(marca, modelo, anio, color, kilometraje);
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche está frenando.");
    }
}
