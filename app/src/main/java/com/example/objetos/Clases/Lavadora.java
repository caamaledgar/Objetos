package com.example.objetos.Clases;

public class Lavadora {
    // Atributos
    private String marca;
    private String modelo;

    // Constructores
    public Lavadora() {
    }

    public Lavadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getter & Setter


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

    // ToString
    @Override
    public String toString() {
        return "Lavadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

}
