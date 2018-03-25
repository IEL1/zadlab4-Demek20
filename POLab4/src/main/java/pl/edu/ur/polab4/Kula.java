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
public class Kula {
    public String nazwaFigury;
    public int promien;

    public Kula(int promien){
    this.promien = promien;
    this.nazwaFigury = "Kula";
    }
    
    public void pokazWlasnosci(){
    float pole = (float) (4*3.14*Math.pow(promien, 2));
    float objetosc = (float) (4*(3.14*Math.pow(promien, 3))/3);
        System.out.println("Nazwa figury:"+nazwaFigury);
        System.out.println("Pole:"+pole);
        System.out.println("Objetosc:"+objetosc);
    }
}

