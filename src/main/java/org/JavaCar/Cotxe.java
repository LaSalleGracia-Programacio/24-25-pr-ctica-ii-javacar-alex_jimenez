package org.JavaCar;

//Clase que hereda de Vehicle y implementa Llogable
public class Cotxe extends Vehicle implements Llogable {
    private int nombrePlaces;

    public Cotxe(String matricula, String marca, String model, double preuBase, Motor motor, Roda rodes, String etiquetaAmbiental, int nombrePlaces){
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.nombrePlaces = nombrePlaces;
    }
    
    @Override
    public double calcularPrecio(int dies){
        return getPreuBase() * dies;
    }
}
