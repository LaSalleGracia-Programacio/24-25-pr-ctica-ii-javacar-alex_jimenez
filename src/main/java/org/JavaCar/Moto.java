package org.JavaCar;

public class Moto extends Vehicle implements Llogable {
    private int cilindrada;

    public Moto(String matricula, String marca, String model, double preuBase, Motor motor, Roda rodes, String etiquetaAmbiental, int cilindrada) {
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

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
