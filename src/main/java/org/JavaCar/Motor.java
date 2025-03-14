package org.JavaCar;

public class Motor {
    private String tipus;
    private int potencia;
    
    //Constructor de la clase Motor
    public Motor(String tipus, int potencia){
        this.tipus = tipus;
        this.potencia = potencia;
    }
    
    //Getters
    public String getTipus(){
        return tipus;
    }
    public int getPotencia(){
        return potencia;
    }
}
