from Vehiculo import Vehiculo

class Automovil(Vehiculo):
    def __init__(self, fecha_fabricacion, vin_chasis, vin_motor, marca, modelo, precio):
        super().__init__(fecha_fabricacion, vin_chasis, vin_motor)
        self.__marca = marca
        self.__modelo = modelo
        self.__precio = precio
    
    def obtener_marca(self):
        return self.__marca
    
    def obtener_modelo(self):
        return self.__modelo
    
    def obtener_precio(self):
        return self.__precio
    
    def mostrar_datos(self):
        print("Fecha de Fabricación:", self.obtener_fecha_fabricacion())
        print("VIN Chasis:", self.obtener_vin_chasis())
        print("VIN Motor:", self.obtener_vin_motor())
        print("Marca:", self.obtener_marca())
        print("Modelo:", self.obtener_modelo())
        print("Precio:", self.obtener_precio())