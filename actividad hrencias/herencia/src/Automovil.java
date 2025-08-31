public class Automovil extends Vehiculo {
    // Atributos específicos de la clase Automóvil
    private String marca;
    private String modelo;
    private double precio;
    
    
    public Automovil(String fechaFabricacion, String vinChasis, String vinMotor, 
                     String marca, String modelo, double precio) {
        super(fechaFabricacion, vinChasis, vinMotor);
        
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public String obtenerMarca() {
        return this.marca;
    }
    
    public String obtenerModelo() {
        return this.modelo;
    }
    
    public double obtenerPrecio() {
        return this.precio;
    }
    
public void mostrarDatos() {
        
        System.out.println("INFORMACIÓN DEL AUTOMÓVIL ");
        System.out.println(" Fecha de Fabricación: " + obtenerFechaFabricacion());
        System.out.println(" VIN Chasis: " + obtenerVinChasis());
        System.out.println(" VIN Motor: " + obtenerVinMotor());
        System.out.println(" Marca: " + obtenerMarca());
        System.out.println("Molo: " + obtenerModelo());
        System.out.printf("Precio: $%,.2f%n", obtenerPrecio());
     
    }
}
    