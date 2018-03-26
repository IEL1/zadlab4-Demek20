/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.newpackage;

import pl.edu.ur.polab4.Student;

/**
 *
 * @author Kazik
 */
public class Studenci {
    public Student[] tablica;
    
    public Studenci(){
        tablica = new Student[100];
        
    }
        
    public void Inicjuj(){
        int i;
        for(i=0;i<100;i++){
            tablica[i] = new Student("","",0,"",0);
        }   
    }
    
    public void DodajStudenta(int indeks, Student student){
        if(indeks<0 || indeks>100){
            System.out.println("Niepoprawny indeks tablicy");
           return;
        }
        tablica[indeks] = student;
    }
    
   
    public void EdycjaDanych(int indeks, String imie, String nazwisko,  int nrIndeksu, String nazwaSpec, int rokStud){
        if(indeks<0 || indeks>100){
            System.out.println("Niepoprawny indeks tablicy");
           return;
        }
        tablica[indeks].imie = imie;
        tablica[indeks].nazwisko = nazwisko;
        tablica[indeks].nrIndeksu = nrIndeksu;
        tablica[indeks].nazwaSpec = nazwaSpec;
        tablica[indeks].rokStud = rokStud;
        
    }
    
    public void UsunDane (int indeks){
        if(indeks<0 || indeks>100){
            System.out.println("Niepoprawny indeks tablicy");
           return;
    }
        tablica[indeks].imie = "";
        tablica[indeks].nazwisko = "";
        tablica[indeks].nrIndeksu = 0;
        tablica[indeks].nazwaSpec = "";
        tablica[indeks].rokStud = 0;
    
}
    
    public void WyswietlDane(int indeks){
        if(indeks<0 || indeks>100){
            System.out.println("Niepoprawny indeks tablicy");
           return;
         }
        Student student = tablica[indeks];
        System.out.println("Imie:"+student.imie+"Nazwisko:"+student.nazwisko+"Nr indeksu:"+student.nrIndeksu+"Nazwa specjalnosci"+student.nazwaSpec+"Rok studiow:"+student.rokStud);
        
    }
    public void WyswietlWszystkieDane(){
        int i;
        for(i=0;i<100;i++){
            this.WyswietlDane(i);
            System.out.println("\n");
        }
    }
    
    public void WyswietlZakres(int indeksPoczatkowy, int indeksKoncowy){
           if(indeksPoczatkowy<0 || indeksPoczatkowy>100){
            System.out.println("Niepoprawny indeks poczatkowy tablicy");
           return;
           }
           if(indeksKoncowy<0 || indeksKoncowy>100){
            System.out.println("Niepoprawny indeks koncowy tablicy");
           return;
           }
           if (indeksPoczatkowy>indeksKoncowy){
               System.out.println("Niepoprawny zakres indeksow");
           return;
           }
           int i;
           for (i=indeksPoczatkowy; i<indeksKoncowy;i++){
               this.WyswietlDane(i);
           }
           
}

    

    
}

