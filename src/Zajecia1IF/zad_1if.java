package Zajecia1IF;

import java.util.Scanner;
public class zad_1if {

    public static void main(String[] args) {


        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbe od 1 do 10: ");
        int liczba=klawiatura.nextInt();
        klawiatura.close();
        String liczbarz;

        switch (liczba) {
            case 1:  liczbarz ="I";
                break;
            case 2:  liczbarz ="II";
                break;
            case 3:  liczbarz = "III";
                break;
            case 4: liczbarz="IV";
                break;
            case 5:  liczbarz ="V";
                break;
            case 6:  liczbarz = "VI";
                break;
            case 7:  liczbarz = "VII";
                break;
            case 8:  liczbarz= "VIII";
                break;
            case 9:   liczbarz= "IX";
                break;
            case 10:  liczbarz= "X";
                break;

            default: liczbarz= "Zła liczba";
                break;
        }
        System.out.println("Ta liczba po rzymsku to  " +liczbarz);

    }

}