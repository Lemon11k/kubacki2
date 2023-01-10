package Zajecia1IF;
import java.util.Scanner;

public class zadanie2 {


    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj dzien w postaci liczby");
        int dzien=klawiatura.nextInt();

        System.out.println("Podaj miesiąc w postaci liczby: ");
        int miesiac=klawiatura.nextInt();

        System.out.println("Podak 2 ostatnie cyfry roku:");
        int rok=klawiatura.nextInt();
        klawiatura.nextLine();

        int data=dzien*miesiac;

        if(data==rok) {
            System.out.println("Data jest magiczna");

        }
        else {
            System.out.println("Data nie jest magiczna");
        }
    }

}

