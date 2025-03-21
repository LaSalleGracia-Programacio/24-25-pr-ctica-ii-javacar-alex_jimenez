package org.JavaCar;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class VehicleTest {
    
    @Test
    public void testCreacioVehicleSenseMotorIRodes() {
        Vehicle vehicle = new Cotxe("5678DEF", "Ford", "Focus", 28.0, null, null, "ECO", 5);

        assertEquals("5678DEF", vehicle.getMatricula());
        assertEquals("Ford", vehicle.getMarca());
        assertEquals("Focus", vehicle.getModel());
        assertEquals(28.0, vehicle.getPreuBase(), 0.01);
        assertNull(vehicle.getMotor());
        assertNull(vehicle.getRodes());
    }

    @Test
    public void testCreacioVehicleAmbMotorIRodes() {
        Motor motor = new Motor("Gasolina", 120);
        Roda roda = new Roda("Michelin", 17);
        Vehicle vehicle = new Cotxe("1234ABC", "Toyota", "Corolla", 30.0, motor, roda, "ECO", 5);

        assertEquals("1234ABC", vehicle.getMatricula());
        assertEquals("Toyota", vehicle.getMarca());
        assertEquals("Corolla", vehicle.getModel());
        assertEquals(30.0, vehicle.getPreuBase(), 0.01);
        assertEquals(motor, vehicle.getMotor());
        assertEquals(roda, vehicle.getRodes());
    }

    @Test
    public void testProvaUsVehicle() {
        Vehicle vehicle = new Cotxe("2222XYZ", "Renault", "Clio", 32.0, null, null, "ECO", 5);
        double preuLloguer = vehicle.calcularPrecio(3); // Ha d'usar la implementació de Cotxe

        assertEquals(96, preuLloguer, 0.01);
    }

    @Test
    public void testVehicleEsAbstracta() {
        // Comprova que la classe Vehicle és abstracta
        assertTrue(Modifier.isAbstract(Vehicle.class.getModifiers()));
    }

    // Aquest test hauria de donar error de compilació si Vehicle no és abstracta
    @Test(expected = InstantiationException.class)
    public void testNoEsPotInstanciarVehicle() throws Exception {
        Class<?> clazz = Vehicle.class;
        clazz.newInstance(); // Això hauria de llençar una excepció
    }

    @Test
    public void testAtributsProtected() throws NoSuchFieldException {
        // Reflexió per accedir als atributs i verificar que són protected
        Field matriculaField = Vehicle.class.getDeclaredField("matricula");
        Field marcaField = Vehicle.class.getDeclaredField("marca");
        Field modelField = Vehicle.class.getDeclaredField("model");

        assertTrue("L'atribut 'matricula' hauria de ser protected", 
                   java.lang.reflect.Modifier.isProtected(matriculaField.getModifiers()));
        assertTrue("L'atribut 'marca' hauria de ser protected", 
                   java.lang.reflect.Modifier.isProtected(marcaField.getModifiers()));
        assertTrue("L'atribut 'model' hauria de ser protected", 
                   java.lang.reflect.Modifier.isProtected(modelField.getModifiers()));
    }
}
