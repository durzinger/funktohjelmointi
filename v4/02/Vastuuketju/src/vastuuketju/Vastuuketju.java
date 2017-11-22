/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vastuuketju;

import java.util.function.Function;
import java.util.function.UnaryOperator;
/**
 *
 * @author mikko
 */
public class Vastuuketju {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UnaryOperator<Teksti> poistavälilyöntivirheet =
                (Teksti t) ->
                {
                    String newSting = t.getTeksti().replaceAll("\\s+", " ");
                    t.setTeksti(newSting);
                    return t;
                };
                
                        
        
        
        UnaryOperator<Teksti> korvaaskandit = 
                (Teksti t) -> 
                  {
                    String newSting = t.getTeksti().replace("ä", "a").replace("Ä", "A").replace("ö", "o").replace("Ö", "O");
                    t.setTeksti(newSting);
                    return t;
                };
                
        UnaryOperator<Teksti> korjaastruct =
                (Teksti t) ->
               {
                    String newSting = t.getTeksti().replace("sturct", "struct");
                    t.setTeksti(newSting);
                    return t;
                };
        
        Function<Teksti, Teksti> ketju = poistavälilyöntivirheet.andThen(korvaaskandit).andThen(korjaastruct); 
        
        Teksti t = new Teksti("Tämä on esimerkkiteksti, jossa on  välilyöntivirheitä ja ääkkösiä ja kirjoitusvirheenä sturct sana");
        
        t = ketju.apply(t);
        
        System.out.println(t.getTeksti());
    }
    
}
