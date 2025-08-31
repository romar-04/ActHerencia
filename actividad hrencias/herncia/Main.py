from Automovil import Automovil

if __name__ == "__main__":
    auto_1 = Automovil("2020/04/10", "CHS-78451", "MTR-99871", "Nissan", "Versa", 72000000)
    
    auto_1.mostrar_datos()
    
    print("\nAcceso individual:")
    print("Fecha:", auto_1.obtener_fecha_fabricacion())
    print("Chasis:", auto_1.obtener_vin_chasis())
    print("Motor:", auto_1.obtener_vin_motor())
    print("Marca:", auto_1.obtener_marca())
    print("Modelo:", auto_1.obtener_modelo())
    print("Precio:", auto_1.obtener_precio())