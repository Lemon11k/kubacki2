package Zajecia1IF;
import java.util.Scanner;
public class zadanie5 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Podaj masę obiektu w kilogramach: ");
        double mass = klawiatura.nextDouble();
        double weight = mass * 9.8;
        System.out.printf("Ciężar obiektu wynosi %.2f niutonów.\n", weight);
        if (weight > 1000) {
            System.out.println("Obiekt jest zbyt ciężki.");
        } else if (weight >= 10) {
                System.out.println("Obiekt jest optymalnej wagi");
            } else if (weight < 10) {
                System.out.println("Obiekt jest za lekki.");
            }
        }
    }
