/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meijeri;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
/**
 *
 * @author mikko
 */
public class AbstractMeijeriFactory {
    
    Map<String, Supplier<Tuote_IF>> map;
    //Map<String, Supplier<Juusto_IF>> juustoMap;
    //Map<String, Supplier<Jugurtti_IF>> jugurttiMap;
    
    public AbstractMeijeriFactory() {
        map = new HashMap<>();
    }
    
    public Tuote_IF getTuote(String tuoteTyyppi){
        Supplier<Tuote_IF> tuote = map.get(tuoteTyyppi.toUpperCase());
        if(tuote != null) {
            return tuote.get();
        }
        throw new IllegalArgumentException("No such shape " + tuoteTyyppi.toUpperCase());
    }
}
