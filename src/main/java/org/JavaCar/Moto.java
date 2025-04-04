package org.JavaCar;

public class Moto extends Vehicle {
    private int cilindrada;

    //Constructor de la clase Moto
    public Moto(String matricula, String marca, String model, double preuBase, Motor motor, Roda rodes, String etiquetaAmbiental, int cilindrada) {
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.cilindrada = cilindrada;
    }

    //Metodo para obtener la cilindrada de la moto
    public int getCilindrada() {
        return cilindrada;
    }

    //Metodo para calcular el precio de la moto
    @Override
    public double calcularPrecio(int dies) {
        double preu = getPreuBase() * dies;
        if (cilindrada >= 500) {
            preu += 5 * dies;
        }
        return preu;
    }

    //Metodo ToString de la clase Moto
    @Override
    public String toString() {
    return "Moto{" +
            "matricula = '" + getMatricula() + '\'' +
            ", marca = '" + getMarca() + '\'' +
            ", model = '" + getModel() + '\'' +
            ", preuBase = " + getPreuBase() +
            ", cilindrada = " + cilindrada +
            '}';
    }
}
