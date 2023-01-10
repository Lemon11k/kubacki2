package Zajecia1IF;
import java.util.Scanner;
import java.util.Arrays;

public class zadanie7 {

    public static void main(String[] args) {


        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Podaj pierwsze imię: ");
        String imie1 = klawiatura.nextLine();
        System.out.print("Podaj drugie imię: ");
        String imie2 = klawiatura.nextLine();
        System.out.print("Podaj trzecie imię: ");
        String imie3 = klawiatura.nextLine();
        String[] imiona = {imie1, imie2, imie3};
        Arrays.sort(imiona);
        for (String name : imiona) {
            System.out.println(name);
        }
    }
}
