package programa;

import polimorfismo.CamionAutonomo;
import polimorfismo.DronTransporte;
import composicion.CentroControl;

public class Programa {
    public static void main(String[] args) {
        CentroControl control = new CentroControl();

        // Crear vehiculos
        DronTransporte dron1 = new DronTransporte("A01", 25, 200);
        DronTransporte dron2 = new DronTransporte("A02", 60, 100);
        CamionAutonomo camion1 = new CamionAutonomo("B01", 400, 20);
        CamionAutonomo camion2 = new CamionAutonomo("B02", 200, 18);

        // CREATE
        control.crearVehiculo(dron1);
        control.crearVehiculo(dron2);
        control.crearVehiculo(camion1);
        control.crearVehiculo(camion2);

        // READ
        System.out.println("LISTA DE VEHÍCULOS");
        control.listarVehiculos();

        // SEARCH
        System.out.println("BUSCAR VEHÍCULO");
        System.out.println(control.buscarVehiculo("A01") != null ? "Encontrado" : "No encontrado");

        // UPDATE
        control.modificarVehiculo("A01", 80);

        // DELETE
        control.eliminarVehiculo("A02");

        // LAMBDA
        System.out.println("LAMBDA");
        control.mostrarConLambda();

        // STREAMS
        System.out.println("CONECTABLES");
        control.filtrarConectables();

        // IDs
        System.out.println("LISTA DE IDS");
        control.obtenerIds();

        // CONTAR
        control.contarVehiculos();

        // BUSCAR POR TIPO
        System.out.println("BUSCAR DRONES");
        control.buscarPorTipo("Dron");

        // ORDENAR
        System.out.println("ORDENACION POR ID");
        control.ordenarPorId();

        System.out.println("ORDENACION POR TIPO");
        control.ordenarPorTipo();

        // ESTADÍSTICAS
        control.estadisticas();
    }
}