package pl.edu.ur.polab4;

import java.util.Scanner;
import pl.edu.ur.polab4.newpackage.Studenci;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        System.out.println("Podaj numer zadania (4 lub 5)");
        Scanner nr_zad = new Scanner (System.in);
        int nr = nr_zad.nextInt();
        switch (nr){
            case 4:
        System.out.println("Podaj numer figury geometrycznej\n"
                + "1 - Kwadrat\n"
                + "2 - Kolo\n"
                + "3 - Prostokat\n"
                + "4 - Szczescian\n"
                + "5 - Prostopadloscian\n"
                + "6 - Kula\n"
                + "7 - Stozek\n");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        
        switch (i){
            case 1:
        System.out.println("Podaj dlugosc boku kwadratu");
       Scanner scanner1 = new Scanner(System.in);
       int bok = scanner1.nextInt();
       
       Kwadrat kwadrat1 = new Kwadrat(bok);
       kwadrat1.pokazWlasnosci();
       break;
       
            case 2:
                System.out.println("Podaj promien kola");
                Scanner scanner2 = new Scanner(System.in);
                float promien = scanner2.nextFloat();
                Kolo kolo1 = new Kolo(promien);
                kolo1.pokazWlasnosci();
                break;
                
            case 3:
                System.out.println("Podaj a");
                Scanner scanner3 = new Scanner(System.in);
                int a = scanner3.nextInt();
                
                System.out.println("Podaj b");
                Scanner scanner4 = new Scanner(System.in);
                int b = scanner4.nextInt();
                
               Prostokat prostokat1 = new Prostokat(a,b);
               prostokat1.pokazWlasnosci();
               break;
               
            case 4:
                System.out.println("Podaj dlugosc boku");
                Scanner scanner5 = new Scanner(System.in);
                float a1 = scanner5.nextInt();
                
                Szescian szescian1 = new Szescian(a1);
                szescian1.pokazWlasnosci();
                break;
                
            case 5:
                System.out.println("Podaj dlugosc boku a (podstawa)");
                Scanner scanner6 = new Scanner(System.in);
                int a2 = scanner6.nextInt();
                
                System.out.println("Podaj dlugosc boku b (podstawa)");
                Scanner scanner7 = new Scanner(System.in);
                int b2 = scanner7.nextInt();
                
                System.out.println("Podaj dlugosc boku cc (wysokosc)");
                Scanner scanner8 = new Scanner(System.in);
                int c2 = scanner8.nextInt();
                
                Prostopadloscian prostopadloscian1 = new Prostopadloscian (a2,b2,c2);
                prostopadloscian1.pokazWlasnosci();
                break;
                
            case 6:
                System.out.println("Podaj promien kuli");
                Scanner scanner9 = new Scanner(System.in);
                int R = scanner9.nextInt();
                
                Kula kula1 = new Kula(R);
                kula1.pokazWlasnosci();
                break;
                
            case 7:
                System.out.println("Podaj promien podstawy stozka");
                Scanner scanner10 = new Scanner(System.in);
                int R1 = scanner10.nextInt();
                
                System.out.println("Podaj tworzaca stozka");
                Scanner scanner11 = new Scanner(System.in);
                int l = scanner11.nextInt();
                
                System.out.println("Podaj wysokosc stozka");
                Scanner scanner12 = new Scanner(System.in);
                int H = scanner12.nextInt();
                
                Stozek stozek1 = new Stozek(R1, l, H);
                stozek1.pokazWlasnosci();
                break;
                
                
                
                
                
                
    }
        break;
        
            case 5:
            {
                Studenci studenci = new Studenci();
                
                Boolean petla = true;
                while(petla){
                System.out.println("Zarzadzanie tablica studentow");
                System.out.println("1 - utworz tablice");
                System.out.println("2 - wprowadz dane studenta");
                System.out.println("3 - edycja danych studenta");
                System.out.println("4 - usuniecie danych studenta");
                System.out.println("5 - wyswietl dane studenta");
                System.out.println("6 - wyswietl dane wszystkich studentow");
                System.out.println("7 - wyswietl dane z zakresu");
                System.out.println("8 - wyjscie");
                Scanner nrOpcji = new Scanner (System.in);
                int nr_opcji = nrOpcji.nextInt();
                
                switch(nr_opcji){
                    case 1:
                        studenci.Inicjuj();
                        break;
                    case 2:
                        System.out.println("Podaj indeks");
                        Scanner indeks = new Scanner(System.in);
                        int j = indeks.nextInt();
                        
                        System.out.println("Podaj imie");
                        Scanner imie = new Scanner(System.in);
                        String imie1 = imie.next();
                        
                        System.out.println("Podaj nazwisko");
                        Scanner nazwisko = new Scanner(System.in);
                        String nazwisko1 = nazwisko.next();
                        
                        System.out.println("Podaj nr indeksu");
                        Scanner numerIndeksu = new Scanner(System.in);
                        int numerIndeksu1 = numerIndeksu.nextInt();
                        
                        System.out.println("Podaj nazwe specjalnosci");
                        Scanner nazwaSpecjalnosci = new Scanner(System.in);
                        String nazwaSpecjalnosci1 = nazwaSpecjalnosci.next();
                        
                        System.out.println("Podaj rok studiow");
                        Scanner rokStudiow = new Scanner(System.in);
                        int rokStudiow1 = rokStudiow.nextInt();
                        
                        studenci.DodajStudenta(j, new Student(imie1, nazwisko1, numerIndeksu1, nazwaSpecjalnosci1, rokStudiow1));
                        break;
                    case 3:
                        System.out.println("Podaj indeks");
                        Scanner in = new Scanner(System.in);
                        int in1 = in.nextInt();
                        
                        System.out.println("Podaj imie");
                        Scanner imie2 = new Scanner(System.in);
                        String imie22 = imie2.next();
                        
                        System.out.println("Podaj nazwisko");
                        Scanner nazwisko2 = new Scanner(System.in);
                        String nazwisko22 = nazwisko2.next();
                        
                        System.out.println("Podaj nr indeksu");
                        Scanner numerIndeksu2 = new Scanner(System.in);
                        int numerIndeksu22 = numerIndeksu2.nextInt();
                        
                        System.out.println("Podaj nazwe specjalnosci");
                        Scanner nazwaSpecjalnosci2 = new Scanner(System.in);
                        String nazwaSpecjalnosci22 = nazwaSpecjalnosci2.next();
                        
                        System.out.println("Podaj rok studiow");
                        Scanner rokStudiow2 = new Scanner(System.in);
                        int rokStudiow22 = rokStudiow2.nextInt();
                        
                        
                        studenci.EdycjaDanych(in1,imie22, nazwisko22, numerIndeksu22, nazwaSpecjalnosci22, rokStudiow22);
                        break;
                        
                    case 4:
                        System.out.println("Podaj indeks");
                        Scanner indeks2 = new Scanner(System.in);
                        int indeks22 = indeks2.nextInt();
                        studenci.UsunDane(indeks22);
                        break;
                        
                    case 5:
                        System.out.println("Podaj indeks");
                        Scanner indeks3 = new Scanner(System.in);
                        int indeks33 = indeks3.nextInt();
                       studenci.WyswietlDane(indeks33);
                        break;
                        
                    case 6:
                        studenci.WyswietlWszystkieDane();
                        break;
                        
                    case 7:
                        System.out.println("Podaj indeks poczatkowy");
                        Scanner indeksPocz = new Scanner(System.in);
                        int indeksPocz1 = indeksPocz.nextInt();
                        
                        System.out.println("Podaj indeks koncowy");
                        Scanner indeksKon = new Scanner(System.in);
                        int indeksKon1 = indeksKon.nextInt();
                        
                        studenci.WyswietlZakres(indeksPocz1, indeksKon1);
                        break;
                        
                    case 8:
                        petla = false;
                        break;
                     
                }
            }
                
            }
                
               
               
    } 
}
}
