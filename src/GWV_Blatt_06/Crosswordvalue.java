/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GWV_Blatt_06;

public class Crosswordvalue {

    private String word;
    private boolean used;

    public Crosswordvalue(String word) {
        this.word = word;
        used = false;
    }

   

    public String  getWord() {
        return word;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean isUsed) {
        used = isUsed;
    }
}


