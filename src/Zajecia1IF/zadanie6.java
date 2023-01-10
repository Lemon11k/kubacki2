package Zajecia1IF;
import java.util.Scanner;
public class zadanie6 {

    public static void main(String[] args) {


            Scanner klawiatura = new Scanner(System.in);

            System.out.println("Napisz liczbe sekund");
            double sekundy = klawiatura.nextDouble();
            klawiatura.close();

            if (sekundy>=86400) {
                System.out.println(sekundy+ " sekund to "+sekundy/86400+" dni" );
            }
            else if (sekundy>=3600) {
                System.out.println(sekundy+" sekund to "+sekundy/3600+" godzin");
            }
            else if(sekundy>=60) {
                System.out.println(sekundy+" sekund to "+sekundy/60+" minuty");
            }
            else if (sekundy<60) {
                System.out.println(sekundy+" sekund");
            }
        }

    }

