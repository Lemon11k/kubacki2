
package Zajecia1;
import java.util.Scanner;

public class zadanie21 {


    public static void main(String[] args) {

        Scanner klawiatura=new Scanner(System.in);

        System.out.println ("Kwota pierwotna na koncie: ") ;
        double P = klawiatura.nextDouble();

        System.out.println ("Roczna stopa oprocentowania: ") ;
        double r = klawiatura.nextDouble()/100;

        System.out.println ("liczbe odsetek: ") ;
        double n = klawiatura.nextDouble();

        System.out.println ("Liczbe lat: ") ;
        double t = klawiatura.nextDouble();
        klawiatura.close();

        double A = (1 +r/n);
        double B = (n*t);
        double C = Math.pow(A, B);
        double D = P * C;


        System.out.println ("Kwota pieniedzy na koncie to: " +D );
    }

}


//Gdy bank wypłaca procent składany, płaci odsetki nie tylko od zdeponowanej kwoty,
//ale też od zakumulowanej z czasem kwoty odsetek. Załóżmy, że chcesz zdeponować
//pewną kwotę na rachunku oszczędnościowym i pozwolić na akumulowanie procentu
//składanego przez określoną liczbę lat. Oto wzór na obliczenie stanu konta po
//określonej liczbie lat:
//A = P(1 +r/n)nt
//Oto wartości z tego wzoru:
//A to kwota pieniędzy na koncie po określonej liczbie lat,
//P to kwota pierwotnie zdeponowana na koncie,
//r to roczna stopa oprocentowania,
//n określa, ile razy w roku odsetki są doliczane do kapitału,
//t to liczba lat.
//Napisz program, który przeprowadza takie obliczenia. Program powinien wyświetlać
//prośbę o wprowadzenie następujących danych:
//kwoty pieniędzy początkowo zdeponowanej na koncie,
//rocznej stopy oprocentowania,
//ile razy w roku odsetki są kapitalizowane (np. przy kapitalizacji miesięcznej wpisz 12,
//a przy kapitalizacji kwartalnej — 4),
//liczby lat, przez jakie środki będą znajdować się na koncie i generować odsetki.
//Po wprowadzeniu danych wejściowych program powinien obliczać i wyświetlać
//kwotę, jaka znajdzie się na koncie po określonej liczbie lat.