/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import factory.factory.AmericaFactory;
import factory.factory.AfricaFactory;

/**
 *
 * @author Pussy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//        Carnivoro leon = new Leon();
//        Herbivoro zebra = new Zebra();
//        leon.come(zebra);
        
        MundoAnimal mundo = new MundoAnimal();
        mundo.setContinente(new AmericaFactory());
        mundo.ejecutarCadenaAlimenticia();
        
        mundo.setContinente(new AfricaFactory());
        mundo.ejecutarCadenaAlimenticia();
        
    }
}
