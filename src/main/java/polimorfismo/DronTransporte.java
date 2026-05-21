package polimorfismo;

import abstraccion.Vehiculo;
import interfaces.IConectable;

public class DronTransporte extends Vehiculo implements IConectable {

    private double autonomia;

    public DronTransporte(String id, double capacidadCarga, double autonomia) {
        super(id, "Dron", capacidadCarga);
        this.autonomia = autonomia;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public void conectar() {
        System.out.println("Dron " + id + " conectado al sistema.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidadCarga);
        System.out.println("Autonomía: " + autonomia);
        System.out.println("================================");
    }
}