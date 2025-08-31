class Vehiculo:
    def __init__(self, fecha_fabricacion, vin_chasis, vin_motor):
        self.__fecha_fabricacion = fecha_fabricacion
        self.__vin_chasis = vin_chasis
        self.__vin_motor = vin_motor
    
    def obtener_fecha_fabricacion(self):
        return self.__fecha_fabricacion
    
    def obtener_vin_chasis(self):
        return self.__vin_chasis
    
    def obtener_vin_motor(self):
        return self.__vin_motor