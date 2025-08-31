public class Vehiculo {
    // Atributos privados (encapsulación)
    private String fechaFabricacion;
    private String vinChasis;
    private String vinMotor;
    
   
    public Vehiculo(String fechaFabricacion, String vinChasis, String vinMotor) {
        this.fechaFabricacion = fechaFabricacion;
        this.vinChasis = vinChasis;
        this.vinMotor = vinMotor;
    }
    
    
    public String obtenerFechaFabricacion() {
        return this.fechaFabricacion;
    }
    
    
    public String obtenerVinChasis() {
        return this.vinChasis;
    }
    
    
    public String obtenerVinMotor() {
        return this.vinMotor;
    }
}