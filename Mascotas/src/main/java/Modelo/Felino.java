/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ale
 */
public class Felino extends Mascotas {
    private boolean libreToxoplasmosis;

    public Felino(String nombre, String raza, String color, int edad, boolean libreToxoplasmosis) {
        super(nombre, raza, color, edad);
        this.libreToxoplasmosis = libreToxoplasmosis;
    }

    public boolean libreToxoplasmosis() {
        return libreToxoplasmosis;
    }

    public void setLibreToxoplasmosis(boolean libreToxoplasmosis) {
        this.libreToxoplasmosis = libreToxoplasmosis;
    }

    public String toString() {
        String estado = libreToxoplasmosis ? "libre de toxoplasmosis" : "no libre de toxoplasmosis";
        return nombre + " (felino, " + raza + ", " + color + ", " + edad + " años, " + estado + ")";
    }
}
