/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä3;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 *
 * @author mikko
 */
public class Tehtävä3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntStream lottorivi = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(1, 42))
                .distinct()
                .limit(7);
        lottorivi.forEach(numero -> System.out.println(numero));
        
        Arvonta arvonta = () -> IntStream.generate(
                () -> ThreadLocalRandom.current().nextInt(1, 42))
                .distinct()
                .limit(7);
        arvonta.arvorivi().forEach(numero -> System.out.println(numero));
    }
    
}
