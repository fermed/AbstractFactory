/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.factory;

import factory.productos.Carnivoro;
import factory.productos.Herbivoro;
import factory.productos.america.Lobo;
import factory.productos.america.Venado;

/**
 *
 * @author Pussy
 */
public class AmericaFactory extends ContinenteFactory {

    @Override
    public Herbivoro crearHerbivoro() {
        return new Venado();
    }

    @Override
    public Carnivoro crearCarnivoro() {
        return new Lobo();
    }
}
