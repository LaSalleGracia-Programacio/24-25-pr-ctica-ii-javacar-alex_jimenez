package org.JavaCar;

//Clase Furgoneta heredada de vehicle que implemnta la interfaz llogable
public class Furgoneta extends Vehicle implements Llogable {
    private int capacitatCarga;

    public Furgoneta(String matricula, String marca, String model, double preuBase, Motor motor, Roda rodes, String etiquetaAmbiental, int capacitatCarga){
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.capacitatCarga = capacitatCarga;
    }

    @Override
    public double calcularPrecio(int dies) {
        double preu = getPreuBase() * dies;
        if (capacitatCarga > 1000) {
            preu += 10;
        }
        return preu;
    }

    //Metodo ToString de la clase Furgoneta
    @Override
    public String toString() {
    return "Furgoneta{" +
            "matricula = '" + getMatricula() + '\'' +
            ", marca = '" + getMarca() + '\'' +
            ", model = '" + getModel() + '\'' +
            ", preuBase = " + getPreuBase() +
            ", capacitatCarga = " + capacitatCarga +
        '}';
    }
}
