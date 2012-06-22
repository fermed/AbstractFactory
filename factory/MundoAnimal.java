/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import factory.productos.Herbivoro;
import factory.productos.Carnivoro;
import factory.factory.ContinenteFactory;

/**
 *
 * @author Pussy
 */
public class MundoAnimal {
    private Herbivoro h;
    private Carnivoro c;
    
    public void setContinente(ContinenteFactory continente){
        h = continente.crearHerbivoro();
        c = continente.crearCarnivoro();
    }
    
    public void ejecutarCadenaAlimenticia(){
        c.come(h);
    }
}
