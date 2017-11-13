/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_02_teht2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;

import static java.util.Comparator.comparing;
import java.util.concurrent.ThreadLocalRandom;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static v3_02_teht2.Dish.menu;
/**
 *
 * @author mikkman
 */
interface FahrenheitToCelcius {
    double convert(double input);
}

interface CalculateArea {
    double clc(double input);
}


public class V3_02_teht2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
	List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );
        
        System.out.println("Tehtävä 1.\n");
        
        FahrenheitToCelcius toCelcius = input -> (input - 32) * 5/9;
        System.out.println("90 F on " + toCelcius.convert(90) +  " C");
        
        CalculateArea calcArea = input -> input * input * Math.PI;
        System.out.println(60);
        
        System.out.println("Tehtävä 2.\n");
        
        List<Transaction> tr2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() >= 2012 && transaction.getValue() >= 900)
                .collect(toList());
        System.out.println(tr2011);
        
        int lkm = menu.stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b);
        System.out.println(lkm);
        
        System.out.println("Tehtävä 3.\n");
        
        int kutoset = Stream.generate(() -> Math.random() * 5 + 1)
                .limit(20)
                .map(n -> (int) Math.round(n))
                .filter(n -> n == 6)
                .mapToInt(i -> 1)
                .reduce(0, (a, b)-> a + b);
        System.out.println(kutoset);
        
        System.out.println("Tehtävä 4.\n");
        
        List<Integer> alist = Arrays.asList(2, 3, 4);
        List<Integer> blist = Arrays.asList(5, 6, 7, 8);
        
        ArrayList<IntPari> parit;
        parit = (ArrayList<IntPari>) alist.stream()
                .flatMap(a -> blist.stream()
                    .map(b -> new IntPari((int) a, (int) b)))
                .collect(toList());
        
        parit.forEach(a -> System.out.println(a.a + " " + a.b));
        

        System.out.println("Tehtävä 5.\n");
        
        Map<String, Integer> sanat = Files.lines(Paths.get("kalevala.txt"), Charset.defaultCharset())
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(w -> w.replaceAll("[^a-öA-Ö]", "").toLowerCase())
                .map(w -> new SimpleEntry<>(w, 1))
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (v1, v2) -> v1 + v2));
        sanat.forEach((k, v) -> System.out.println(String.format("%s : %d", k, v)));
        
    }
}
