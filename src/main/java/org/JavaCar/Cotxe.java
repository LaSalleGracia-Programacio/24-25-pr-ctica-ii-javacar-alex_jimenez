package org.JavaCar;

//Clase que hereda de Vehicle y implementa Llogable
public class Cotxe extends Vehicle {
    private int nombrePlaces;

    //Constructor de la clase Cotxe
    public Cotxe(String matricula, String marca, String model, double preuBase, Motor motor, Roda rodes, String etiquetaAmbiental, int nombrePlaces){
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.nombrePlaces = nombrePlaces;
    }
    
    //Metodo para calcular el precio del coche  
    @Override
    public double calcularPrecio(int dies){
        return getPreuBase() * dies;
    }

    //Metodo ToString de la clase Cotxe
    @Override
    public String toString() {
    return "Cotxe{" +
            " matricula = '" + getMatricula() + '\'' +
            ", marca = '" + getMarca() + '\'' +
            ", model = '" + getModel() + '\'' +
            ", preuBase = " + getPreuBase() +
            ", nombrePlaces = " + nombrePlaces +
            '}';
    }
}
