package composicion;

import interfaces.IConectable;
import abstraccion.Vehiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CentroControl {

    private final List<Vehiculo> listaVehiculos;

    public CentroControl() {
        listaVehiculos = new ArrayList<>();
    }

    // CREATE
    public void crearVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    // READ
    public void listarVehiculos() {
        listaVehiculos.forEach(Vehiculo::mostrarInformacion);
    }

    // SEARCH
    public Vehiculo buscarVehiculo(String id) {

        return listaVehiculos.stream()
                .filter(v -> v.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }

    // UPDATE
    public void modificarVehiculo(String id, double nuevaCapacidad) {

        Vehiculo vehiculo = buscarVehiculo(id);

        if (vehiculo != null) {
            vehiculo.setCapacidadCarga(nuevaCapacidad);
            System.out.println("Vehículo modificado.");
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    // DELETE
    public void eliminarVehiculo(String id) {

        listaVehiculos.removeIf(v ->
                v.getId().equalsIgnoreCase(id));

        System.out.println("Vehículo eliminado.");
    }

    // LAMBDA
    public void mostrarConLambda() {

        listaVehiculos.forEach(v ->
                System.out.println(v.getId() + " - " + v.getTipo()));
    }

    // STREAMS
    public void filtrarConectables() {
        List<Vehiculo> conectables = listaVehiculos.stream()
                .filter(v -> v instanceof IConectable).toList();

        conectables.forEach(Vehiculo::mostrarInformacion);
    }

    // Obtener IDs
    public void obtenerIds() {

        List<String> ids = listaVehiculos.stream()
                .map(Vehiculo::getId)
                .collect(Collectors.toList());

        System.out.println(ids);
    }

    // Contar vehículos
    public void contarVehiculos() {

        long cantidad = listaVehiculos.size();

        System.out.println("Cantidad total: " + cantidad);
    }

    // Buscar por tipo
    public void buscarPorTipo(String tipo) {

        List<Vehiculo> encontrados = listaVehiculos.stream()
                .filter(v -> v.getTipo().equalsIgnoreCase(tipo))
                .toList();

        encontrados.forEach(Vehiculo::mostrarInformacion);
    }

    // Ordenar por ID
    public void ordenarPorId() {

        listaVehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getId))
                .forEach(Vehiculo::mostrarInformacion);
    }

    // Ordenar por tipo
    public void ordenarPorTipo() {

        listaVehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getTipo))
                .forEach(Vehiculo::mostrarInformacion);
    }

    // ESTADÍSTICAS
    public void estadisticas() {

        double promedio = listaVehiculos.stream()
                .mapToDouble(Vehiculo::getCapacidadCarga)
                .average()
                .orElse(0);

        System.out.println("Promedio de capacidad: " + promedio);
    }
}