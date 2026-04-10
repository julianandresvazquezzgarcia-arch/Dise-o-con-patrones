class ContratoBuilder {

    private Contrato contrato = new Contrato();

    public ContratoBuilder setCliente(String cliente) {
        contrato.cliente = cliente;
        return this;
    }

    public ContratoBuilder setVehiculo(String vehiculo) {
        contrato.vehiculo = vehiculo;
        return this;
    }

    public ContratoBuilder agregarGPS() {
        contrato.gps = true;
        return this;
    }

    public Contrato build() {
        return contrato;
    }
}
