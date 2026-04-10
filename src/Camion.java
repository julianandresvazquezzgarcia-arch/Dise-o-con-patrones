class Camion extends Vehiculo {
    public Camion() {
        this.autonomia = 600;
    }

    public void mostrarInfo() {
        System.out.println("Camion: " + placa);
    }
}
