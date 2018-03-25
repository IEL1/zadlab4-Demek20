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
public class Kwadrat {
    public int dlugoscBoku;
    public String nazwaFigury;
    
    
    public Kwadrat(int dlugoscBoku){
    this.dlugoscBoku = dlugoscBoku;
    this.nazwaFigury = "Kwadrat";
    
    }
public void pokazWlasnosci(){
    System.out.println("Nazwa figury:"+nazwaFigury);
    System.out.println("Pole: "+dlugoscBoku * dlugoscBoku);
    System.out.println("Obwod: "+4*dlugoscBoku);
    
}

}
