package polimorfismo;

import abstraccion.Vehiculo;
import interfaces.IConectable;

public class CamionAutonomo extends Vehiculo implements IConectable {

    private int cantidadSensores;

    public CamionAutonomo(String id, double capacidadCarga, int cantidadSensores) {
        super(id, "Camión Autónomo", capacidadCarga);
        this.cantidadSensores = cantidadSensores;
    }

    public int getCantidadSensores() {
        return cantidadSensores;
    }

    public void setCantidadSensores(int cantidadSensores) {
        this.cantidadSensores = cantidadSensores;
    }

    @Override
    public void conectar() {
        System.out.println("Camión " + id + " conectado al sistema.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidadCarga);
        System.out.println("Sensores: " + cantidadSensores);
        System.out.println("================================");
    }
}
