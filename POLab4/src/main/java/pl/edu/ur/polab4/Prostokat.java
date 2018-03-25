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
public class Prostokat {
    public String nazwaFigury;
    public int a;
    public int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
        this.nazwaFigury = "Prostokat";
    }
    
    public void pokazWlasnosci(){
    int pole = a*b;
    int obwod = 2*a + 2*b;
        System.out.println("Nazwa figury"+nazwaFigury);
        System.out.println("Pole:"+pole);
        System.out.println("Obwod:"+obwod);
    }
}
