/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Kazik
 */
public class Stozek {
    public int promien;
    public int tworzaca;
    public int wysokosc;
    public String nazwaFigury;

    public Stozek(int promien, int tworzaca, int wysokosc) {
        this.promien = promien;
        this.tworzaca = tworzaca;
        this.wysokosc = wysokosc;   
        this.nazwaFigury = "Stozek";
    }
    
    public void pokazWlasnosci(){
    float pole = (float) ((3.14* Math.pow(promien,2))+(3.14*promien*tworzaca));
    float objetosc = (float) ((3.14*Math.pow(promien, 2)*wysokosc)/3);
        System.out.println("Nazwa figury"+nazwaFigury);
        System.out.println("Pole:"+pole);
        System.out.println("Objetosc:"+objetosc);
    }
    
}
