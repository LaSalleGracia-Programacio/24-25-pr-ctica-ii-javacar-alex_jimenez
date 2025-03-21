package org.JavaCar;

//Clase Furgoneta heredada de vehicle que implemnta la interfaz llogable
public class Furgoneta extends Vehicle implements Llogable {
    private int capacitatCarga;

    //Constructor de la clase Furgoneta
    public Furgoneta(String matricula, String marca, String model, double preuBase, int capacitatCarga, Motor motor, Roda rodes, String etiquetaAmbiental){
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.capacitatCarga = capacitatCarga;
    }

    //Metodo para obtener la capacidad de carga de la furgoneta
    public int getCapacitatCarga() {
        return capacitatCarga;
    }

    //Metodo para calcular el precio de la furgoneta    
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
