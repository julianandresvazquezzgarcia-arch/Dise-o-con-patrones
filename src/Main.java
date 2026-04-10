import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese tipo de vehiculo (auto, van, camion): ");
        String tipo = sc.nextLine();

        Vehiculo v = VehiculoFactory.crearVehiculo(tipo);

        if (v == null) {
            System.out.println("Tipo de vehiculo no valido");
            return;
        }

        System.out.print("Ingrese placa: ");
        String placa = sc.nextLine();
        v.placa = placa;

        v.mostrarInfo();

        System.out.print("Ingrese nombre del cliente: ");
        String cliente = sc.nextLine();

        System.out.print("¿Desea GPS? (si/no): ");
        String gpsInput = sc.nextLine();

        ContratoBuilder builder = new ContratoBuilder()
                .setCliente(cliente)
                .setVehiculo(tipo);

        if (gpsInput.equalsIgnoreCase("si")) {
            builder.agregarGPS();
        }

        Contrato contrato = builder.build();

        System.out.println("\n--- CONTRATO ---");
        System.out.println("Cliente: " + contrato.cliente);
        System.out.println("Vehiculo: " + contrato.vehiculo);
        System.out.println("GPS: " + (contrato.gps ? "Si" : "No"));

        sc.close();
    }
}
