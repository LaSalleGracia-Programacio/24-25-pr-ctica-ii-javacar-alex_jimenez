package org.JavaCar;

//Clase Furgoneta heredada de vehicle que implemnta la interfaz llogable
public class Furgoneta extends Vehicle implements Llogable {
    private int capacitatCarga;

    public Furgoneta(String matricula, String marca, String model, double preuBase, Motor motor, Roda rodes, String etiquetaAmbiental, int capacitatCarga){
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.capacitatCarga = capacitatCarga;
    }

    @Override
    public double calcularPrecio(int numDies){
        return getPreuBase() * numDies + capacitatCarga * 10;
    }
}
