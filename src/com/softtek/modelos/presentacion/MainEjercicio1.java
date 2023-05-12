package com.Herencia.modelo.presentacion.presentacion;

import com.Herencia.modelo.presentacion.modelo.Circulo;
import com.Herencia.modelo.presentacion.modelo.Ejercicio1;
import com.Herencia.modelo.presentacion.modelo.Rectangulo;

import java.util.Scanner;

public class MainEjercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio1 ejercicio1 = new Ejercicio1(1, 4);
        System.out.println(ejercicio1.posicion());

        Circulo circulo = new Circulo(30, 40, 5.0);
        System.out.println(circulo.posicion());
        System.out.println("El área del círculo es: " + circulo.area());

        Rectangulo rectangulo = new Rectangulo(50, 60, 4.0, 6.0);
        System.out.println(rectangulo.posicion());
        System.out.println("El área del rectángulo es: " + rectangulo.area());

    }
}