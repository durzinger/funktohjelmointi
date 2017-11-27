/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meijeri;

/**
 *
 * @author mikko
 */
public class LaktoositonFactory extends AbstractMeijeriFactory {
    
    public LaktoositonFactory() {
        map.put("MAITO", Maito_laktoositon::new);
        map.put("JUUSTO", Juusto_laktoositon::new);
        map.put("JUGURTTI", Jugurtti_laktoositon::new);
    }
}
