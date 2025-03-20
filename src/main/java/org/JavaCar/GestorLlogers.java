package org.JavaCar;

import java.util.List;              //Importamos la clase List
import java.util.ArrayList;         //Importamos la clase ArrayList

//Clase GestorLlogers que gestiona los lloguers de los vehiculos
public class GestorLlogers   {

    //Metodo para calcular los ingresos totales de los vehiculos
    public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        double ingressosTotals = 0;
        for (Vehicle vehicle : vehicles) {
            ingressosTotals += vehicle.calcularPrecio(dies);
        }
        return ingressosTotals;
    }

    //Metodo para filtrar los vehiculos por precio
    public static List<Vehicle> filtrarPerPreu(List<Vehicle> vehicles, double preuMax) {
        List<Vehicle> vehiclesFiltrats = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.calcularPrecio(1) <= preuMax) {
                vehiclesFiltrats.add(vehicle);
            }
        }
        return vehiclesFiltrats;
    }    
}
