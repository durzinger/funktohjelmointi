/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vastuuketju;

/**
 *
 * @author mikko
 */
public class Teksti {
    
    private String teksti;
    private boolean käsitelty = false;
    
    public Teksti(String teksti) {
        this.teksti = teksti;
    }

    /**
     * @return the teksti
     */
    public String getTeksti() {
        return teksti;
    }

    /**
     * @param teksti the teksti to set
     */
    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    /**
     * @return the käsitelty
     */
    public boolean isKäsitelty() {
        return käsitelty;
    }

    /**
     * @param käsitelty the käsitelty to set
     */
    public void setKäsitelty(boolean käsitelty) {
        this.käsitelty = käsitelty;
    }
}
