package Zajecia1IF;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj swoja wage w kg");
        double waga=klawiatura.nextDouble();

        System.out.println("Podaj swoj wzrost w cm");
        double wzrost=klawiatura.nextDouble()/100;

        double BMI=waga/Math.pow(wzrost, 2);


        System.out.println("Twoje BMI to: "+BMI);
        if(BMI>25) {
            System.out.println("Masz nadwage");

        }
        else if (BMI>18.5 && BMI<25) {
            System.out.println("Masz prawidlową wage");
        }
        else if (BMI<18.5) {
            System.out.println("Masz niedowage");
        }
    }
}
