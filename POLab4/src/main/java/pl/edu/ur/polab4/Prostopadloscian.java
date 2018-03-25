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
public class Prostopadloscian {
    public int a;
    public int b;
    public int c;
    public String nazwaFigury;

    public Prostopadloscian(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.nazwaFigury = "Prostopadloscian";
    }
    
    public void pokazWlasnosci(){
        int pole = 2*a*b + 2*b*c + 2*a*c;
        int objetosc = a*b*c; 
    System.out.println("Nazwa figury:"+nazwaFigury);
    System.out.println("Pole: "+pole);
    System.out.println("Objetosc: "+objetosc);
    
}
    
}
