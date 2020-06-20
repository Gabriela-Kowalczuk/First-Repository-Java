package com.company;
import java.util.Scanner;

public class zadanie1zestaw2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program porządkuje trzy wartości niemalejąco");

        System.out.println("Wpisz pierwszą liczbe rzeczywistą a");
        String pierwsza = scan.nextLine();
        double a = Double.parseDouble(pierwsza);
        System.out.println("Wpisz drugą liczbe rzeczywistą b");
        String druga = scan.nextLine();
        double b = Double.parseDouble(druga);
        System.out.println("Wpisz trzecią liczbe rzeczywistą c");
        String trzecia = scan.nextLine();
        double c = Double.parseDouble(trzecia);


        if (a < b) {
            if (b > c) {
                if (a < c) {
                    System.out.println("Liczba a " +a);
                    System.out.println("Liczba c " +c);
                    System.out.println(" Liczba b " +b);
                } else {
                    System.out.println( "Liczba c " +c);
                    System.out.println("Liczba a " +a);
                    System.out.println("Liczba b " +b);
                }
            } else {
                System.out.println( "Liczba a " + a);
                System.out.println("Liczba b  " +b);
                System.out.println("Liczba c " +c);
            }
        } else {
            if (a > c) {
                if (b < c) {
                    System.out.println( "Liczba b " +b);
                    System.out.println("Liczba c " +c);
                    System.out.println("Liczba a " +a);
                } else {
                    System.out.println( "Liczba c " +c);
                    System.out.println("Liczba b " +b);
                    System.out.println("Liczba a " +a);
                }
            } else {
                System.out.println("Liczba b  " +b);
                System.out.println("Liczba a " +a);
                System.out.println("Liczba c " +c);
            }
        }
    }
}





