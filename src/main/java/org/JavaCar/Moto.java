package org.JavaCar;

public class Moto extends Vehicle {
    public int cilindrada;

    public Moto(String matricula, String marca, String model, double preuBase, Motor motor, Roda rodes, String etiquetaAmbiental, int cilindrada){
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public double calcularPrecio(int numDies) {
        double preu = getPreuBase() * numDies;
        if (cilindrada > 500) {
            preu += 5;
        }
        return preu;
    }
}
