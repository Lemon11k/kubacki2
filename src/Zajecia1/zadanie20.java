package Zajecia1;
import java.util.Scanner;


public class zadanie20 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println ("Prosze podac liczbe oczekiwanych ciasteczek ") ;
        double ilosc = klawiatura.nextDouble();
        klawiatura.nextLine();

        double cukru=1.5/48*ilosc;
        double masla=1.0/48*ilosc;
        double maki=2.75/48*ilosc;

 // System.out.println("Potrzebujesz "+cukru+"g cukru");
 // System.out.println("Potrzebujesz "+masla+"g masla");
 //  System.out.println("Potrzebujesz "+maki+"g maki");


        System.out.print("Potrzebujesz ");
        System.out.printf("%.2f", cukru);
        System.out.println("g cukru");

        System.out.print("Potrzebujesz ");
        System.out.printf("%.2f", masla);
        System.out.println("g masla");

        System.out.print("Potrzebujesz ");
        System.out.printf("%.2f", maki);
        System.out.println("g maki");

    }
}



//W przepisie na ciasteczka podana jest następująca ilość składników:
//1,5 szklanki cukru,
//1 szklanka masła,
//2,75 szklanki mąki.
//Te składniki pozwalają upiec 48 ciasteczek. Napisz program, który wyświetla
//użytkownikowi prośbę o wpisanie oczekiwanej liczby ciasteczek, a następnie
//informuje, ile szklanek poszczególnych składników potrzeba do uzyskania tej liczby