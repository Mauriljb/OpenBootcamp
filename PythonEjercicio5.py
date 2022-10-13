#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Oct 13 03:11:15 2022

@author: mauriljb
"""

def esBisiesto(año):
    #Ya que el año bisiesto es divisor de 4 y ocurre cada cuatro
    #años, solo basta ver si el año es divisor de 4.
    if año%4==0:
        print("El año ",año," es bisiesto")
    else:
        print("El año ",año," NO es bisiesto")
        
esBisiesto(1996)
esBisiesto(2002)
esBisiesto(2020)
esBisiesto(2023)
esBisiesto(2024)