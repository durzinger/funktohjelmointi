/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä2;

import java.util.function.DoubleUnaryOperator;

/**
 *
 * @author mikko
 */
//mäkihyppy
public class Tehtävä2 {

    static DoubleUnaryOperator makePistelaskuri(double kPiste, double lisapisteet){
        return (pituus) -> 60 + (pituus - kPiste) * lisapisteet;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoubleUnaryOperator normaaliLahti = makePistelaskuri(90, 1.8);
        
        System.out.println(normaaliLahti.applyAsDouble(94));
    }
    
}
