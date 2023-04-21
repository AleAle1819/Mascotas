/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author Ale
 */
public class Canino extends Mascotas {
    private int nivelEntrenamiento;

    public Canino(String nombre, String raza, String color, int edad, int nivelEntrenamiento) {
        super(nombre, raza, color, edad);
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }
    
    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public String toString() {
        return nombre + " (canino, " + raza + ", " + color + ", " + edad + " años, nivel de entrenamiento: " + nivelEntrenamiento + ")";
    }
}

