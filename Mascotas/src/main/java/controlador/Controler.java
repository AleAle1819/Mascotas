 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controlador;
import Modelo.Mascotas;
import Modelo.Canino;
import Modelo.Felino;
import java.util.ArrayList;

/**
 *
 * @author Ale
 */
public class Controler {
    private ArrayList<Mascotas> mascotas;

    public Controler(){
        mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascotas mascota) {
        mascotas.add(mascota);
    }

    public void eliminarMascota(Mascotas mascota) {
        mascotas.remove(mascota);
    }

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public int cantidadFelinos() {
        int cantidad = 0;
        for (Mascotas mascota : mascotas) {
            if (mascota instanceof Felino) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public int cantidadCaninos() {
    int cantidad = 0;
    for (Mascotas mascota : mascotas) {
        if (mascota instanceof Canino) {
            cantidad++;
        }
    }
    return cantidad;
}

public double edadPromedio() {
    double sumaEdades = 0;
    for (Mascotas mascota : mascotas) {
        sumaEdades += mascota.getEdad();
    }
    if (mascotas.size() == 0) {
        return 0;
    } else {
        return sumaEdades / mascotas.size();
    }
  }
}

