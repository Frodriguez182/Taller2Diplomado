package com.example.android.celulares;

/**
 * Created by android on 07/10/2017.
 */

public class Celular {

    private String os, color,imei, marca, precio, ram;

    public Celular(String os, String color, String imei, String marca, String precio, String ram) {
        this.os = os;
        this.color = color;
        this.imei = imei;
        this.marca = marca;
        this.precio = precio;
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}



