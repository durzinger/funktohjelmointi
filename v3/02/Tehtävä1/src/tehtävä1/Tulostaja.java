/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä1;

/**
 *
 * @author mikko
 */
import java.util.function.IntSupplier;


public class Tulostaja{
    
    public void tulosta(IntSupplier source){
        System.out.println(source.getAsInt());
    }
    
}

