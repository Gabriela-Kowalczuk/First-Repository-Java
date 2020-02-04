package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("Napisz sumę, liczbę rzeczywistą");
        String suma = scan.nextLine();

        System.out.println("Napisz różnicę, liczbę rzeczywistą");
        String roznica = scan.nextLine();

        Double s = Double.valueOf(suma);
        System.out.println("Twoje suma to " +s);

        Double r = Double.valueOf(roznica);
        System.out.println("Twoja różnica to " +r );

        double a=(s+r)/2;
        double b=s-a;

        System.out.println("Uzyskane a to " + a);
        System.out.println("Uzyskane b to "+ b);

    }
}
