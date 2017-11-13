/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v3_02_teht2;

/**
 *
 * @author mikkman
 */
public class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value)
    {
            this.trader = trader;
            this.year = year;
            this.value = value;
    }

    public Trader getTrader(){ 
            return this.trader;
    }

    public int getYear(){
            return this.year;
    }

    public int getValue(){
            return this.value;
    }

    public String toString(){
        return "{" + this.trader + ", " +
               "year: "+this.year+", " +
               "value:" + this.value +"}";
    }
}
