package org.JavaCar;

//Clase Abstracta Vehicle que implementa Llogable
public abstract class Vehicle implements Llogable{
    private String matricula;
    private String marca;
    private String model;
    private double preuBase;
    private Motor motor;
    private Roda rodes;
    private String etiquetaAmbiental;   //Etiqueta ambiental del vehiculo

}
