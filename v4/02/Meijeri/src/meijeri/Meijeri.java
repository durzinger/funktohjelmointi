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
public class Meijeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractMeijeriFactory laktoositon = new LaktoositonFactory();
        AbstractMeijeriFactory vähälaktoosinen = new LowLaktoosiFactory();
        
        Tuote_IF maito1 = laktoositon.getTuote("maito");
        
        Tuote_IF juusto1 = vähälaktoosinen.getTuote("juusto");
        
        maito1.tee();
        
        juusto1.tee();
    }
    
}
