public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Vehículos ");
        System.out.println();
        
        
        Automovil autoEjemplo = new Automovil(
            "2020/04/10",           
            "CHS-78451",            
            "MTR-99871",            
            "Nissan",               
            "Versa",                
            72000000.0              
        );
        
 
        
        autoEjemplo.mostrarDatos();
        
        System.out.println();
        System.out.println("Acceso individual a los atributos:");
        System.out.println(" Fecha de fabricación: " + autoEjemplo.obtenerFechaFabricacion());
        System.out.println(" VIN Chasis: " + autoEjemplo.obtenerVinChasis());
        System.out.println(" VIN Motor: " + autoEjemplo.obtenerVinMotor());
        System.out.println(" Marca: " + autoEjemplo.obtenerMarca());
        System.out.println(" Modelo: " + autoEjemplo.obtenerModelo());
        System.out.printf(" Precio: $%,.2f%n", autoEjemplo.obtenerPrecio());
        
        System.out.println();
        
        
       
    }
}