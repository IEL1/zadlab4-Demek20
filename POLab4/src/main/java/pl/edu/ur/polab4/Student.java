/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;

/**
 *
 * @author Kazik
 */
public class Student {
    
    public String imie;
    public String nazwisko;
    public int nrIndeksu;
    public String nazwaSpec;
    public int rokStud;

    public Student(String imie, String nazwisko, int nrIndeksu, String nazwaSpec, int rokStud) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.nazwaSpec = nazwaSpec;
        this.rokStud = rokStud;
    }

    Student(Scanner imie, Scanner nazwisko, Scanner numerIndeksu, Scanner nazwaSpecjalnosci, Scanner rokStudiow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
    
   
}
