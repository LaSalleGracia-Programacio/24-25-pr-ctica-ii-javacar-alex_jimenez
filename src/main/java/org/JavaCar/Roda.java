package org.JavaCar;

public class Roda {
    private String marca;
    private int diametre;

    //Constructor de la clase Roda
    public Roda(String marca, int diametre){
        this.marca = marca;
        this.diametre = diametre;
    }

    //Getters
    public String getMarca(){
        return marca;
    }
    public int getDiametre(){
        return diametre;
    }
}
