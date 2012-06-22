/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.productos.america;

import factory.productos.Carnivoro;
import factory.productos.Herbivoro;
import javax.swing.JOptionPane;

/**
 *
 * @author Pussy
 */
public class Lobo extends Carnivoro {

    @Override
    public String getNombre() {
        return "Ford";
    }

    @Override
    public void come(Herbivoro h) {
        JOptionPane.showMessageDialog(null, this.getNombre() + " se come a " + h.getNombre());
    }
    
}
