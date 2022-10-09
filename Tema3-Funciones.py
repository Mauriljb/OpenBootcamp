# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

def suma(a,b,c):
    sum=a+b+c
    return(sum)

print(suma(3, 2, 5))



class Coche:
    def __init__(self , puertas):
        self.puertas = puertas
        
    def aumentar_una_puerta(self):
        self.puertas=self.puertas + 1
        
miCoche = Coche(3)
print(miCoche.puertas)
miCoche.aumentar_una_puerta()
print(miCoche.puertas)