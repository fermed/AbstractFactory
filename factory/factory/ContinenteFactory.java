/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.factory;

import factory.productos.Carnivoro;
import factory.productos.Herbivoro;

/**
 *
 * @author Pussy
 */
abstract public class ContinenteFactory {
    
    abstract public Herbivoro crearHerbivoro();
    abstract public Carnivoro crearCarnivoro();
}
