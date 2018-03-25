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
public class Szescian {
    public float a;
    public String nazwaFigury;
    
    public Szescian(float a){
    this.a = a;
    this.nazwaFigury = "Szescian";
    }
    
    public void pokazWlasnosci(){
    float objetosc = (float) Math.pow(a, 3);
        System.out.println("Nazwa figury"+nazwaFigury);
        System.out.println("Objetosc:"+objetosc);
    }
}
