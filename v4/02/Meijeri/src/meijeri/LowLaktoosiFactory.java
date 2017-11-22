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
public class LowLaktoosiFactory extends AbstractMeijeriFactory {
    
    public LowLaktoosiFactory() {
        map.put("MAITO", Maito_lowlaktoosi::new);
        map.put("JUUSTO", Juusto_lowlaktoosi::new); 
        map.put("JUGURTTI", Jugurtti_lowlaktoosi::new);
    }
    
}
