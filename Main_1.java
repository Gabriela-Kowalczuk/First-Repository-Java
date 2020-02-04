package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
    System.out.println("Napisz a, liczbę rzeczywistą");
    String pierwsza = scan.nextLine();


    System.out.println("Napisz b, liczbę rzeczywistą");
    String druga = scan.nextLine();

    float a = Float.valueOf(pierwsza);
    System.out.println("Twoja pierwsza liczba to " +a);

    float b = Float.valueOf(druga);
    System.out.println("Twoja druga liczba to " +b);

    float x=(-b)/a;
    System.out.println("Szukane x to " +x);

        }
    }

