class Van extends Vehiculo {
    public Van() {
        this.autonomia = 400;
    }

    public void mostrarInfo() {
        System.out.println("Van: " + placa);
    }
}
