/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Canino;
import Modelo.Felino;
import controlador.Controler;

/**
 *
 * @author Ale
 */
public class Pagina {
    public static void main(String[] args) {   
    Controler controlador= new Controler();
    
    Canino canino1 = new Canino("Firulais", "Labrador", "Café", 3, 7);
    Felino felino1 = new Felino("Gato", "Siames", "Blanco", 2, true);
    controlador.agregarMascota(canino1);
    controlador.agregarMascota(felino1);
    
    controlador.cantidadFelinos();
    controlador.cantidadCaninos();
    controlador.edadPromedio();
    controlador.eliminarMascota(canino1);
    }
}
