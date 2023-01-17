package Zajecia2;

import java.util.Scanner;

public class zadanie1 {

        public static void main(String[] args) {
            boolean twierdzenie =true;
            Scanner scan = new Scanner(System.in);
            int liczba;

            while (twierdzenie) {

                System.out.println("Podaj liczbę 10-24");
                liczba= scan.nextInt();

                if(liczba<10||liczba>124) {
                    twierdzenie = false;
                }else {
                    twierdzenie = true;

                }

                System.out.println("Podałeś "+ liczba);


            }
            System.out.println("Liczba spoza zakresu.");
        }
    }


