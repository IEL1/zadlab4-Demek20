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
public class Kolo {
    public String nazwaFigury;

    /**
     *
     */
    public float promien;

   
    public Kolo(float promien){
    this.promien = promien;
    this.nazwaFigury = "Kolo";
    }

    
public void pokazWlasnosci(){
    //float pole = (float) (3.14 * Math.pow(promien,2));
    //float obwod = (float) (2*3.14*promien);
    System.out.println("Nazwa figury:"+nazwaFigury);
    System.out.println("Pole: "+3.14 * Math.pow(promien,2));
    System.out.println("Obwod: "+2*3.14*promien);
    
}
}
