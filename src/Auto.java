class Auto extends Vehiculo {
    public Auto() {
        this.autonomia = 300;
    }

    public void mostrarInfo() {
        System.out.println("Auto: " + placa);
    }
}
