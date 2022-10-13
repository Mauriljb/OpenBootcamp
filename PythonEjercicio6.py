#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Oct 13 20:21:50 2022

@author: mauriljb
"""

class Vehiculo:
    color=""
    ruedas=0
    puertas=0
    
class Coche(Vehiculo):
    velocidad=0.0
    cilindrada=0.0
    
coche=Coche()
coche.color="verde"
coche.puertas=3
coche.ruedas=4
coche.cilindrada=1.8
coche.velocidad=120

print("Color: ",coche.color)
print("Puertas: ",coche.puertas)
print("Ruedas: ",coche.ruedas)
print("Cilindrada: ",coche.cilindrada)
print("Velocidad: ", coche.velocidad)
    