package Zajecia1;
import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Podaj nazwe ulubionego miasta: ");
        String m = key.nextLine();
        int d = m.length();
        char a = m.charAt(0);
        String male = m.toLowerCase();
        String duze = m.toUpperCase();


        System.out.println("Liczba znaków to: " + d + "\nMIASTO " + duze + "\nmiasto " + male + "\npierwszy znak to: " + a);
    }

}

//. Napisz program, który wyświetla użytkownikowi prośbę o wprowadzenie nazwy
//ulubionego miasta. Dane wejściowe zapisz w zmiennej typu String. Program
//powinien wyświetlać następujące informacje:
//liczbę znaków w nazwie miasta,
//nazwę miasta zapisaną wielkimi literami,
//nazwę miasta zapisaną małymi literami,
//pierwszy znak nazwy miasta.