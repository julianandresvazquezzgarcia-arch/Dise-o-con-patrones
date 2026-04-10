class VehiculoFactory {

    public static Vehiculo crearVehiculo(String tipo) {
        switch(tipo.toLowerCase()) {
            case "auto": return new Auto();
            case "van": return new Van();
            case "camion": return new Camion();
            default: return null;
        }
    }
}
