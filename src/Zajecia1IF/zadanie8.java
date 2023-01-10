package Zajecia1IF;
import java.util.Scanner;
public class zadanie8 {


        public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);

            System.out.println("Podaj liczbę zakupionych pakietów");
            int Pakiety = klawiatura.nextInt();
            double Rabat = 0;
            double Cena = 99;
            double CenaPoRabacie = 0;

            if(Pakiety>=10&&Pakiety<=19)
            {
                Rabat = 0.2;
                CenaPoRabacie = Cena*Pakiety-Cena*Pakiety*Rabat;
                System.out.println("Rabat wynosi: 20%");
                System.out.println("Łączna kwota zakupu wynosi: " + CenaPoRabacie);
            }
            else if(Pakiety>=20&&Pakiety<=49)
            {
                Rabat = 0.3;
                CenaPoRabacie = Cena*Pakiety-Cena*Pakiety*Rabat;
                System.out.println("Rabat wynosi: 30%");
                System.out.println("Łączna kwota zakupu wynosi: " + CenaPoRabacie);
            }
            else if(Pakiety>=50&&Pakiety<=99)
            {
                Rabat = 0.4;
                CenaPoRabacie = Cena*Pakiety-Cena*Pakiety*Rabat;
                System.out.println("Rabat wynosi: 40%");
                System.out.println("Łączna kwota zakupu wynosi: " + CenaPoRabacie);
            }
            else if(Pakiety>=100)
            {
                Rabat = 0.5;
                CenaPoRabacie = Cena*Pakiety-Cena*Pakiety*Rabat;
                System.out.println("Rabat wynosi: 50%");
                System.out.println("Łączna kwota zakupu wynosi: " + CenaPoRabacie);
            }
        }

    }
