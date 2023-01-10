package Zajecia1;
import java.util.Scanner;

public class zadanie13 {

    public static void main(String[] args) {

        double a = 75;

        Scanner key = new Scanner(System.in);

        System.out.println("Podaj liczbe zjedzonych ciasteczek: ");
        double c = key.nextDouble();

        double wynik = c*a;

        System.out.println("Zjadłeś: " +wynik  +"Kalorii");

    }

}
//Pudełko zawiera 40 ciasteczek. Z informacji na opakowaniu wynika, że pudełko
//obejmuje 10 porcji, a każda porcja ma 300 kalorii. Napisz program, który pozwala
//użytkownikowi wpisać liczbę zjedzonych ciasteczek, a następnie informuje o liczbie
//skonsumowanych kalorii.