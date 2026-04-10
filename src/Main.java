public class Main {
    public static void main(String[] args) {

      
        Vehiculo[] flota = new Vehiculo[3];

        flota[0] = VehiculoFactory.crearVehiculo("auto");
        flota[0].placa = "ABC123";

        flota[1] = VehiculoFactory.crearVehiculo("van");
        flota[1].placa = "XYZ789";

        flota[2] = VehiculoFactory.crearVehiculo("camion");
        flota[2].placa = "LMN456";

   
        for (int i = 0; i < flota.length; i++) {
            flota[i].mostrarInfo();
        }

        
        Contrato c = new ContratoBuilder()
                .setCliente("Juan")
                .setVehiculo("Auto")
                .agregarGPS()
                .build();

        System.out.println("Contrato de: " + c.cliente);
    }
}
