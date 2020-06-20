package com.company;
import java.util.Scanner;

public class zestaw2Zad4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Program oblicza liczbe dni w miesiącu");
        System.out.println("Wpisz rok jako liczbe całkowitą większą wiekszą od zera");

        String year = scan.nextLine();
        int r = Integer.parseInt(year);

        System.out.println("Wpisz miesiąc jako liczbe całkowitą od 1 do 12");
        String month = scan.nextLine();
        int m = Integer.parseInt(month);


            if ( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                System.out.println("Ten miesiąc ma 31 dni");
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                System.out.println("Ten miesiąc ma 30 dni");
            } else {
                if (m == 2 && r % 4 == 0 && r % 100 != 0 || r % 400 == 0) {
                    System.out.println("Ten miesiąc ma 29 dni");
                } else {
                    System.out.println("Ten miesiąc ma 28 dni");
                }
            }
        }
    }













