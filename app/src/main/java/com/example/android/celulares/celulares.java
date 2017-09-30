package com.example.android.celulares;

/**
 * Created by android on 30/09/2017.
 */

public class celulares {

    private double precio,memoria;
    private int marca,sistema,color;


    public celulares(double precio, double capacidad, int marca, int color, int sistema) {
        this.precio = precio;
        this.memoria = capacidad;
        this.marca = marca;
        this.sistema = sistema;
        this.color = color;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCapacidad() {
        return memoria;
    }

    public void setCapacidad(double capacidad) {
        this.memoria = capacidad;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSistema() {
        return sistema;
    }

    public void setSistema(int sistema) {
        this.sistema = sistema;
    }

    public void Guardar(){metodos.Guardarcelulares(this);
    }
}

