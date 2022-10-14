#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Oct 13 20:50:34 2022

@author: mauriljb
"""

class Alumno:
    nombre=""
    nota=0.0
    apobo=""

    def __init__(self,nombre,nota):
         self.nombre=nombre
         self.nota=nota
    
    def Aprobo(self,nota,aprobo):
        if float(self.nota)<4:
            aprobo="Desaprobado"
            
        else:
            aprobo="Aprobado"
        print("Condición del alumno: ",aprobo)
        
    
alumno=Alumno("Carlos",3.18)
print("Nombre del alumno: ",alumno.nombre)
print("Nota del alumno: ",alumno.nota)
alumno.Aprobo(alumno.nombre,alumno.nota)

alumno2=Alumno("Luis", 9.54)
print("Nombre del alumno: ",alumno2.nombre)
print("Nota del alumno: ",alumno2.nota)
alumno2.Aprobo(alumno2.nombre,alumno2.nota)