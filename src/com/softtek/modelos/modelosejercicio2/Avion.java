package com.softtek.modelos.modelosejercicio2;

public class Avion extends Vehiculo{
    private int numeroMotores;
    private String modeloMotor;

    public Avion(String marca, String modelo, int anio, String color, int kilometraje, int numeroMotores, String modeloMotor) {
        super(marca, modelo, anio, color, kilometraje);
        this.numeroMotores = numeroMotores;
        this.modeloMotor = modeloMotor;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public String getModeloMotor() {
        return modeloMotor;
    }

    public void setModeloMotor(String modeloMotor) {
        this.modeloMotor = modeloMotor;
    }
    public void acelerar() {
        System.out.println("Esta despegando");
    }

    public void frenar() {
        System.out.println("El avión está aterrizando.");
    }
}
