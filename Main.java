package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            // write your code here

            Scanner scan = new Scanner(System.in);
            System.out.println("Napisz liczbę kątów dla n>2, liczbę całkowitą");
            String katy = scan.nextLine();

            int n = Integer.valueOf(katy);
            System.out.println("Twoja liczba kątów to " + n);

            float alfa  = 360/ n;
            float beta = 360 / n;
            float gamma = 180 - beta;

            System.out.print("Kąt pomiedzy bokami wyniesie " + gamma );
            System.out.format (" degrees", gamma );
        }


    }

