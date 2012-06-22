/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.factory;

import factory.productos.*;
import factory.productos.africa.*;

/**
 *
 * @author Pussy
 */
public class AfricaFactory extends ContinenteFactory {

    @Override
    public Herbivoro crearHerbivoro() {
        return new Zebra();
    }

    @Override
    public Carnivoro crearCarnivoro() {
        return new Leon();
    }
    
    
    
}
