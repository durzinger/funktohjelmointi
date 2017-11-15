/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä1;

import java.util.function.IntSupplier;

/**
 *
 * @author mikko
 */
public class Tehtävä1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IntSupplier generaattori1 = () -> 2;
        
        IntSupplier generaattori2 = () -> (int) (Math.random() * 6 + 1);
        
        Tulostaja t = new Tulostaja();
        
        
        t.tulosta(generaattori1);
        t.tulosta(generaattori2);
        t.tulosta(()->100);
    }
    
}
