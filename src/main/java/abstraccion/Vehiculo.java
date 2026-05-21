package abstraccion;

public abstract class Vehiculo {
    protected String id;
    protected String tipo;
    protected double capacidadCarga;

    public Vehiculo(String id, String tipo, double capacidadCarga) {
        this.id = id;
        this.tipo = tipo;
        this.capacidadCarga = capacidadCarga;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public abstract void mostrarInformacion();
}