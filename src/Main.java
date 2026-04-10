public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = VehiculoFactory.crearVehiculo("auto");
        v1.placa = "ABC123";

        Vehiculo v2 = VehiculoFactory.crearVehiculo("van");
        v2.placa = "XYZ789";

        v1.mostrarInfo();
        v2.mostrarInfo();

        Contrato c = new ContratoBuilder()
                .setCliente("Juan")
                .setVehiculo("Auto")
                .agregarGPS()
                .build();

        System.out.println("Contrato de: " + c.cliente);
    }
}
