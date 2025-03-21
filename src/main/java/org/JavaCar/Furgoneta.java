package org.JavaCar;

//Clase Furgoneta heredada de vehicle que implemnta la interfaz llogable
public class Furgoneta extends Vehicle implements Llogable {
    private int capacitatCarga;

    public Furgoneta(String matricula, String marca, String model, double preuBase, int capacitatCarga, Motor motor, Roda rodes, String etiquetaAmbiental){
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.capacitatCarga = capacitatCarga;
    }

    public int getCapacitatCarga() {
        return capacitatCarga;
    }

    @Override
    public double calcularPrecio(int dies) {
        double preu = getPreuBase() * dies;
        if (capacitatCarga > 1000) {
            preu += 10 * dies;
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
