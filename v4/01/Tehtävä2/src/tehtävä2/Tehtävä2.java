/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä2;

import java.util.function.Function;
import java.util.stream.LongStream;
import static tehtävä2.Parallervuot.*;

/**
 *
 * @author mikko
 */
public class Tehtävä2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long N = 10_000_000L;
        
        for (int i = 0; i < N; i++) {
            taulukkoLista.add((long)i);
            linkitettyLista.add((long)i);
        }
        
        System.out.println("parallel-taulukko : " + measurePerf(Parallervuot::nelioSummaParaller, taulukkoLista));
        System.out.println("pelkkä taulukko : " + measurePerf(Parallervuot::nelioSumma, taulukkoLista));
        System.out.println("parallel-linkitetty : " + measurePerf(Parallervuot::nelioSummaParaller, linkitettyLista));
        System.out.println("pelkkä linkitetty : " + measurePerf(Parallervuot::nelioSumma, linkitettyLista));
        System.out.println("parallel-intStream : " + measurePerf(Parallervuot::intStreamNelioSummaParaller, () -> LongStream.rangeClosed(1, N)));
        System.out.println("pelkkä intStream : " + measurePerf(Parallervuot::intStreamNelioSumma, () -> LongStream.rangeClosed(1, N)));
    }
    
    public static <T, R> long measurePerf(Function<T, R> f, T input) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            R result = f.apply(input);
            long duration = (System.nanoTime() - start) / 1_000_000;
            System.out.println("Result: " + result);
            if (duration < fastest) fastest = duration;
        }
        return fastest;
    }
    
}
