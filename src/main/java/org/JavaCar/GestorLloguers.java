package org.JavaCar;

import java.util.List;
import java.util.ArrayList;

public class GestorLloguers {
    //Metodo para calcular los ingresos totales de los vehiculos
    public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        double total = 0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.calcularPrecio(dies);
        }
        return total;
    }

    //Metodo para filtrar los vehiculos por precio
    public static List<Vehicle> filtrarPerPreu(List<Vehicle> vehicles, double preuMax) {
        List<Vehicle> filtrats = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPreuBase() <= preuMax) {
                filtrats.add(vehicle);
            }
        }
        return filtrats;
    }
} 