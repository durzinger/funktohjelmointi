/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * @author mikko
 */
public class Parallervuot {
    
    static ArrayList<Long> taulukkoLista = new ArrayList<>();
    static LinkedList<Long> linkitettyLista = new LinkedList<>();
    
    
    public static long nelioSummaParaller(List<Long> input) {
        return input.parallelStream()
                .map(x -> x * x)
                .reduce( (long) 0, (acc, x) -> acc + x);
    }
    
    public static long nelioSumma(List<Long> input) {
        return input.stream()
                .map(x -> x * x)
                .reduce((long) 0, (acc, x) -> acc + x);
    }
    
    
    public static long intStreamNelioSummaParaller(Supplier<LongStream> input) {
            return input.get()
                .parallel()
                .map(x -> x * x)
                .reduce( (long) 0, (acc, x) -> acc + x);
    }
    
        public static long intStreamNelioSumma(Supplier<LongStream> input) {
            return input.get()
                .map(x -> x * x)
                .reduce( (long) 0, (acc, x) -> acc + x);
    }
}
